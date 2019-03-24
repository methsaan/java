import java.io.*;
import java.util.*;

public class eval {
	public static void main(String []args) throws IOException{
		Scanner input = new Scanner(System.in);	
		int lines = 10000;
		String code = "";
		String exit = "Object[] val = {q()};";
		String[] declarations = new String[500];
		int deccnt = 0;
		String[] statements = new String[20];
		ProcessBuilder pb = new ProcessBuilder("./script");
		pb.inheritIO();
		pb.directory(new File("/home/test/programming/java/usefulprograms/"));
		System.out.print("Java code evaluator.\nType \"q()\" to  quit\nevalfile.java # ");
		while (!code.equals(exit)) {
			String value = input.nextLine();
			if (!(value.contains("|"))) {
				if (!(value.contains(";"))) {
					code = "Object[] val = {" + value + "};";
				}else {
					code = "Object[] val = " + statementToArr(value) + ";";
				}
				if (first(numOfParen(code)) != last(numOfParen(code)) || numOfQuotes(code)%2 != 0) {
					do {
						System.out.print("> ");
						value += input.nextLine();
						code = "Object[] val = " + statementToArr(value) + ";";
					} while (first(numOfParen(code)) != last(numOfParen(code)) || numOfQuotes(code)%2 != 0);
				}
			}else {
				String temp = "";
				int statementcnt = 0;
				for (int x = 0; x < value.length(); x++) {
					temp += value.substring(x, x+1);
					if (value.substring(x, x+1).equals("|")) {
						statements[statementcnt] = temp;
						temp = "";
						statementcnt++;
					}
				}
				for (int x = 0; x < statementcnt; x++) {
					if (isDeclaration(statements[x]) && numOfPipes(value) == 1) {
						declarations[deccnt] = statements[x];
						deccnt++;
					}
				}
				code = "";
				if (numOfPipes(value) == 1) {
					for (int x = 0; x < deccnt; x++) {
						code += pipeToSemi(declarations[x]);
					}
					if (!isDeclaration(value)) {
						code += pipeToSemi(value);
					}
				}else {
					code = pipeToSemi(value);
				}
			}
			BufferedWriter out = new BufferedWriter(new FileWriter("evalfile.java"));
			ProcessBuilder shell = new ProcessBuilder();
			out.write("import java.io.*;\n"); 
			out.write("import java.lang.*;\n"); 
			out.write("import java.util.*;\n\n"); 
			out.write("public class evalfile {;\n");
			out.write("\tpublic static void main(String[] args) throws IOException {\n");
			out.write("\t\ttry {\n");
			out.write("\t\t\t" + code + "\n");
			if (!(value.contains("|"))) {
				out.write("\t\t\tfor (int x = 0; x < val.length; x++) {\n");
				out.write("\t\t\t\tSystem.out.println(val[x].toString());\n");
				out.write("\t\t\t}\n");
			}
			out.write("\t\t}catch (Exception e) {\n");
			out.write("\t\t\tSystem.out.println(e.getMessage());\n");
			out.write("\t\t}\n");
			out.write("\t}\n");
			out.write("\tpublic static String q() {\n");
			out.write("\t\treturn \"Error: running outside of eval\";\n");
			out.write("\t}\n");
			out.write("\tpublic static void clear() {\n");
			out.write("\t\tSystem.out.print(\"\\033[H\\033[2J\");\n");
			out.write("\t}\n");
			out.write("\tpublic static void run(String x) throws IOException {\n");
			out.write("\t\tBufferedWriter out = new BufferedWriter(new FileWriter(\"runscript\"));\n");
			out.write("\t\tProcessBuilder shell = new ProcessBuilder();\n");
			out.write("\t\tout.write(x);\n");
			out.write("\t\tout.close();\n");
			out.write("\t\tProcessBuilder pb = new ProcessBuilder(\"./runscript\");\n");
			out.write("\t\tpb.inheritIO();\n");
			out.write("\t\tpb.directory(new File(\"/home/test/programming/java/usefulprograms/\"));");
			out.write("\t\tpb.start();\n");
			out.write("\t}\n");
			out.write("}\n");
			out.close();
			if (!code.equals(exit)) {
				pb.start();
			}
		}
		ProcessBuilder pbquit = new ProcessBuilder("./compile");
		pbquit.inheritIO();
		pbquit.directory(new File("/home/test/programming/java/usefulprograms/"));
		pbquit.start();
	}
	public static int numOfPipes(String str) {
		int cnt = 0;
		for (int x = 0; x < str.length(); x++) {
			if (str.substring(x, x+1).equals("|")) {
				cnt++;
			}
		}
		return cnt;
	}
	public static String numOfParen(String str) {
		int leftcnt = 0;
		int rightcnt = 0;
		for (int x = 0; x < str.length()-1; x++) {
			if (str.substring(x, x+1).equals("(")) {
				leftcnt++;
			}
			if (str.substring(x, x+1).equals(")")) {
				rightcnt++;
			}
		}
		return String.format("%d %d", leftcnt, rightcnt);
	}
	public static int first(String str) {
		String result = "";
		for (int x = 0; Character.isDigit(str.charAt(x)); x++) {
			result += str.substring(x, x+1);
		}
		return Integer.parseInt(result);
	}
	public static int last(String str) {
		String result = "";
		for (int x = str.length()-1; Character.isDigit(str.charAt(x)); x--) {
			result += str.substring(x, x+1);
		}
		return Integer.parseInt(new StringBuilder(result).reverse().toString());
	}
	public static int numOfQuotes(String s) {
		int cnt = 0;
		for (int x = 0; x < s.length(); x++) {
			if (s.substring(x, x+1).equals("|")) {
				cnt++;
			}
		}
		return cnt;
	}
	public static String statementToArr(String statement) {
		String array = "{";
		for (int x = 0; x < statement.length(); x++) {
			if (statement.substring(x, x+1).equals(";")) {
				array += ",";
			}else {
				array += statement.substring(x, x+1);
			}
		}
		array += "}";
		return array;
	}
	public static boolean containsType(String statement) {
		boolean hasType = false;
		String[] types = {"int ", "String ", "float ", "char ", "Scanner ", "Random ", "double ", "long ", "byte ", "short ", "Integer ", "Character ", "Double", "Float ", "int[] ", "String[] ","float[] ", "char[] ", "Scanner[] ", "Random[] ", "double[] ", "long[] ", "byte[] ", "short[] ", "Integer[] ", "Float[] ", "Double[] "};
		for (int x = 0; x < types.length; x++) {
			hasType = statement.contains(types[x]);
			if (hasType) {
				break;
			}
		}
		return hasType;
	}
	public static boolean isDeclaration(String statement) {
		if (containsType(statement) && statement.contains(" = ")) {
			return true;
		}else {
			return false;
		}
	}
	public static String pipeToSemi(String pipe) {
		String semi = "";
		for (int x = 0; x < pipe.length(); x++) {
			if (pipe.substring(x, x+1).equals("|")) {
				semi += ";";
			}else {
				semi += pipe.substring(x, x+1);
			}
		}
		return semi;
	}
}

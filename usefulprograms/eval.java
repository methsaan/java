import java.io.*;
import java.util.*;

public class eval {
	public static void main(String []args) throws IOException{
		Scanner input = new Scanner(System.in);	
		int lines = 10000;
		String code = "";
		String exit = "Object[] val = {eval_q()};";
		String[] declarations = new String[500];
		int cnt = 0;
		String[] statements = new String[20];
		ProcessBuilder pb = new ProcessBuilder("./script");
		pb.inheritIO();
		pb.directory(new File("/home/test/programming/java/usefulprograms/"));
		System.out.print("Java code evaluator.\nType \"eval_q()\" to  quit\nevalfile.java <code evaluator> # ");
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
				//separate multiple statements
				for (int x = 0; x < value.length()-1; x++) {
					String tempstatement = "";
					for (int y = 0; !value.substring(y, y+1).equals("|") && y < value.length()-1; y++) {
						tempstatement += value.substring(y, y+1);
					}
					statements[x] = tempstatement;
				}
				//adds declarations to array
				for (int x = 0; x < statements.length-1; x++) {
					if (isDeclaration(statements[x])) {
						declarations[cnt] = statements[x];
						cnt++;
					}
				}
				//combine statements to string
				code = "";
				for (int x = 0; x < cnt; x++) {
					code += declarations[x] + ";";
				}
				code += value + ";";
				
			}
			BufferedWriter out = new BufferedWriter(new FileWriter("evalfile.java"));
			ProcessBuilder shell = new ProcessBuilder();
			out.write("import java.io.*;\n"); 
			out.write("import java.lang.*;\n"); 
			out.write("import java.util.*;\n\n"); 
			out.write("public class evalfile {;\n");
			out.write("\tpublic static void main(String[] args) {\n");
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
			out.write("\tpublic static String eval_q() {\n");
			out.write("\t\treturn \"Error: running outside of eval.java\";\n");
			out.write("\t}\n");
			out.write("\tpublic static String eval_clear() {\n");
			out.write("\t\treturn \"\033[H\033[2J\";\n");
			out.write("\t}\n");
			out.write("\tpublic static String eval_run(String x) throws IOException {\n");
			out.write("\t\tProcessBuilder pb = new ProcessBuilder(x);\n");
			out.write("\t\tpb.inheritIO();\n");
			out.write("\t\tpb.directory(new File(\"/home/test/programming/java/usefulprograms/\"));");
			out.write("\t\tpb.start();\n");
			out.write("\t\treturn \"eval_run()\";\n");
			out.write("\t}\n");
			out.write("}\n");
			out.close();
			if (!code.equals(exit)) {
				pb.start();
			}
		}
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
			if (s.substring(x, x+1).equals("\"")) {
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
		String[] types = {"int ", "String ", "float ", "char ", "Scanner ", "Random ", "double ", "long ", "byte ", "short ", "int ", "int[] ", "String[] ","float[] ", "char[] ", "Scanner[] ", "Random[] ", "double[] ", "long[] ", "byte[] ", "short[] ", "int[] "};
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
}

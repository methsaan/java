import java.io.*;                   
import java.util.*;

public class eval {
	public static void main(String []args) throws IOException{
		Scanner input = new Scanner(System.in);	
		int lines = 10000;
		String code = "";
		String exit = "Object val = q;";
		ProcessBuilder pb = new ProcessBuilder("./script");
		pb.inheritIO();
		pb.directory(new File("/home/test/programming/java/usefulprograms/"));
		System.out.println("Java code evaluator.\nType \"q\" to  quit\n> ");
		while (!code.equals(exit)) {
			code = "Object val = " + input.nextLine() + ";";
			BufferedWriter out = new BufferedWriter(new FileWriter("evalfile.java"));
			ProcessBuilder shell = new ProcessBuilder();
			out.write("import java.io.*;\n"); 
			out.write("import java.lang.*;\n"); 
			out.write("import java.util.*;\n\n"); 
			out.write("public class evalfile {;\n");
			out.write("\tpublic static void main(String[] args) {\n");
			out.write("\t\ttry {\n");
			out.write("\t\t\t" + code + "\n");
			out.write("\t\t\tSystem.out.println(val.toString());\n");
			out.write("\t\t}catch (Exception e) {\n");
			out.write("\t\t\tSystem.out.println(e.getMessage().toUpperCase());\n");
			out.write("\t\t}\n");
			out.write("\t}\n");
			out.write("}\n");
			out.close();
			if (!code.equals(exit)) {
				pb.start();
			}
		}
	}
}

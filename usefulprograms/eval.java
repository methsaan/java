import java.util.Scanner;
import java.io.*;
import java.util.*;

public class eval {
	public static void main(String []args) throws Exception {
		Scanner input = new Scanner(System.in);	
		int lines = 10000;
		String code = "";
		String exit = "Object val = q;";
		while (!(code.equals(exit))) {
			System.out.print("Enter a value (\"q\" to quit): ");
			code = "Object val = " + input.nextLine() + ";";
			BufferedWriter out = new BufferedWriter(new FileWriter("evalfile.java"));
			ProcessBuilder shell = new ProcessBuilder();
			try {
				out.write("import java.io.*;\n"); 
				out.write("import java.lang.*;\n"); 
				out.write("import java.util.*;\n\n"); 
				out.write("public class evalfile {;\n");
				out.write("\tpublic static void main(String[] args) {\n");
				out.write("\t\t" + code + "\n");
				out.write("\t\tSystem.out.println(val.toString());\n");
				out.write("\t}\n");
				out.write("}\n");
			}catch (IOException e) {
    				System.out.println("Exception " + e);
			}finally {
				out.close();
				System.out.print(executeCommand("javac evalfile.java"));
				System.out.print(executeCommand("java evalfile"));
			}
		}
	}
	public static String executeCommand(String command) {
		StringBuffer output = new StringBuffer();
		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        	String line = "";           
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	    	return output.toString();
	}
}

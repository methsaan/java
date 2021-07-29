import java.util.Scanner;
import java.io.*;

public class eval {
	public static void printResults(Process process) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
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
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output.toString();
	}
	public static void main(String[] args) throws IOException {
		try {
			Scanner input = new Scanner(System.in);
			String command = "";
			while (!command.equals("return 0; // FINISHED")) {
				FileWriter commandFile = new FileWriter("evalfile.java");
				command = "";
				commandFile.write("public class evalfile {" + System.getProperty("line.separator"));
				commandFile.write("public static void main(String[] args) {" + System.getProperty("line.separator"));
				while (!command.startsWith("return 0;")) {
					System.out.print("Enter command: ");
					command = input.nextLine();
					commandFile.write(command + System.getProperty("line.separator"));
				}
				commandFile.write("}" + System.getProperty("line.separator"));
				commandFile.write("}" + System.getProperty("line.separator"));
				commandFile.close();

				// file not found error

				//ProcessBuilder processBuilder = new ProcessBuilder();
				//processBuilder.command("./hello.sh");
				//Process process = processBuilder.start();
				//StringBuilder output = new StringBuilder();
				//BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				//String line;
				//while ((line = reader.readLine()) != null) {
				//	output.append(line + "\n");
				//}
				//int exitVal = process.waitFor();
				//if (exitVal == 0) {
				//	System.out.println(output);
				//}else {
				//	System.out.println("Error");
				//}

				Process process = Runtime.getRuntime().exec("./hello.sh");
				printResults(process);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

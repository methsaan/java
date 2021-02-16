import java.util.Scanner;
import java.io.*;

public class eval {
	public static void main(String[] args) {
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("./hello.sh");

		try {
			Scanner input = new Scanner(System.in);
			String command = "";
			while (!command.equals("return 0; // FINISHED")) {
				FileWriter commandFile = new FileWriter("evalrun.java");
				command = "";
				while (!command.startsWith("return 0;")) {
					System.out.print("Enter command: ");
					command = input.nextLine();
					commandFile.write(command + System.getProperty("line.separator"));
				}
				commandFile.close();
				Process process = processBuilder.start();
				StringBuilder output = new StringBuilder();
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String line;
				while ((line = reader.readLine()) != null) {
					output.append(line + "\n");
				}
				int exitVal = process.waitFor();
				if (exitVal == 0) {
					System.out.println(output);
				}else {
					System.out.println("Error");
				}
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}

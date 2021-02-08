import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class eval {
	public static void main(String[] args) {
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
				System.out.println("HAHO");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

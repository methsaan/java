import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class eval {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FileWriter commandFile = new FileWriter("evalrun.java");
		String command;
		while (command.equals("" /*QUIT COMMAND*/ )) {
			System.out.print("Enter command: ");
			command = input.nextLine();
			// write command to file
			// all variables global
		}
		commandFile.close();
	}
}

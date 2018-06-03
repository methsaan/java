import java.util.Scanner;
import java.util.Random;

public class DiceRoller{
	public static void main(String[] args) {
		Dice dice = new Dice(6);
		Dice dice2 = new Dice(6);
		Scanner scan = new Scanner(System.in);
		String command;
		System.out.println("Welcome to the dice roller. Options: roll, get_value, quit.");
		while (true) {
			System.out.print(">>>");
			command = scan.nextLine();
			if (command.equals("roll")) {
				dice.roll();
				System.out.println("Rolling #######... " + Integer.toString(dice.value) + " [done]");
			}else if (command.equals("get_value")) {
				System.out.println(dice.value);
			}else if (command.equals("quit")) {
				break;
			}else {
				System.out.println("[command REJECTED]");
			}
		}
	}
}

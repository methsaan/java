import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class unknownSpot {
	public static void main(String[] args) {
		System.out.println("Welcome to Unknown Spot!");
		int score = 0;
		for (int x = 0; x < 12; x++) {
			Random randObj = new Random();
			int chosenNum = randObj.nextInt(6);
			System.out.print("Enter a number between 1 and 6: ");
			Scanner scanObj = new Scanner(System.in);
			int usersNum = scanObj.nextInt();
			if (chosenNum == usersNum) {
				score += 1;
				System.out.println("You earned treasure!");
			}else {
				System.out.println("No treasure here!");
			}
		}
		System.out.println("Your score is " + Integer.toString(score));
		System.out.println(Double.toString((score/12.00)*100.00)+"%");
	}
}

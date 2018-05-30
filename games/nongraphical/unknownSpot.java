<<<<<<< HEAD
import java.util.*;

public class unknownSpot {
	public static void main(String[] args){
		int points = 0;
		System.out.println("Welcome to Unknown Spot");
		for (int x = 0; x < 16; x++) {
			String[] choices = new String[] {"a", "b", "c", "d"};
			Random randObj = new Random();
			int randChoice = randObj.nextInt(4);
			System.out.print("Enter 'a', 'b', 'c' or 'd': ");
			Scanner scanObj = new Scanner(System.in);
			String trueOrFalseInput = scanObj.nextLine();
			if (trueOrFalseInput.equals(choices[randChoice])) {
				System.out.println("You found treasure!");
				points += 1;
			}else {
				System.out.println("Whoops, no gold here.");
			}
		}
		System.out.println("Score: " + points);
		System.out.print((points/16.00)*100);
		System.out.println("%");
		System.out.println("Credits: Designer: Methuki Laknara Wickramasinghe, Creator: Methsaan Dinakara Wickramasinghe, Dedicated to: Pamini Wickramasinghe, HAPPY B'DAY!");
=======
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
>>>>>>> 11822cadafe468d24a2fad9515ddff261f943450
	}
}

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.io.IOException;

public class hangman {
	public static void main(String[] args) {
		String[] words = {"weights", "numbers", "markets", "marcher", "parting", "winters", "caption", "oranges", "english", "smarten", "puberty", "pythons", "disturb", "farting", "blaming", "transit", "injects", "spoiler", "hexagon", "imports", "exports", "informs", "knights", "gymnast", "foreign", "directs", "arduino", "poverty", "problem", "foaming"};
		Random random = new Random();
		String[] userProgress = {"_", "_", "_", "_", "_", "_", "_"};
		Scanner scanner = new Scanner(System.in);
		String randWord;
		while (true) {
			System.out.println("2 players or 1 player? (two/one)");
			String players = scanner.nextLine();
			int strike = 0;
			String[] strikes = {"[", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "]"};
			randWord = "";
			if (players.equals("one")) {
				randWord = words[random.nextInt(30)];
			}else if (players.equals("two")){
				while (randWord.length() != 7){
					System.out.println("Enter a seven letter word (make sure the other player isn't looking): ");
					randWord = scanner.nextLine();
					if (randWord.length() != 7){
						System.out.println("Sorry. Your word must be seven letters long");
					}
				}
			}
			System.out.print("\033[H\033[2J");
			while (Arrays.asList(userProgress).contains("_")){
				System.out.print("Guess a letter: ");
				String userWord = scanner.nextLine();
				if (randWord.contains(userWord)) {
					System.out.println("Yup.");
					userProgress[randWord.indexOf(userWord)] = userWord;
					if (!Arrays.asList(userProgress).contains("_")){
						System.out.println("YOU WIN");
						System.out.println("Word: " + randWord);
					}
				}else {
					System.out.println("Nope.");
					strike += 1;
					strikes[strike] = "#";
					printarray(strikes, "");
					if (strike == 10){
						System.out.println("GAME OVER");
						System.out.println("Word: " + randWord);
						break;
					}
				}
				printarray(userProgress, "");
			}
			for (int x = 0; x<userProgress.length; x++){
				userProgress[x] = "_";
			}
			printarray(userProgress, "");
		}
	}
	public static void printarray(String[] arrayf, String separator){
		for (int x = 0; x < arrayf.length; x++) {
			System.out.print(arrayf[x] + separator);
			if (x == arrayf.length-1) {
				System.out.println();
			}
		}
	}
}

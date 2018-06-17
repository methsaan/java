import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.io.IOException;

public class hangman {
	public static void main(String[] args) {
		String[] words = {"weights", "numbers", "markets", "marcher", "parting", "winters", "caption", "oranges", "english", "smarten", "puberty", "pythons", "disturb", "farting", "blaming", "transit", "injects", "spoiler", "hexagon", "imports", "exports", "informs", "knights", "gymnast", "foreign", "directs", "arduino", "poverty", "problem", "foaming"};
		Random random = new Random();
		String[] userProgress = {"_", "_", "_", "_", "_", "_", "_"};
		String[] strikes = {"{", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "}"}
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int strike = 0;
			String randWord = words[random.nextInt(30)];
			while (Arrays.asList(userProgress).contains("_")){
				System.out.print("Guess a letter: ");
				String userWord = scanner.nextLine();
				if (randWord.contains(userWord)) {
					System.out.println("Yup.");
					userProgress[randWord.indexOf(userWord)] = userWord;
					if (!userProgress.contains("_")){
						System.out.println("YOU WIN");
						System.out.println("Word: " + randWord);
					}
				}else {
					System.out.println("Nope.");
					strike += 1;
					strikes[strike] = "#";
					printarray(strikes);
					if (strikes == {"{", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "}"}){
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

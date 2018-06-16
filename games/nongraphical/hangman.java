import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class hangman {
	public static void main(String[] args) {
		String[] words = {"weights", "numbers", "markets", "marcher", "parting", "winters", "caption", "oranges", "english", "striker", "puberty", "pythons", "disturb", "farting", "blaming", "escaped", "program", "spoiler", "capital", "imports", "exports", "excited", "knights", "gymnast", "foreign", "directs", "arduino", "poverty", "problem", "foaming"};
		Random random = new Random();
		String[] userProgress = {"_", "_", "_", "_", "_", "_", "_"};
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String randWord = words[random.nextInt(30)];
			while (Arrays.asList(userProgress).contains("_")){
				System.out.print("Guess a letter: ");
				String userWord = scanner.nextLine();
				if (randWord.contains(userWord)) {
					System.out.println("Yup. Correct");
					userProgress[randWord.indexOf(userWord)] = userWord;
				}else {
					System.out.println("Nop. wrong.");
				}
				printarray(userProgress);
			}
			for (int x = 0; x>userProgress.length; x++){
				userProgress[x] = "_";
			}
			printarray({"ad", "afd", "aff"});
		}
	}
	public static void printarray(String[] arrayf){
		for (int x = 0; x < arrayf.length; x++) {
			System.out.print(arrayf[x] + " ");
			if (x == arrayf.length-1) {
				System.out.println();
			}
		}
	}
}

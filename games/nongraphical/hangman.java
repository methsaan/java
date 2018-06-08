import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class hangman {
	public static void main(String[] args) {
		String[] words = {"fifteen", "numbers", "markets", "garbage", "rejects", "illness", "caption", "bullies", "english"};
		Random random = new Random();
		char[] userProgress = {'_', '_', '_', '_', '_', '_', '_'};
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String randWord = words[random.nextInt(9)];
			System.out.print("Guess a letter: ");
			String userWord = scanner.next();
			if (randWord.contains(userWord)) {
				System.out.println("Yup. Correct");
			}else {
				System.out.println("Nop. wrong.");
			}
			printarray(userProgress);
		}
	}
	public static void printarray(char[] array){
		for (int x = 0; x < array.length; x++) {
			System.out.print(array[x] + " ");
			if (x == array.length-1) {
				System.out.println();
			}
		}
	}
}

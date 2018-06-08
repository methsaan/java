import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class hangman {
	public static void main(String[] args) {
		String[] words = new String[9];
		words = {"fifteen", "numbers", "markets", "garbage", "rejects", "illness", "caption", "bullies", "english"};
		Random generator = new Random();
		while (true) {
			int randWord = words[generator.nextInt(9)];
			System.out.println(randWord);
		}
	}
} 

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;

public class hangman3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("How long is your word? ");
			int wordLen = scan.nextInt();
			String wordArr[wordLen];
			for (int x = 0; x < wordLen; x++){
				System.out.println("Enter next character: ");
				wordArr[x] = scan.nextLine;

			}
		}
	}
	public static void printArrayList(ArrayList<String> arraylistf, String separator){
		for (int x = 0; x < arraylistf.size(); x++){
			System.out.print(arraylistf.get(x) + separator);
		}
		System.out.println();
	}
}

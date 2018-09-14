import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;

public class hangman3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = scan.nextLine();
		char[] wordArr = new char[word.length()];
		for (int x = 0; x < word.length(); x++){
			wordArr[x] = word.charAt(x);
		}
		char[] progress = new char[word.length()];
		for (int x = 0; x < word.length();x++){
			progress[x] = '_';
		}
		char[] strikes = new char[word.length()+2];
		strikes[0] = '{';
		for (int x = 1; x < strikes.length-2; x++){
			strikes[x] = '.';
		}
		strikes[strikes.length-1] = '}';
		int pntmax = word.length();
		int strikemax = strikes.length-2;
		int points = 0;
		int strike = 0;
		boolean won = true;
		//System.out.print("\033[H\033[2J");
		for (int x = 0; x < word.length()+3; x++){
			System.out.print("Enter a character: ");
			char a = scan.next().charAt(0);
			if (isIn(word, a)){
				System.out.println(a + " is in " + word);
				points++;
				if (points == pntmax){
					won = true;
					break;
				}
			}else {
				System.out.println(a + " is not in " + word);
				strikes[++strike] = '#';
				if (strike == strikemax){
					won = false;
					break;
				}
			}
			printArr("Progress: ", progress, " ", "\n");
			printArr("Strikes: ", strikes, "", "\n");
		}
		if (won){
			System.out.println("You win");
		}else {
			System.out.println("You lose");
		}
	}
	public static void printArr(String start, char[] x, String separator, String end){
		System.out.print(start);
		for (int a = 0; a < x.length; a++){
			System.out.print(x[a] + separator);
		}
		for (int b = 0; b < separator.length(); b++){
			System.out.print("\b");
		}
		System.out.print(" " + end);
	}
	public static boolean isIn(String str1, char charact){
		int cnt = 0;
		for (int x = 0; x < str1.length(); x++){
			if (str1.charAt(x) == charact){
				cnt++;
			}
		}
		if (cnt == 0){
			return false;
		}else{
			return true;
		}
	}
}

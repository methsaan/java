import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;

public class hangman3 {
	public static void main(String[] args) {
		System.out.print("LOADING ");
		for (int X = 0; X < 10; X++){
			System.out.print(".");
			for (long Y = 0; Y < 20000000; Y++){
				;
			}
		}
		while (true) {
			System.out.println();
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a word: ");
			String word = scan.nextLine();
			char[] wordArr = new char[word.length()];
			for (int x = 0; x < word.length(); x++){
				wordArr[x] = word.charAt(x);
			}
			char[] progress = new char[word.length()];
			for (int x = 0; x < word.length();x++){
				progress[x] = '~';
			}
			char[] strikes = new char[word.length()+2];
			strikes[0] = '{';
			for (int x = 1; x < word.length(); x++){
				strikes[x] = '.';
			}
			strikes[strikes.length-1] = '}';
			int pntmax = word.length();
			int strikemax = strikes.length-2;
			int points = 0;
			int strike = 0;
			boolean won = true;
			System.out.print("\033[H\033[2J");
			for (;;){
				System.out.print("Enter a character: ");
				char a = scan.next().charAt(0);
				if (isIn(word, a)){
					points++;
					for (int x = 0; x < word.length(); x++){
						if (Character.toLowerCase(wordArr[x]) == Character.toLowerCase(a)){
							if (Character.isUpperCase(wordArr[x])){
								progress[x] = Character.toUpperCase(a);
							}else {
								progress[x] = Character.toLowerCase(a);
							}
						}
					}
					if (!(isInCharArr(progress, '~'))){
						won = true;
						break;
					}
				}else {
					strikes[++strike] = '#';
					if (strike == strikemax-1){
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
			System.out.println("Word: " + word);
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
			if (Character.toLowerCase(str1.charAt(x)) == Character.toLowerCase(charact)){
				cnt++;
			}
		}
		if (cnt == 0){
			return false;
		}else{
			return true;
		}
	}
	public static boolean isInCharArr(char[] charArr, char charx){
		int cnt = 0;
		for (int x = 0; x < charArr.length; x++){
			if (charArr[x] == charx){
				cnt++;
			}
		}
		if (cnt == 0){
			return false;
		}else{
			return true;
		}
	}
	public static int searchInArr(char[] arr, char toFind){
		int Index = 0;
		for (int x = 0; x < arr.length; x++){
			if (arr[x] == toFind){
				Index = x;
				break;
			}
		}
		return Index;
	}
}

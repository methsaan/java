import java.util.Scanner;

public class wordLength{
	public static void main(String[] args){
		System.out.print("Enter a word: ");
		Scanner word = new Scanner(System.in);
		String word2 = word.nextLine();
		int len = word2.length();
		String char1 = "characters";
		if (len == 1) {
			char1 = "character";
		}
		System.out.println("Your word is " + len + " " + char1 + " long.");
	}
}

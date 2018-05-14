import java.util.Scanner;

public class wordLength{
	public static void main(String[] args){
		System.out.print("Enter a word: ");
		Scanner word = new Scanner(System.in);
		String word2 = word.nextLine();
		String lengthf = word2.length();
		System.out.println("Your word is " + lengthf + " characters long.");
	}
}

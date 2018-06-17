import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.io.IOException;

public class hangman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String randWord;
                while (true) {
                    int strike = 0;
                    System.out.println("Enter a word (make sure the other player isn't looking): ");
                    randWord = scanner.nextLine();
		    ArrayList<String> strikes = new ArrayList<String>();
		    strikes.add("{");
		    for (int x = 0; x < randWord.length(); x++){
			    strikes.add(".");
		    }
		    strikes.add("}");
		    System.out.println(strikes);
		}
	}
}

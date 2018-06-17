import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
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
		    String input = "";
		    System.out.print("\033[H\033[2J");
		    ArrayList<String> userProgress = new ArrayList<String>();
		    for (int x = 0; x < randWord.length(); x++){
			    userProgress.add("_");
		    }
		    while (userProgress.contains("_")){
			    System.out.print("Guess a letter: ");
			    input = scanner.nextLine();
			    if (randWord.contains(input)){
				    userProgress[randWord.indexOf(userWord)] = userWord;
				    if (!user.contains("_")){
					    System.out.println("YOU WIN");
					    System.out.println("Word: " + randWord);
				    }
			    }else {
				    System.out.println("Nope.");
				    strike += 1;
				    strikes.get(strike) = "#";
				    printArrayList(strikes, "");
				    if (strike == 10){
					    System.out.println("GAME OVER");
					    System.out.println("Word: " + randWord);
					    break;
				    }
			    }
			    printArrayList(userProgress, " ");
		    }
		}
	}
	public static void printArrayList(ArrayList<String> arraylistf, String separator){
		for (int x = 0; x < arraylistf.size(); x++){
			System.out.print(arraylistf.get(x));
		}
		System.out.println();
	}
}

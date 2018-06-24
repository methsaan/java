import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;

public class hangman {
	public static void main(String[] args) {
		Scanner scanno = new Scanner(System.in);
		String randWord = "";
		int strike = 0;
                while (true) {
		    System.out.println("Enter word: ");
		    randWord = scanno.nextLine()
                    ArrayList<String> strikes = new ArrayList<String>();
                    strikes.add("{");
                    for (int x = 0; x < randWord.length()+3; x++){
                            strikes.add(".");
                    }
                    strikes.add("}");
                    String input = "";
                    ArrayList<String> userProgress = new ArrayList<String>();
                    for (int x = 0; x < randWord.length(); x++){
                            userProgress.add("_");
                    }
		    System.out.print("\033[H\033[2J");
		    while (userProgress.contains("_")){
			    System.out.print("Guess a letter: ");
			    input = scanno.nextLine();
			    if (randWord.contains(input)){
				    for (int x = 0; x < randWord.length(); x++){
				        userProgress.set(randWord.indexOf(input), input);
				    }
				    if (!userProgress.contains("_")){
					    System.out.println("YOU WIN");
					    System.out.println("Word: " + randWord);
				    }
			    }else {
				    System.out.println("Nope.");
				    strike += 1;
				    strikes.set(strike, "#");
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

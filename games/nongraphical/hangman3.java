import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;

public class hangman3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String randWord = "";
		int strike = 0;
                while (true) {
		    System.out.println("Enter word: ");
		    randWord = scan.nextLine();
                    ArrayList<String> strikes = new ArrayList<String>();
		    ArrayList<String> word = new ArrayList<>(Arrays.asList(randWord.split("")));
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
		    int loop = 0;
		    String userWord = "";
		    String in = "1";
		    System.out.println(loop);
		    printArrayList(word, ", ");
		    System.out.println(word.size());
		    while (userProgress.contains("_")){
			    System.out.print("Guess a letter: ");
			    userWord = scan.nextLine();
			    int corrects = 0;
			    for (int x = 0; x < randWord.length(); x++){
				    if (userWord.charAt(x) == randWord.charAt(x)){
					    corrects++;
				    }
			    }
			    if (corrects < 0){
				    System.out.println("Yup");
				    if (userWord.get())
			    }else {
				    System.out.println("Nope");
			    }
			    printArrayList(userProgress);
	             }
		    strike = 0;
		  }
		   // while (userProgress.contains("_")){
		//	    System.out.print("Guess a letter: ");
		//	    input = scan.nextLine();
			    //if (randWord.contains(input)){
				//    for (int x = 0; x < randWord.length(); x++){
				  //      userProgress.set(randWord.indexOf(input), input);
				    //}
				//    if (!userProgress.contains("_")){
				//	    System.out.println("YOU WIN");
				//	    System.out.println("Word: " + randWord);
				  //  }
			    //}else{
			//	    System.out.println("Nope.");
			//	    strike += 1;
			//	    strikes.set(strike, "#");
			//	    printArrayList(strikes, "");
			//	    if (strike == randWord.length()+3){
			//		    System.out.println("GAME OVER");
			//		    System.out.println("Word: " + randWord);
			//		    break;
			//	    }
			  //  }
			    //printArrayList(userProgress, " ");
		  //  }
		    //strike = 0;
		//}
	}
	public static void printArrayList(ArrayList<String> arraylistf, String separator){
		for (int x = 0; x < arraylistf.size(); x++){
			System.out.print(arraylistf.get(x) + separator);
		}
		System.out.println();
	}
}

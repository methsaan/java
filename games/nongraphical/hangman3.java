import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;

public class hangman {
	public static void main(String[] args) {
		Scanner scanno = new Scanner(System.in);
		String randWord = "";
		int strike = 0;
                while (true) {
		    System.out.println("Enter word: ");
		    randWord = scanno.nextLine();
                    ArrayList<String> strikes = new ArrayList<String>();
		    ArrayList<String> word = new ArrayList<String>();
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
		    System.out.print("\033[H\033[2J______________\n");
		    int loop = 0;
		    String userWord = "";
		    String in = "1";
		    while (loop < word.size()){
			    System.out.print("Guess a letter: ");
			    userWord = scanno.nextLine();
			    String temp = in;
			    if (userWord == wordArray[loop]){
				    wordArray.set(loop, "1");
			    }else {
				    wordArray.set(loop, "0");
			    }
		    	    if (wordArray.contains("1")){
                            	System.out.println("Yup.");
                            	userProgress.set(, userWord);
			    	printArrayList(userProgress, " ");

			    	if (!userProgress.contains("_")){
					    System.out.println("YOU WIN");
					    System.out.println("Word: " + randWord);
				}
                    	    }else {
				System.out.println("Nope.");
				strike += 1;
				strikes.set(strike, "#");
				printArrayList(strikes, "");
				if (!strikes.contains(".")){
					System.out.println("GAME OVER");
					System.out.println("Word: " + randWord);
					break;
				}
		            }
	             }
		    strike = 0;
		   // while (userProgress.contains("_")){
		//	    System.out.print("Guess a letter: ");
		//	    input = scanno.nextLine();
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

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class matharena {
	public static void main(String[] args) {
		print("Welcome to the math arena");
		random rand = new random();
		String name = input("What is player 1's name? ");
		String name2 = input("What is player 2's name? ");
		int score = 0;
		int score2 = 0;
		for (int cnt = 0; cnt < 12; cnt++){
			int x = rand.randrange(1, 99);
			int y = rand.randrange(1, 99);
			int user1 = Int(input("What is " + str(x) + " + " + str(y) + ":" + "(" + name + ") "));
			if (user1 == x+y){
				print("correct");
				score += 1;
			}else {
				print("incorrect");
			}
			int x2 = rand.randrange(1, 99);
                        int y2 = rand.randrange(1, 99);
                        int user2 = Int(input("What is " + str(x2) + " + " + str(y2) + ":" + "(" + name2 + ") "));
                        if (user2 == x2+y2){
                        	print("correct");
                        	score2 += 1;
                        }else {
                        	print("incorrect");
                        }
		}
		print(name + ": " + str(score));
		print(name2 + ": " + str(score2));
	}
	public static void print(Object arg0){
		System.out.println(arg0);
	}
	public static String input(Object arg0){
		System.out.print(arg0);
		Scanner scanObj = new Scanner(System.in);
		String whatTheyEntered = scanObj.nextLine();
		return whatTheyEntered;
	}
	public static int Int(String whatToConvert) {
		int x = Integer.parseInt(whatToConvert);
		return x;
	}
	public static double Float(String whatToConvert){
		double x = Double.parseDouble(whatToConvert);
		return x;
	}
	public static String str(double whatToConvert){
		String x = Double.toString(whatToConvert);
		return x;
	}

}

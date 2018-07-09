import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class matharena {
	public static void main(String[] args) {
		print("Welcome to the math arena\n");
		random rand = new random();
		String name = input("What is player 1's name? ");
		String name2 = input("What is player 2's name? ");
		int score = 0;
		int score2 = 0;
		for (int cnt = 0; cnt < 6; cnt++){
       			int x = rand.randrange(1, 99);
		       	int y = rand.randrange(1, 99);
	       		double user1 = Float(input("What is " + Float(str(x)) + " x " + Float(str(y)) + ":" + "(" + name + ") "));
	       		if (user1 == x*y){
	       			score += 1;
	       		}else {
				if (score > 0){
					score -= 1;
				}else {
					score -= 0;
				}
	       		}
	       		int x2 = rand.randrange(1, 99);
			int y2 = rand.randrange(1, 99);
	       	      	double user2 = Float(input("What is " + Float(str(x2)) + " x " + Float(str(y2)) + ":" + "(" + name2 + ") "));
	       	      	if (user2 == x2*y2){
	       	      		score2 += 1;
	       	      	}else {
	         		if (score > 0){
					score -= 1;
				}else {
					score -= 0;
				}
	               	}
		}
		String winner = name;
		if (score > score2){
			winner = name;
		}else if (score == score2){
			winner = "TIE!!";
		}else {
			winner = name2;
		}
		print(name);
		print(" score: ");
		print(str(score));
		print("\n");
		print(name2);
		print(" score: ");
		print(str(score2));
		print("\n");
		print("The winner is: ");
		print(winner);
		print("\n");
	}
	public static void print(String whatToPrint){
		System.out.printf("%s", whatToPrint);
	}
	public static String input(Object arg0){
		System.out.print(arg0);
		Scanner scanObj = new Scanner(System.in);
		String whatTheyEntered = scanObj.nextLine();
		return whatTheyEntered;
	}
	public static int Int(String f) {
		int x = Integer.parseInt(f);
		return x;
	}
	public static double Float(String i){
		double x = Double.parseDouble(i);
		return x;
	}
	public static String str(int o){
		String x = Double.toString(o);
		return x;
	}
}

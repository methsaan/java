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
       			int x = rand.randrange(1, 100000);
		       	int y = rand.randrange(1, 10000);
			String op = rand.randChoice("\u00d7", "+", "-", "\u00f7");
	       		double user1 = Float(input("What is " + Float(str(x)) + " " + op + " " + Float(str(y)) + ": " + "(" + name + ") "));
	       		if (Math.round(user1*1000)/1000.0 == (op.equals("\u00d7") ? Math.round(x*y) : (op.equals("+") ? Math.round(x+y) : (op.equals("-") ? Math.round(x-y) : (Math.round(x/y*1000)/1000.0))))) {
	       			score += 1;
				System.out.println("Correct");
	       		}else {
				if (score > 0){
					score -= 1;
				}
	       		}
	       		int x2 = rand.randrange(1, 100000);
			int y2 = rand.randrange(1, 10000);
	       	      	double user2 = Float(input("What is " + Float(str(x2)) + " " + rand.randChoice("\u00d7", "+", "-", "\u00f7") + " " + Float(str(y2)) + ":" + "(" + name2 + ") "));
	       	      	if (Math.round(user2*1000)/1000.0 == (op.equals("\u00d7") ? Math.round(x2*y2) : (op.equals("+") ? Math.round(x2+y2) : (op.equals("-") ? Math.round(x2-y2) : (Math.round(x2/y2*1000)/1000.0))))) {
	       	      		score2 += 1;
				System.out.println("Correct");
	       	      	}else {
	         		if (score > 0){
					score -= 1;
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

import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class tictactoe {
	public static void main(String args[]){
		String a=" ", b=" ", c=" ", d=" ", e=" ", f=" ", g=" ", h=" ", i=" ";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter horizontal");
		int hori = scan.nextInt();
		System.out.println("Enter vertical");
		int vert = scan.nextInt();
		if ((hori == 1) && (vert == 1)){
			a = "X";b = " ";c = " ";d = " ";e = " ";f = " ";g = " ";h = " ";i = " ";
		}else{
			int fsa = 10;
		}
		printgrid(a, b, c, d, e, f, g, h, i);
	}
	public static void printgrid(String tl, String tm, String tr, String ml, String mm, String mr, String bl, String bm, String br){
		System.out.printf("___________________\n");
		System.out.printf("|     |     |     |\n");
		System.out.printf("|  %s  |  %s  |  %s  |\n", tl, tm, tr);
		System.out.printf("|_____|_____|_____|\n");
		System.out.printf("|     |     |     |\n");
		System.out.printf("|  %s  |  %s  |  %s  |\n", ml, mm, mr);
		System.out.printf("|_____|_____|_____|\n");
		System.out.printf("|     |     |     |\n");
		System.out.printf("|  %s  |  %s  |  %s  |\n", bl, bm, br);
		System.out.printf("|_____|_____|_____|\n");
	}
}

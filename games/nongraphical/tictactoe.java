import java.util.Scanner;
import java.util.Random;

public class tictactoe {
	public static void main(String args[]){
		printgrid("X", "O", "X", "O", "X", "O", "X", "O", "X");
	}
	void prntgrid(tl, tm, tr, ml, mm, mr, bl, bm, br){
		System.out.printf("___________________\n");
		System.out.printf("|     |     |     |\n");
		System.out.printf("|  %s   |  %s   |  %s   |\n", tl, tm, tr);
		System.out.printf("|_____|_____|_____|\n");
		System.out.printf("|     |     |     |\n");
		System.out.printf("|  %s   |  %s   |  %s   |\n", ml, mm, mr);
		System.out.printf("|_____|_____|_____|\n");
		System.out.printf("|     |     |     |\n");
		System.out.printf("|  %s   |  %s   |  %s   |\n", bl, bm, br);
		System.out.printf("|_____|_____|_____|\n");
	}
}

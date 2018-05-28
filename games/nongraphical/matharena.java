import java.util.Scanner;
import java.util.Random;

public class matharena {
	public static void main(String[] args) {
		int f = Integer.parseInt(input("Enter a number: "));
		print(f + 4);
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
	public static int int()
}


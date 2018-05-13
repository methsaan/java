import java.util.Scanner;

public class GetUserInputThree{
	public static void main(String[] args) {
		System.out.print("What is your name? ");
		Scanner yourName0 = new Scanner(System.in);
		String yourName = yourName0.nextLine();
		System.out.println("Your name is " + yourName);
	}
}

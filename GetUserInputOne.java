import java.util.Scanner;

public class GetUserInputOne{
	public static void main(String[] args) {
		System.out.print("Enter a value : ");
		Scanner var1 = new Scanner(System.in);
		String var11 = var1.nextLine();
		System.out.println("You entered " + var11);
	}
}

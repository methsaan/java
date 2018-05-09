import java.util.Scanner;

public class GetUserInputTwo{
	public static void main(String[] args) {
		System.out.print("Enter a value : ");
		Scanner var2 = new Scanner(System.in);
		int var22 = var2.nextInt();
		System.out.println("Adding 2 to the integer you entered is " + ( var22 + 2 ));
	}
}

import java.util.Scanner;

public class root {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number = scan.nextInt();
		System.out.println("Enter the root: ");
		double root = scan.nextInt();
		System.out.println("          _____________");
		System.out.println((int)root + "        /     " + number + "        = " + root(number, root));
		System.out.println("       \\/");
	}
	public static double root(double num, double root) {
		return Math.pow(num, 1/root);
	}
}

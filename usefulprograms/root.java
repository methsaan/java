import java.util.Scanner;

public class root {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number = scan.nextDouble();
		System.out.println("Enter the root: ");
		double root = scan.nextDouble();
		System.out.println("          _____________");
		System.out.println((int)root + "        /     " + number + "        = " + root(number, root));
		System.out.println("       \\/");
	}
	public static double root(double base, double root) {
		return Math.pow(base, 1/root);
	}
}

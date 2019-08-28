import java.util.Scanner;
import java.text.*;

public class logarithm {
	public static void main(String[] args) {
		DecimalFormat decFor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base: ");
		double base = scan.nextDouble();
		System.out.println("Enter the number: ");
		double number = scan.nextDouble();
		System.out.print("Log");
		System.out.print(base + "(");
		System.out.print(number + ") = ");
		System.out.println(log(base, number));
	}
	public static double log(double base, double number) {
		return Math.log10(number)/Math.log10(base);
	}
}

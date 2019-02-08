import java.util.Scanner;

public class logarithm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base: ");
		double base = scan.nextDouble();
		System.out.println("Enter the number: ");
		double number = scan.nextDouble();
		System.out.println("Log" + base + "    " + number + "   =   " + log(base, number));
	}
	public static double log(double base, double number) {
		double power = 1;
		while (base != number) {
			number /= base;
			power++;
		}
		return power;
	}
}

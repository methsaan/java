import java.util.Scanner;

public class logarithm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base: ");
		double base = scan.nextDouble();
		System.out.println("Enter the number: ");
		double number = scan.nextDouble();
		System.out.println("Log" + base + " " + number + " = " + log(base, number));
	}
	public static double log(double base, double number) {
		double power = 0.1;
		double diff = base-number;
		if (diff < 0) {
			diff = -diff;
		}
		while (diff > 0.1) {
			number /= base;
			power += 0.1;
		}
		return power;
	}
}

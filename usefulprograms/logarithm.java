import java.util.Scanner;

public class logarithm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base: ");
		double base = scan.nextDouble();
		System.out.println("Enter the number: ");
		double number = scan.nextDouble();
		System.out.printf("Log%f   %f   =   %f\n", base, number, log(base, number));
	}
	public static double log(double base, double number) {
		double power = 0.000001;
		while (base != number) {
			number /= base;
			power++;
		}
		return power;
	}
}

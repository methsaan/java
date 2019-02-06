import java.util.Scanner;

public class logarithm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base = scan.nextInt();
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		System.out.println("Log" + base + " " + number + " = " + log(base, number));
	}
	public static int log(int base, int number) {
		int power = 1;
		while (base != number) {
			number /= base;
			power++;
		}
		return power;
	}
}

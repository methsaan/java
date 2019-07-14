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
		decFor = new DecimalFormat("0." + strmult(Double.toString(base), numOfDigits(base)));
		System.out.print(decFor.format(base) + "  ");
		decFor = new DecimalFormat("0." + strmult(Double.toString(number), numOfDigits(number)));
		System.out.print(decFor.format(number) + "  =  ");
		decFor = new DecimalFormat("0." + strmult(Double.toString(log(base, number)), numOfDigits(log(base, number))));
		System.out.println(decFor.format(log(base, number)));
	}
	public static double log(double base, double number) {
		return Math.log10(number)/Math.log10(base);
	}
	public static int numOfDigits(double num) {
		int decIndex = Double.toString(num).indexOf(".");
		return Double.toString(num).substring(decIndex, Double.toString(num).length());
	}
	public static String strmult(String str, int numOfTimes) {
		String multstr;
		for (int x = 0; x < numOfTimes; x++) {
			multstr += str;
		}
		return multstr;
	}
}

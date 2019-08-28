import java.util.Scanner;

public class mathtrick {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double threeDigit = scan.nextInt();
		double sixDigit = threeDigit*1000+threeDigit;
		System.out.println((int)(sixDigit) + " \u00F7 7: " + (int)(sixDigit/7));
		System.out.println((int)(sixDigit/7) + " \u00F7 11: " + (int)(sixDigit/7/11));
		System.out.println((int)(sixDigit/7/11) + " \u00F7 13: " + (int)(sixDigit/7/11/13));
		System.out.println("          ____");
	}
}

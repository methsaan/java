import java.util.Scanner;

public class divalg {
	public static void main(String[] args){
		System.out.print("Enter first number (2 digits): ");
		int dividend = new Scanner(System.in).nextInt();
		System.out.print("Enter second number (2 digits): ");
		int divisor = new Scanner(System.in).nextInt();
		double quotientDouble = (double)dividend/(double)divisor;
		float quotientFloat = (float)(quotientDouble);
		String ans = "";
		int dividTemp = dividend;
		int dividTemp2;
		int numOfTimes = 0;
		for (int x = 0; x < 3; x++){
			numOfTimes = (int)dividTemp/divisor;
			System.out.println(divisor + " goes to " + dividTemp + " " + numOfTimes + " times.");
			System.out.println("The remainder is " + dividTemp%divisor);
			ans = ans + dividTemp%divisor;
			dividTemp2 = dividTemp;
			dividTemp = divisor * numOfTimes;
			System.out.println(divisor + " x " + numOfTimes + " = " + dividTemp);
			System.out.println(dividTemp2 + " - " + dividTemp + " = " + (dividTemp2-dividTemp));
			System.out.println();
		}
	}
}

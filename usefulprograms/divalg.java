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
		System.out.println(" \t    " + quotientFloat);
		System.out.println(" \t " + "_________");
		System.out.println(divisor + " \t | " + dividTemp);
		for (int x = 0; x < 7; x++){
			numOfTimes = (int)dividTemp/divisor;
			//System.out.println(dividTemp + " / " + divisor + " = " + numOfTimes);
			ans = ans + Integer.toString(numOfTimes);
			//System.out.println(divisor + " x " + numOfTimes + " = " + (divisor * numOfTimes));
			System.out.println(" \t   " + (divisor*numOfTimes));
			System.out.println(" \t   ___");
			//System.out.println(dividTemp + " - " + (divisor*numOfTimes) + " = " + (dividTemp-divisor*numOfTimes));
			if (dividTemp-divisor*numOfTimes > divisor) {
				dividTemp = (dividTemp-divisor*numOfTimes);
			}else {
				dividTemp = (dividTemp-divisor*numOfTimes) * 10;
			}
			System.out.println(" \t   " + dividTemp);
		}
		float answer = Float.parseFloat(ans)/1000000;
	}
}

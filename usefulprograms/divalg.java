import java.util.Scanner;

public class divalg {
	public static void main(String[] args){
		System.out.print("Enter first number: ");
		int dividend = new Scanner(System.in).nextInt();
		System.out.print("Enter second number: ");
		int divisor = new Scanner(System.in).nextInt();
		double quotientDouble = (double)dividend/(double)divisor;
		float quotientFloat = (float)(quotientDouble);
		String ans = "";
		int dividTemp = dividend;
		int dividTemp2;
		int numOfTimes = 0;
		int spaces = 3;
		System.out.println(" \t    " + quotientFloat);
		System.out.println(" \t " + "_________");
		System.out.println(divisor + " \t | " + dividTemp);
		for (int x = 0; x < 7; x++){
			numOfTimes = (int)dividTemp/divisor;
			ans = ans + Integer.toString(numOfTimes);
			System.out.print(" \t");
			for (int a = 0; a < spaces; a++){
				System.out.print(" ");
			}
		       	System.out.println((divisor*numOfTimes));
			System.out.print(" \t");
			for (int b = 0; b < spaces; b++){
				System.out.print(" ");
			}
			System.out.println("___");
			if (dividTemp-divisor*numOfTimes > divisor) {
				dividTemp = (dividTemp-divisor*numOfTimes);
			}else {
				dividTemp = (dividTemp-divisor*numOfTimes) * 10;
			}
			System.out.print(" \t");
			for (int c = 0; c < spaces; c++){
				System.out.print(" ");
			}
			System.out.println(dividTemp);
			spaces++;
		}
		//
		float answer = Float.parseFloat(ans)/1000000;
	}
}

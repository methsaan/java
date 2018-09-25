import java.util.Scanner;

public class divalg {
	public static void main(String[] args){
		System.out.print("Enter first number (2 digits): ");
		int dividend = new Scanner(System.in).nextInt();
		System.out.print("Enter second number (2 digits): ");
		int divisor = new Scanner(System.in).nextInt();
		double quotientDouble = (double)dividend/(double)divisor;
		float quotientFloat = (float)(quotientDouble);
		String quotient = Float.toString(quotientFloat).substring(0, Float.toString(quotientFloat).length()-5);
		int dividTemp = dividend;
		int numOfTimes = 0;
		int block = 0;
		//System.out.println("     " + quotient);
		System.out.println("    _________");
		System.out.println(divisor + " | " + dividend);
		while (true){
			block += divisor;
			if (block < dividend){
				numOfTimes += 1;
			}else{
				break;
			}
		}
		System.out.println("     " + numOfTimes*divisor);
		System.out.println("    ___");
		System.out.println("     " + (dividTemp-numOfTimes*divisor));
		dividTemp -= numOfTimes*divisor;
		numOfTimes = 0;
		block = 0;
	}
}

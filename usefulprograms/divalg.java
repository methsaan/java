import java.util.Scanner;

public class divalg {
	public static void main(String[] args){
		System.out.print("Enter first number: ");
		int dividend = new Scanner(System.in).nextInt();
		System.out.print("Enter second number: ");
		int divisor = new Scanner(System.in).nextInt();
		System.out.print("Accuracy for irrational numbers: ");
		int accuracy = new Scanner(System.in).nextInt();
		double quotientDouble = (double)dividend/(double)divisor;
		float quotientFloat = (float)(quotientDouble);
		String ans = "";
		int dividTemp = dividend;
		int dividTemp2;
		int numOfTimes = 0;
		int spaces = 3;
		int dec = 0;
		System.out.println(" \t    " + quotientFloat);
		System.out.println(" \t " + "_________");
		System.out.println(divisor + " \t | " + dividTemp);
		for (int x = 0;;x++) {
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
				dec++;
				if (dec == 1){
					ans = ans + ".";
				}
				dividTemp = (dividTemp-divisor*numOfTimes) * 10;
			}
			System.out.print(" \t");
			for (int c = 0; c < spaces+1; c++){
				System.out.print(" ");
			}
			System.out.println(dividTemp);
			spaces++;
			if (dividTemp == 0){
				break;
			}
			if (x > 600){
				System.out.println();
				System.out.println("Irrational number. Approximate answer: " + ans.substring(0, accuracy+2));
				break;
			}
		}
	}
}

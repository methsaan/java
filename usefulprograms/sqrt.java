import java.util.Scanner;
import java.lang.Math;

public class sqrt {
	public static void main(String[] args){
		double C;
		double A;
		double B;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		C = scan.nextDouble();
		System.out.println("Enter previous perfect square: ");
		B = scan.nextDouble();
		System.out.println("Enter next perfect square: ");
		A = scan.nextDouble();
		double sqrt = (1.000/(A-B))*(C-B)+Math.sqrt(B);
		System.out.println("Square root according to formula: " + sqrt);
		System.out.println("Square root according to Math.sqrt(): " + Math.sqrt(C));
	}
}

import java.util.Scanner;
import java.lang.Math;

public class coordlen {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int x2;
		int y2;
		int a;
		int b;
		int asquared;
		int bsquared;
		double pythagorus;
		System.out.print("Enter x coordinate of point \"a\": ");
		x = scan.nextInt();
		System.out.print("Enter y coordinate of point \"a\": ");
		y = scan.nextInt();
		System.out.print("Enter x coordinate of point \"b\": ");
		x2 = scan.nextInt();
		System.out.print("Enter y coordinate of point \"b\": ");
		y2 = scan.nextInt();
		a = Math.abs(x-x2);
		b = Math.abs(y-y2);
		asquared = a*a;
		bsquared = b*b;
		pythagorus = Math.sqrt(asquared+bsquared);
		System.out.println("Distance from point a to point b: " + pythagorus);
	}
}

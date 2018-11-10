import java.util.Scanner;
import java.lang.Math;

public class missingAngle{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of sides: ");
		int numOfSides = scan.nextInt();
		int[] sides = new int[numOfSides];
		int angtot = (numOfSides-2)*180;
		System.out.print("Enter number of undefined sides: ");
		int numMissing = scan.nextInt();
		int totFound = 0;
		int x;
		for (x = 0; x < numOfSides-numMissing; x++){
			System.out.print("Enter angle of point " + (x+1) + ": ");
			sides[x] = scan.nextInt();
			totFound += sides[x];
		}
		int leftOver = angtot-totFound;
		double leftPerMissingSide = (double)leftOver/(double)numMissing;
		for (; x < numOfSides; x++){
			System.out.println("Angle " + (x+1) + ": " + leftPerMissingSide);
		}
	}
}

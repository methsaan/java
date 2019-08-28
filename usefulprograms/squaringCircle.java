import java.util.Scanner;

public class squaringCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter area of circle: ");
		double carea = input.nextDouble();
		double sidelength = Math.sqrt(carea);
		double sqarea = Math.pow(sidelength, 2);
		System.out.println("Area of equivalent square: " + String.format("%.2f", sidelength) + " X " + String.format("%.2f", sidelength) + " = " + String.format("%.2f", sqarea));
	}
}

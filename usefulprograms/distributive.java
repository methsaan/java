import java.util.Scanner;

public class distributive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		term[] polynomial = new term[input.nextInt()];
		term[] distPolynomial = new term[polynomial.length];
		System.out.print("Enter factor to distribute: ");
		int factor = input.nextInt();
		for (int x = 0; x < polynomial.length; x++) {
			System.out.print("Enter coefficient: ");
			polynomial[x].setCoefficient(input.nextInt());
			input.nextLine();
			System.out.print("Enter variable part: ");
			polynomial[x].setVariable(input.nextLine());
		}
		for (int x = 0; x < polynomial.length; x++) {
			System.out.print(polynomial[x].polarity() + Math.abs(distPolynomial[x].coefficient()) + distPolynomial[x].variable());
		}
		for (int x = 0; x < distPolynomial.length; x++) {
			distPolynomial[x].setCoefficient(polynomial[x].coefficient);
			distPolynomial[x].setVariable(polynomial[x].variable);
		}
		for (int x = 0; x < distPolynomial.length; x++) {
			System.out.print(distPolynomial[x].polarity() + Math.abs(distPolynomial[x].coefficient()) + distPolynomial[x].variable());
		}
		System.out.println();
	}
}

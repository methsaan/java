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
			polynomial[x].setPolarity(polynomial[x].coefficient() < 0 ? "-" : "+");
			input.nextLine();
			System.out.print("Enter variable part: ");
			polynomial[x].setVariable(input.nextLine());
			System.out.println(polynomial[x].polarity() + Math.abs(polynomial[x].coefficient()) + polynomial[x].variable());
		}
		for (int i = 1; i < 2; i++) {
			System.out.println(polynomial[i].polarity() + Math.abs(polynomial[i].coefficient()) + polynomial[i].variable());
		}
		System.out.println();
		for (int x = 0; x < distPolynomial.length; x++) {
			distPolynomial[x].setPolarity(polynomial[x].coefficient()*factor < 0 ? "-" : "+");
			distPolynomial[x].setCoefficient(polynomial[x].coefficient()*factor);
			distPolynomial[x].setVariable(polynomial[x].variable());
		}
		for (int x = 0; x < distPolynomial.length; x++) {
			System.out.print(distPolynomial[x].polarity() + Math.abs(distPolynomial[x].coefficient()) + distPolynomial[x].variable() + " ");
		}
		System.out.println();
	}
}

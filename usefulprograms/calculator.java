import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		System.out.print("Welcome to the calculator. Options: add, sub, mul, div, mod\nEnter operator: ");
		Scanner inp = new Scanner(System.in);
		String op = inp.nextLine();
		System.out.printf("Enter firstnum: ");
		Scanner inp2 = new Scanner(System.in);
		double x = inp2.nextDouble();
		System.out.printf("Enter second number: ");
		Scanner inp3 = new Scanner(System.in);
		double y = inp3.nextDouble();
		if (op.equalsIgnoreCase("add")) {
			System.out.println(x + y);
		}else if (op.equalsIgnoreCase("sub")) {
			System.out.println(x - y);
		}else if (op.equalsIgnoreCase("mul")) {
			System.out.println(x * y);
		}else if (op.equalsIgnoreCase("div")) {
			System.out.println(x / y);
		}else if (op.equalsIgnoreCase("mod")) {
			System.out.println(x % y);
		}else {
			System.out.println("Invalid operator");
		}
	}
}

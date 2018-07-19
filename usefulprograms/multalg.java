import java.util.Scanner;

public class multalg{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number (2 digits): ");
		int f = scan.nextInt();
		System.out.print("Enter second number (2 digits): ");
		int s = scan.nextInt();
		System.out.println("     " + f);
		System.out.println("     " + s);
		System.out.println("    x__");
		int prod1 = Integer.parseInt(Integer.toString(s).substring(1))*f;
		int prod2 = Integer.parseInt(Integer.toString(s).substring(0, 1))*f;
		System.out.println("     " + prod1);
		System.out.println("    " + prod2);
		System.out.println(" +_____");
		System.out.println("    " + (prod1+prod2*10));
	}
}

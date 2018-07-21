import java.util.*;
import java.lang.*;

public class addalg {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int f = scan.nextInt();
		System.out.println("Enter second num: ");
		int s = scan.nextInt();
		String remStr = "         ";
		System.out.println(remStr);
		System.out.println("   " + f);
		System.out.println("   " + s);
		System.out.println(" +____");
		System.out.println("  " + (f+s));
	}
}

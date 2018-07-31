import java.util.*;
import java.lang.*;

public class addalg {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int f = scan.nextInt();
		System.out.println("Enter second num: ");
		int s = scan.nextInt();
		int rem1 = Integer.parseInt(Integer.toString(Integer.parseInt(Integer.toString(s).substring(1)) + Integer.parseInt(Integer.toString(f).substring(1))));
		int rem2 = Integer.parseInt(Integer.toString(rem1).substring(0, 1));
		System.out.println("   " + rem2);
		System.out.println("   " + f);
		System.out.println("   " + s);
		System.out.println(" +____");
		System.out.println("   " + (f+s));
	}
}

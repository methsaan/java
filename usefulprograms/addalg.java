import java.util.*;
import java.lang.*;

public class addalg {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int f = scan.nextInt();
		System.out.println("Enter second num: ");
		int s = scan.nextInt();
		System.out.println("Enter third num: (enter 00 if 2 numbers are enough) ");
		int t = scan.nextInt();
		System.out.println("Enter fourth num: (enter 00 if 3 numbers are enough) ");
		int fo = scan.nextInt();
		int rem1 = Integer.parseInt(Integer.toString(Integer.parseInt(Integer.toString(s).substring(1)) + Integer.parseInt(Integer.toString(f).substring(1)) + Integer.parseInt(Integer.toString(t).substring(1)) + Integer.parseInt(Integer.toString(fo).substring(1))));
		int rem2 = Integer.parseInt(Integer.toString(rem1).substring(0, 1));
		System.out.println("   " + rem2);
		System.out.println("   " + f);
		System.out.println("   " + s);
		System.out.println("   " + t);
		System.out.println("   " + fo);
		System.out.println(" +____");
		System.out.println((Integer.toString(f+s+t+fo).length() != 2 ? "  " : "   ") + (f+s+t+fo));
	}
}

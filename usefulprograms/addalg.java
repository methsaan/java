import java.util.*;
import java.lang.*;

public class addalg {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int f = scan.nextInt();
		System.out.println("Enter second num: ");
		int s = scan.nextInt();
		System.out.println("Enter third num: (enter 0 if 2 numbers are enough) ");
		int t = scan.nextInt();
		System.out.println("Enter fourth num: (enter 0 if " + (t == 0 ? "2" : "3") + " numbers are enough) ");
		int fo = scan.nextInt();
		int rem1;
		int rem2;
		if ((f > 0) && (s > 0) && (t > 0) && (fo > 0)) {
			rem1 = Integer.parseInt(Integer.toString(Integer.parseInt(Integer.toString(s).substring(1)) + Integer.parseInt(Integer.toString(f).substring(1)) + Integer.parseInt(Integer.toString(t).substring(1)) + Integer.parseInt(Integer.toString(fo).substring(1))));
			rem2 = Integer.toString(rem1).length() != 1 ? Integer.parseInt(Integer.toString(rem1).substring(0, 1)) : 0;
		}else if ((f > 0) && (s > 0) && (t > 0)) {
			rem1 = Integer.parseInt(Integer.toString(Integer.parseInt(Integer.toString(s).substring(1)) + Integer.parseInt(Integer.toString(f).substring(1)) + Integer.parseInt(Integer.toString(Integer.parseInt(Integer.toString(t))))));
			rem2 = Integer.toString(rem1).length() != 1 ? Integer.parseInt(Integer.toString(rem1).substring(0, 1)) : 0;
		}else {
			rem1 = Integer.parseInt(Integer.toString(Integer.parseInt(Integer.toString(s).substring(1)) + Integer.parseInt(Integer.toString(f).substring(1))));
			rem2 = Integer.toString(rem1).length() != 1 ? Integer.parseInt(Integer.toString(rem1).substring(0, 1)) : 0;
		}
		System.out.print(rem2 != 0 ? ("   " + rem2 + "\n") : "");
		System.out.println("   " + f);
		System.out.println("   " + s);
		System.out.println((t != 0 ? "   " : "    ") + t);
		System.out.println((fo != 0 ? "   " : "    ") + fo);
		System.out.println(" +____");
		System.out.println((Integer.toString(f+s+t+fo).length() != 2 ? "  " : "   ") + (f+s+t+fo));
	}
}

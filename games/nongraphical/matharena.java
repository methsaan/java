import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class matharena {
	public static void main(String[] args) {
		random randobj = new random();
		int x = randobj.randrange(5, 8);
		print(x);
		String[] y = new String[] {"a", "b", "c", "d"};
		String z = randobj.randchoice(y);
		print(z);
	}
	public static void print(Object arg0){
		System.out.println(arg0);
	}
	public static String input(Object arg0){
		System.out.print(arg0);
		Scanner scanObj = new Scanner(System.in);
		String whatTheyEntered = scanObj.nextLine();
		return whatTheyEntered;
	}
	public static int Int(String whatToConvert) {
		int x = Integer.parseInt(whatToConvert);
		return x;
	}
	public static double Float(String whatToConvert){
		double x = Double.parseDouble(whatToConvert);
		return x;
	}
	public static String str(double whatToConvert){
		String x = Double.toString(whatToConvert);
		return x;
	}

}

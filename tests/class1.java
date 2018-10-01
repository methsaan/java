import java.util.Scanner;

public class class1 {
	public static int input(String x) {
		System.out.println(x);
		Scanner inp = new Scanner(System.in);
		int y = inp.nextInt();
		return y;
	}
	public static void print(String ... y) {
		for (int x = 0; x < y.length; x++){
			System.out.print(y[x]);
		}
	}
}

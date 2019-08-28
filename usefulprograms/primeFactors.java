import java.util.Scanner;
import java.util.ArrayList;

public class primeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a composite number: ");
		int number = input.nextInt();
		ArrayList<Integer> factors = factors(number);
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		ArrayList<Integer> tempFactors = factors(number);
		for (int x = 0; x < factors.size(); x++) {
			tempFactors = factors(factors.get(x));
			for (int y = 0; y < tempFactors.size(); y++) {
				if (isPrime(tempFactors.get(y))) {
					primeFactors.add(tempFactors.get(y));
				}else {
				}
			}
		}
		printList(primeFactors);
	}
	public static ArrayList<Integer> factors(int num) {
		ArrayList<Integer> f = new ArrayList<Integer>();
		int cnt = 0;
		for (int x = 1; x <= num; x++) {
			if ((double)num/(double)x == (double)(num/x) && x != 1) {
				f.add(cnt, new Integer(x));
			}
		}
		return f;
	}
	public static void printList(ArrayList<Integer> arr) {
		for (int x = 0; x < arr.size(); x++) {
			System.out.print(arr.get(x) + " ");
		}
		System.out.println();
	}
	public static boolean isPrime(int num) {
		int numOfFactors = 0;
		for (int x = 0; x < num; x++) {
			if ((double)num/x == (double)num/(double)x) {
				numOfFactors++;
			}
		}
		return numOfFactors <= 2 ? true : false;
	}
}

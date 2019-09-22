import java.util.Scanner;
import java.util.ArrayList;

public class primeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a composite number: ");
		int number = input.nextInt();
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		ArrayList<Integer> tempFactors = new ArrayList<Integer>();
		ArrayList<Integer> factors = factors(number);
		System.out.println(factors);
		for (int x = 0; x < 1; x++) {
			tempFactors.add(factors.get(0));
			tempFactors.add(factors.get(factors.size()-1));
			System.out.println(tempFactors.get(0));
			System.out.println(tempFactors.get(1));
		}
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

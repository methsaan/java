import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class primeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a composite number: ");
		int number = input.nextInt();
		ArrayList<ArrayList<Integer>> factorTree = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tempFactors = factors(number);
		while (true) {
			System.out.println(tempFactors);
			tempFactors = compFactors(tempFactors);
			if (tempFactors.size() == 0) {
				break;
			}
		}
	}
	public static ArrayList<Integer> compFactors(ArrayList<Integer> factorsList) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int x = 0; x < factorsList.size(); x++) {
			if (isPrime(factorsList.get(x).intValue())) {
				result.add(factorsList.get(x));
			}
		}
		return result;
	}
	public static ArrayList<Integer> factors(int num) {
		ArrayList<Integer> f = new ArrayList<Integer>();
		int cnt = 0;
		for (int x = 1; x <= num; x++) {
			if ((double)num/(double)x == (double)(num/x) && x != 1) {
				f.add(cnt, new Integer(x));
			}
		}
		Collections.reverse(f);
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

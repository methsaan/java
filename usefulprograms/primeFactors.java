import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class primeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a composite number: ");
		int number = input.nextInt();
		ArrayList<ArrayList<Integer>> factorTree = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tempRow = new ArrayList<Integer>();
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		tempRow.add(number);
		factorTree.add(tempRow);
		boolean isFactorized = false;
		while (!isFactorized) {
			ArrayList<Integer> currentRow = factorTree.get(factorTree.size()-1);
			ArrayList<Integer> nextRow = new ArrayList<Integer>();
			for (int x = 0; x < currentRow.size(); x++) {
				if (!isPrime(currentRow.get(x))) {
					int randFactor = factors(currentRow.get(x)).get(new Random().nextInt(factors(currentRow.get(x)).size()-1));
					nextRow.add(randFactor);
					nextRow.add(currentRow.get(x)/randFactor);
				}else {
					primeFactors.add(currentRow.get(x));
					System.out.println(currentRow.get(x));
				}
			}
			factorTree.add(nextRow);
			isFactorized = true;
			for (int x = 0; x < nextRow.size(); x++) {
				if (!isPrime(nextRow.get(x))) {
					isFactorized = false;
				}
			}
		}
		System.out.println();
		for (int x = 0; x < factorTree.size(); x++) {
			System.out.println(factorTree.get(x));
		}
		System.out.print("Prime factors: ");
		System.out.println(primeFactors);
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
		return factors(num).size()+1 == 2;
	}
}

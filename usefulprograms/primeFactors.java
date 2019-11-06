import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class primeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a composite number: ");
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
				if (currentRow.get(x) != -1) {
					if (!isPrime(currentRow.get(x))) {
						int randFactor = factors(currentRow.get(x)).get(new Random().nextInt(factors(currentRow.get(x)).size()-1));
						nextRow.add(randFactor);
						nextRow.add(currentRow.get(x)/randFactor);
					}else {
						nextRow.add(-1);
						nextRow.add(-1);
						primeFactors.add(currentRow.get(x));
					}
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
		for (int x = 0; x < factorTree.get(factorTree.size()-1).size(); x++) {
			if (isPrime(factorTree.get(factorTree.size()-1).get(x))) {
				primeFactors.add(factorTree.get(factorTree.size()-1).get(x));
			}
		}
		System.out.println();
		for (int x = 0; x < factorTree.size(); x++) {
			System.out.println(factorTree.get(x));
		}
		System.out.print("Prime factors: ");
		System.out.println("\t" + primeFactors);
		int[] arraypf = primeFactors.stream().filter(t -> t != null).mapToInt(t -> t).toArray();
		int[] leastToGreatest = sortInts(arraypf);
		ArrayList<Integer> ltogArraylist = new ArrayList<Integer>();
		for (int x = 0; x < leastToGreatest.length; x++) {
			ltogArraylist.add(leastToGreatest[x]);
		}
		System.out.println(" =\t\t" + ltogArraylist);
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
	public static int []sortInts(int[] asd) {
		int[] sorted = asd.clone();
		for (int i = 0; i < sorted.length; i++) {
			for (int j = i+1; j < sorted.length; j++) {
				if ( (sorted[i] > sorted[j]) && (i != j) ) {
					int temp = sorted[j];
					sorted[j] = sorted[i];
					sorted[i] = temp;
				}
			}
		}
		return sorted;
	} 
	public static int[] convertIntegers(ArrayList<Integer> integers) {
		int[] ret = new int[integers.size()];
		for (int i=0; i < ret.length; i++) {
			ret[i] = integers.get(i).intValue();
		}
		return ret;
	}
}

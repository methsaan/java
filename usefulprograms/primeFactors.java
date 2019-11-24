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
				}else {
					nextRow.add(-1);
					nextRow.add(-1);
				}
			}
			factorTree.add(nextRow);
			isFactorized = true;
			for (int x = 0; x < nextRow.size(); x++) {
				if (!isPrime(nextRow.get(x)) && nextRow.get(x) != -1) {
					isFactorized = false;
				}
			}
		}
		for (int x = 0; x < factorTree.get(factorTree.size()-1).size(); x++) {
			if (isPrime(factorTree.get(factorTree.size()-1).get(x))) {
				primeFactors.add(factorTree.get(factorTree.size()-1).get(x));
			}
		}
		int[] arraypf = primeFactors.stream().filter(t -> t != null).mapToInt(t -> t).toArray();
		int[] leastToGreatest = sortInts(arraypf);
		ArrayList<Integer> ltogArraylist = new ArrayList<Integer>();
		for (int x = 0; x < leastToGreatest.length; x++) {
			ltogArraylist.add(leastToGreatest[x]);
		}
		ArrayList<String> powerPrimes = new ArrayList<String>();
		ArrayList<Integer> duplicatedNums = new ArrayList<Integer>();
		for (int x = 0; x < primeFactors.size(); x++) {
			int count = 0;
			for (int y = 0; y < primeFactors.size(); y++) {
				if (primeFactors.get(y) == primeFactors.get(x)) {
					count++;
				}
			}
			if (!duplicatedNums.contains(primeFactors.get(x))) {
				duplicatedNums.add(primeFactors.get(x));
			}
		}
		int[] arraydn = duplicatedNums.stream().filter(t -> t != null).mapToInt(t -> t).toArray();
		int[] leastToGreatest2 = sortInts(arraydn);
		ArrayList<Integer> ltogArraylist2 = new ArrayList<Integer>();
		for (int x = 0; x < leastToGreatest2.length; x++) {
			ltogArraylist2.add(leastToGreatest2[x]);
		}
		for (int x = 0; x < ltogArraylist2.size(); x++) {
			if (Integer.toString(ArrayListIntFreq(ltogArraylist2.get(x), primeFactors)).equals("1")) {
				powerPrimes.add(Integer.toString(ltogArraylist2.get(x)));
			}else {
				powerPrimes.add(Integer.toString(ltogArraylist2.get(x)) + "^" + Integer.toString(ArrayListIntFreq(ltogArraylist2.get(x), primeFactors)));
			}
		}
		ArrayList<ArrayList<Integer>> factorTreeCoords = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tempTreeRow = new ArrayList<Integer>();
		ArrayList<Integer> tempTreeRow2 = new ArrayList<Integer>();
		ArrayList<Integer> tempTreeRow3 = new ArrayList<Integer>();
		ArrayList<Integer> tempTreeRow4 = new ArrayList<Integer>();
		ArrayList<Integer> tempTreeRow5 = new ArrayList<Integer>();
		ArrayList<Integer> tempTreeRow6 = new ArrayList<Integer>();
		tempTreeRow.add(80);factorTreeCoords.add(tempTreeRow);tempTreeRow2.add(60);tempTreeRow2.add(40);factorTreeCoords.add(tempTreeRow2);tempTreeRow3.add(52);tempTreeRow3.add(20);tempTreeRow3.add(20);tempTreeRow3.add(20);factorTreeCoords.add(tempTreeRow3);tempTreeRow4.add(46);tempTreeRow4.add(10);tempTreeRow4.add(8);tempTreeRow4.add(10);tempTreeRow4.add(8);tempTreeRow4.add(10);tempTreeRow4.add(8);tempTreeRow4.add(10);factorTreeCoords.add(tempTreeRow4);tempTreeRow5.add(42);tempTreeRow5.add(4);tempTreeRow5.add(4);tempTreeRow5.add(4);tempTreeRow5.add(1);tempTreeRow5.add(4);tempTreeRow5.add(1);tempTreeRow5.add(4);tempTreeRow5.add(4);tempTreeRow5.add(4);tempTreeRow5.add(4);tempTreeRow5.add(4);tempTreeRow5.add(4);tempTreeRow5.add(4);tempTreeRow5.add(4);tempTreeRow5.add(4);factorTreeCoords.add(tempTreeRow5);tempTreeRow6.add(38);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);tempTreeRow6.add(2);factorTreeCoords.add(tempTreeRow6);
		for (int x = 0; x < factorTree.size(); x++) {
			if (x == factorTree.size()-1) {
				if (factorTree.size() > factorTreeCoords.size()) {
					break;
				}
			}
			for (int y = 0; y < factorTree.get(x).size(); y++) {
				for (int z = 0; z < factorTreeCoords.get(x).get(y); z++) {
					System.out.print(" ");
				}
				if (factorTree.get(x).get(y) != -1) {
					System.out.print(factorTree.get(x).get(y));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Prime factors: \t\t" + ltogArraylist);
		System.out.println(" \t\t=\t" + powerPrimes);
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
	public static int ArrayListIntFreq(int num, ArrayList<Integer> al) {
		int count = 0;
		for (int x = 0; x < al.size(); x++) {
			if (al.get(x) == num) {
				count++;
			}
		}
		return count;
	}
}

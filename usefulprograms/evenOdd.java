import java.util.Scanner;

public class evenOdd {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int[] intArray = new int[scan.nextInt()];
		for (int x = 0; x < intArray.length; x++){
			System.out.print("Element - " + x + ": ");
			intArray[x] = scan.nextInt();
		}
		int[] even = new int[intArray.length];
		int[] odd = new int[intArray.length];
		int evenlen = 0;
		int oddlen = 0;
		for (int x = 0; x < intArray.length; x++){
			if (intArray[x]%2 == 0){
				even[x] = intArray[x];
			}else {
				odd[x] = intArray[x];
			}
		}
		for (int x = 0; x < intArray.length; x++){
			evenlen++;
			oddlen++;
			if (even[x] == null) {
				break;
			}
			if (odd[x] == null){
				break;
			}
		}
		System.out.print("Even numbers: ");
		for (int x = 0; x < evenlen; x++){
			System.out.print(even[x]);
		}
		System.out.println();
		System.out.print("Odd numbers: ");
		for (int x = 0; x < oddlen; x++) {
			System.out.print(odd[x]);
		}
		System.out.println();
	}
}

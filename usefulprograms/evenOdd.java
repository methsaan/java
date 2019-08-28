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
		int evenIndex = 0;
		int oddIndex = 0;
		for (int x = 0; x < intArray.length; x++){
			if (intArray[x]%2 == 0){
				even[evenIndex] = intArray[x];
				evenIndex++;
			}else {
				odd[oddIndex] = intArray[x];
				oddIndex++;
			}
		}
		for (int x = 0; x < intArray.length; x++){
			evenlen++;
			if (even[x] == 0) {
				break;
			}
		}
		for (int x = 0; x < intArray.length; x++){
			oddlen++;
			if (odd[x] == 0){
				break;
			}
		}
		System.out.print("Even numbers: ");
		for (int x = 0; x < evenlen-1; x++){
			System.out.print(even[x] + " ");
		}
		System.out.println();
		System.out.print("Odd numbers: ");
		for (int x = 0; x < oddlen-1; x++) {
			System.out.print(odd[x] + " ");
		}
		System.out.println();
	}
}

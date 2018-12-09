import java.util.ArrayList;
import java.util.Scanner;

public class pascal {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> triangleRows = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1);
		triangleRows.add(firstRow);
		System.out.print("Enter number of rows: ");
		int numberOfRows = input.nextLine();
		for (int x = 0; x < numberOfRows; x++){
			triangleRows.add(new Integer());
		}
		
	}
}

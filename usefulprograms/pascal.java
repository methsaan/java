import java.util.ArrayList;
import java.util.Scanner;

public class pascal {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int numberOfRows = input.nextInt();
		int triangle[][] = new int[100][100];
		triangle[0][0] = 0;
		triangle[0][1] = 1;
		triangle[0][2] = 0;
		for (int x = 1; x < numberOfRows; x++){
			for (int y = 0; y < x; y++) {
				triangle[x][y] = 1;
			}
		}
		for (int x = 0; x < numberOfRows; x++){
			for (int y = 0; y < x; y++){
				System.out.println(triangle[x][y]);
			}
		}
		
	}
}

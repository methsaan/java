import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class pascal {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("How many rows: ");
		int rows = input.nextInt()+1;
		int Triangle[][] = new int[100][rows];
		Triangle[0][0] = 0;
		Triangle[1][0] = 0;
		Triangle[1][1] = 0;
		for (int x = 1; x < rows; x++) {
			for (int y = 0; y < x; y++) {
				if ((y == 0) || (y == x-1)){
					Triangle[x][y] = 1;
				}else {
					Triangle[x][y] = Triangle[x-1][y-1] + Triangle[x-1][y];
				}
			}
		}
		for (int x = 0; x < rows; x++){
			for (int i = 0; i < 90-x*5; i++) {
				System.out.print(" ");
			}
			for (int y = 0; y < x; y++){
				System.out.print(Triangle[x][y]);
				for (int i = 0; i < 8; i++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}

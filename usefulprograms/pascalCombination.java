import java.util.Random;
import java.util.Scanner;

public class pascalCombination {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long Triangle[][] = new long[100][100];
		Triangle[0][0] = 0;
		Triangle[1][0] = 0;
		Triangle[1][1] = 0;
		for (int x = 1; x < 100; x++) {
			for (int y = 0; y < x; y++) {
				if ((y == 0) || (y == x-1)){
					Triangle[x][y] = 1;
				}else {
					Triangle[x][y] = Triangle[x-1][y-1] + Triangle[x-1][y];
				}
			}
		}
		System.out.println("Enter the size of the group: ");
		long sizeOfGroup = input.nextLong();
		System.out.println("Enter the size of the arrangements: ");
		long sizeOfArrangements = input.nextLong();
		long numOfArrangements = Triangle[(int)sizeOfGroup+1][(int)sizeOfArrangements];
		System.out.println("Number of possible arrangements: " + numOfArrangements);
	}
}

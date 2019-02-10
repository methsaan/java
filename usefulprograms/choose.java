import java.util.Random;
import java.util.Scanner;

public class choose {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int Triangle[][] = new int[100][15];
		Triangle[0][0] = 0;
		Triangle[1][0] = 0;
		Triangle[1][1] = 0;
		for (int x = 1; x < 15; x++) {
			for (int y = 0; y < x; y++) {
				if ((y == 0) || (y == x-1)){
					Triangle[x][y] = 1;
				}else {
					Triangle[x][y] = Triangle[x-1][y-1] + Triangle[x-1][y];
				}
			}
		}
		System.out.println("Enter the size of the group: ");
		int sizeOfGroup = input.nextInt();
		System.out.println("Enter the size of the arrangements: ");
		int sizeOfArrangements = input.nextInt();
		int numOfArrangements = Triangle[sizeOfGroup+1][sizeOfArrangements];
		System.out.println("Number of arrangements: " + numOfArrangements);
	}
}

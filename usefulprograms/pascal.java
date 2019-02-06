import java.util.ArrayList;
import java.util.Random;

public class pascal {
	public static void main(String[] argq){
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
		for (int x = 0; x < 15; x++){
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

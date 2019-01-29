import java.util.ArrayList;

public class pascal {
	public static void main(String[] argq){
		int Triangle[][] = new int[100][14];
		Triangle[0][0] = 1;
		Triangle[1][0] = 1;
		Triangle[1][1] = 1;
		for (int x = 2; x < 14; x++) {
			for (int y = 0; y < x; y++) {
				if ((y == 0) || (y == x-1)){
					Triangle[x][y] = 1;
				}else {
					Triangle[x][y] = Triangle[x-1][y-1] + Triangle[x-1][y];
				}
			}
		}
		for (int x = 0; x < 14; x++){
			for (int i = 0; i < ((int)100/2-((x-1)*5))+8; i++) {
				System.out.print(" ");
			}
			for (int y = 0; y < x; y++){
				System.out.print(Triangle[x][y]);
				System.out.print("       ");
			}
			System.out.println();
		}	
	}
}

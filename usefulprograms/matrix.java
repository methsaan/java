import java.util.Scanner;

public class matrix {
	public static void main(String []args) {
		System.out.print("\033[H\033[2J");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter width of matrix 1: ");
		int width1 = input.nextInt();
		System.out.print("Enter height of matrix 1: ");
		int height1 = input.nextInt();
		input.nextLine();
		System.out.print("Enter operator (+, x or -): ");
		String operator = input.nextLine();
		int matrix1[][] = new int[height1][width1];
		int width2 = operator.equals("x") ? height1 : width1;
		int height2 = operator.equals("x") ? width1 : height1;
		int matrix2[][] = new int[height2][width2];
		int width3;
		int height3;
		if ((operator.equals("-")) || (operator.equals("+"))) {
			width3 = width2;
			height3 = height2;
		}else {
			width3 = height1;
			height3 = width2;
		}
		int answer[][] = new int[height3][width3];
		System.out.println("Enter values for matrix 1:");
		for (int x = 0; x < matrix1.length; x++) {
			for (int y = 0; y < matrix1[0].length; y++) {
				matrix1[x][y] = input.nextInt();
			}
		}
		System.out.println("Enter values for matrix 2:");
		for (int x = 0; x < matrix2.length; x++) {
			for (int y = 0; y < matrix2[0].length; y++) {
				matrix2[x][y] = input.nextInt();
			}
		}
		System.out.println();
		if (operator.equals("+") || operator.equals("-")) {
			for (int x = 0; x < answer.length; x++) {
				for (int y = 0; y < answer[0].length; y++) {
					if (operator.equals("+")) {
						answer[x][y] = matrix1[x][y] + matrix2[x][y];
					}else {
						answer[x][y] = matrix1[x][y] - matrix2[x][y];
					}
				}
			}
		}else {
			for (int a = 0; a < answer.length; a++) {
				for (int b = 0; b < answer[0].length; b++) {
					int product = 0;
					for (int x = 0; x < matrix1[0].length; x++) {
						for (int y = 0; y < matrix2.length; y++) {
							if (x == y) {
								product += matrix1[a][x] * matrix2[y][b];
							}
						}
					}
					answer[a][b] = product;
				}
			}
		}
		// 18
		// \033[4;5Hc
		if (operator.equals("+") || operator.equals("-")) {
			int space = 6+matrix1.length*matrix1[0].length+matrix2.length*matrix2[0].length+1;
			int i = 0;
			int j = 0;
			for (i = 0; i < matrix1[0].length; i++) {
				for (j = 0; j < matrix1.length; j++) {
					System.out.print("\033[" + Integer.toString(space + j*2) + ";" + Integer.toString((4*matrix1[0].length+matrix1[0].length) + i*5-10) + "H" + matrix1[j][i]);
				}
			}
			System.out.print("\033[" + Integer.toString(space + (0+j*2)/2-1) + ";" + Integer.toString((((4*matrix1[0].length+matrix1[0].length) + (i-1)*5-10) + ((4*matrix1[0].length+matrix1[0].length)+10+(4*matrix2[0].length+matrix2[0].length)-10))/2) + "H" + operator);
			int k = i;
			int l = j;
			for (int x = 0; x < matrix2[0].length; x++) {
				for (int y = 0; y < matrix2.length; y++) {
					System.out.print("\033[" + Integer.toString(space + y*2) + ";" + Integer.toString((4*matrix1[0].length+matrix1[0].length)+10+(4*matrix2[0].length+matrix2[0].length) + x*5-10) + "H" + matrix2[y][x]);
					k++;
				}
				l++;
			}
			int x = 0;
			int y = 0;
			for (x = 0; x < answer.length; x++) {
				for (y = 0; y < answer[0].length; y++) {
					System.out.print("\033[" + Integer.toString(space + x*2) + ";" + Integer.toString((4*matrix1[0].length+matrix1[0].length)+10+(4*matrix2[0].length+matrix2[0].length)+10+(4*answer[0].length+answer[0].length)+ y*5-10) + "H" + answer[x][y]);
				}
			}
			System.out.print("\033[" + Integer.toString(space + (0+j*2)/2-1) + ";" + Integer.toString((((4*matrix1[0].length+matrix1[0].length)+10+(4*matrix2[0].length+matrix2[0].length) + (matrix2[0].length-1)*5-10)+((4*matrix1[0].length+matrix1[0].length)+10+(4*matrix2[0].length+matrix2[0].length)+10+(4*answer[0].length+answer[0].length)-10))/2) + "H=");
			for (int a = 0; a < matrix1.length; a++) {
				System.out.println();
			}
		}else {
			for (int x = 0; x < matrix1.length; x++) {
				for (int y = 0; y < matrix1[0].length; y++) {
					System.out.print(matrix1[x][y] + strmult(" ", 5-Integer.toString(matrix1[x][y]).length()));
				}
				System.out.println();
				System.out.println();
			}
			System.out.println("\n\nx\n\n");
			for (int x = 0; x < matrix2.length; x++) {
				for (int y = 0; y < matrix2[0].length; y++) {
					System.out.print(matrix2[x][y] + strmult(" ", 5-Integer.toString(matrix2[x][y]).length()));
				}
				System.out.println();
				System.out.println();
			}
			System.out.println("\n\n=\n\n");
			for (int x = 0; x < answer.length; x++) {
				for (int y = 0; y < answer.length; y++) {
					System.out.print(answer[x][y] + strmult(" ", 5-Integer.toString(answer[x][y]).length()));
				}
				System.out.println();
				System.out.println();
			}
		}
	}
	public static String strmult(String str, int i) {
		String result = "";
		for (int x = 0; x < i; x++) {
			result += str;
		}
		return result;
	}
}
//						(0, 0)		(0, 1)
//	
//	
//						(1, 0)		(1, 1)
//	
//	
//						(2, 0)		(2, 1)
//	
//	
// (0, 0)	(0, 1)		(0, 2)
//
//
//( 1, 0)	(1, 1)		(1, 2)

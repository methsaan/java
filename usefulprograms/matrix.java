import java.util.Scanner;

public class matrix {
	public static void main(String []args) {
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
		for (int x = 0; x < matrix1.length; x++) {
			for (int y = 0; y < matrix1[0].length; y++) {
				System.out.print(matrix1[x][y] + " \t ");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println(operator);
		System.out.println();
		System.out.println();
		for (int x = 0; x < matrix2.length; x++) {
			for (int y = 0; y < matrix2[0].length; y++) {
				System.out.print(matrix2[x][y] + " \t ");
			}
			System.out.println();
			System.out.println();
		}
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
		System.out.print("\n\n=\n\n");
		for (int x = 0; x < answer.length; x++) {
			for (int y = 0; y < answer[0].length; y++) {
				System.out.print(answer[x][y] + " \t ");
			}
			System.out.println();
			System.out.println();
		}
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

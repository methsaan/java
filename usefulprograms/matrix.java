import java.util.Scanner;

public class matrix {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter width of matrix 1: ");
		int width1 = input.nextInt();
		System.out.print("Enter height of matrix 1: ");
		int height1 = input.nextInt();
		input.nextLine();
		System.out.print("Enter operator: ");
		String operator = input.nextLine();
		int matrix1[][] = new int[height1][width1];
		int width2 = operator.equals("x") ? height1 : width1;
		int height2 = operator.equals("x") ? width1 : height1;
		int matrix2[][] = new int[height2][width2];
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
		for (int x = 0; x < matrix2.length; x++) {
			for (int y = 0; y < matrix2[0].length; y++) {
				System.out.print(matrix2[x][y] + " \t ");
			}
			System.out.println();
			System.out.println();
		}
	}
}	

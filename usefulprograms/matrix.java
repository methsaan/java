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
		int matrix1[][] = new int[width1][height1];
		int width2 = operator.equals("x") ? height1 : width1;
		int height2 = operator.equals("x") ? width1 : height1;
		int matrix2[][] = new int[width2][height2];
		System.out.println("Enter the values for matrix 1:");
		for (int x = 0; x < height1; x++) {
			for (int y = 0; y < width1; y++) {
				matrix1[x][y] = input.nextInt();
			}
		}
		System.out.println("Enter the values for matrix 2:");
		for (int x = 0; x < height2; x++) {
			for (int y = 0; y < width2; y++) {
				matrix2[x][y] = input.nextInt();
			}
		}
		System.out.println("Matrix 1:");
		for (int x = 0; x < height1; x++) {
			System.out.print("[");
			for (int y = 0; x < width1; y++) {
				System.out.print(matrix1[x][y] + " ");
			}
			System.out.println("]");
		}
		System.out.println("\nMatrix 2:");
		for (int x = 0; x < height2; x++) {
			System.out.print("[");
			for (int y = 0; x < width2; y++) {
				System.out.print(matrix2[x][y] + " ");
			}
			System.out.println("]");
		}
	}
}	

import java.util.Scanner;

public class distributive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int numOfTerms = input.nextInt();
		System.out.print("Enter factor to distribute: ");
		int factor = input.nextInt();
		Object[][] group = new Object[numOfTerms][3];
		Object[][] group2 = new Object[numOfTerms][3];
		for (int i = 0; i < numOfTerms; i++) {
			System.out.print("Coefficient: ");
			int c = input.nextInt();
			input.nextLine();
			System.out.print("Variable part: ");
			String v = input.nextLine();
			group[i][0] = c > 0 ? "+" : "-";
			group[i][1] = c;
			group[i][2] = v;
		}
		for (int i = 0; i < numOfTerms; i++) {
			group2[i][1] = (int)group[i][1] * factor;
			group2[i][0] = (int)group2[i][1] > 0 ? "+" : "-";
			group2[i][1] = Math.abs((int)group2[i][1]);
			group2[i][2] = group[i][2];
		}
		System.out.println();
		for (int x = 0; x < numOfTerms; x++) {
			System.out.print(group2[x][0].toString() + group2[x][1].toString() + group2[x][2].toString() + " ");
		}
		System.out.println();
	}
}

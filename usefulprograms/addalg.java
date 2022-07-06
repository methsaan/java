import java.util.*;
import java.lang.*;

public class addalg {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of operands: ");
		int numOfOperands = scan.nextInt();
		System.out.print("Enter maximum amount of digits: ");
		int maxDigits = scan.nextInt();
		int operands[][] = new int[numOfOperands][maxDigits];
		String tempNumList[] = new String[numOfOperands];
		scan.nextLine();
		for (int x = 0; x < numOfOperands; x++) {
			System.out.print("Enter operand " + (x+1) + ": ");
			String tempOperandStr = scan.nextLine();
			tempNumList[x] = tempOperandStr;
			String tempOperandArr[] = (new String(new char[maxDigits-tempOperandStr.length()]).replace("\0", "0")+tempOperandStr).split("");
			for (int y = 0; y < maxDigits; y++) {
				operands[x][y] = Integer.parseInt(tempOperandArr[y]);
			}
		}
		for (int x = 0; x < numOfOperands; x++) {
			for (int y = 0; y < numOfOperands; y++) {
				if (tempNumList[x].length() > tempNumList[y].length()) {
					String temp = tempNumList[x];
					tempNumList[x] = tempNumList[y];
					tempNumList[y] = temp;
					for (int z = 0; z < maxDigits; z++) {
						int temp2 = operands[x][z];
						operands[x][z] = operands[y][z];
						operands[y][z] = temp2;
					}
				}
			}
		}
		int sumDigits[] = new int[maxDigits+1];
		int carryOver[] = new int[maxDigits];
		for (int x = maxDigits; x > 0; x--) {
			sumDigits[x] = 0;
			for (int y = 0; y < numOfOperands; y++) {
				sumDigits[x] += operands[y][x-1];
			}
			sumDigits[x] += (x != maxDigits ? carryOver[x] : 0);
			carryOver[x-1] = (int)(sumDigits[x]/10);
			sumDigits[x] %= 10;
		}
		sumDigits[0] = carryOver[0];
		System.out.print("  ");
		for (int x = 0; x < maxDigits; x++) {
			System.out.print((carryOver[x] == 0 ? " " : carryOver[x]) + " ");
		}
		System.out.println("\n");
		for (int x = 0; x < numOfOperands; x++) {
			System.out.print("    ");
			for (int y = 0; y < maxDigits; y++) {
				System.out.print((operands[x][y] == 0 && y < maxDigits-tempNumList[x].length() ? " " : operands[x][y]) + " ");
			}
			System.out.println();
		}
		System.out.println("_\u00B1" + new String(new char[maxDigits*2+3]).replace("\0", "_"));
		System.out.print("  ");
		for (int x = 0; x < maxDigits+1; x++) {
			System.out.print((sumDigits[x] == 0 && x == 0 ? " " : sumDigits[x]) + " ");
		}
		System.out.println();
	}
}

import java.util.*;
import java.lang.*;

public class addalg2 {
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
			System.out.print("Enter operand " + x + ": ");
			String tempOperandStr = scan.nextLine();
			tempNumList[x] = tempOperandStr;
			String tempOperandArr[] = (new String(new char[maxDigits-tempOperandStr.length()]).replace("\0", "0")+tempOperandStr).split("");
			for (int y = 0; y < maxDigits; y++) {
				operands[x][y] = Integer.parseInt(tempOperandArr[y]);
			}
		}
		for (int x = 0; x < numOfOperands; x++) {
			for (int y = 0; y < numOfOperands; y++) {
				String temp2 = tempNumList[x];
				tempNumList[x] = tempNumList[y];
				tempNumList[y] = temp2;
				if (tempNumList[x].length() > tempNumList[y].length()) {
					for (int z = 0; z < maxDigits; z++) {
						int temp = operands[x][z];
						operands[x][z] = operands[y][z];
						operands[y][z] = temp;
					}
				}
			}
		}
		for (int x = 0; x < numOfOperands; x++) {
			System.out.println(tempNumList[x]);
		}
		int sumDigits[] = new int[maxDigits+1];
		int carryOver[] = new int[maxDigits];
		for (int x = maxDigits-1; x >= 0; x--) {
			sumDigits[x] = 0;
			for (int y = 0; y < numOfOperands; y++) {
				sumDigits[x] += operands[y][x];
			}
		}
		for (int x = 0; x < numOfOperands; x++) {
			for (int y = 0; y < maxDigits; y++) {
				System.out.print(operands[x][y] + " ");
			}
			System.out.println();
		}
		for (int x = 0; x < maxDigits+1; x++) {
			System.out.print(sumDigits[x] + " ");
		}
		System.out.println();
	}
}

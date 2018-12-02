import java.util.Scanner;
import java.util.Random;

public class wordjumble {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter a word: ");
		String unjumbled = scan.nextLine();
		String jumbled = "";
		int[] index = new int[unjumbled.length()];
		for (int x = 0; x < index.length; x++) {
			index[x] = x;
		}
		int indexlen = index.length;
		int randIndex = 12;
		for (int x = 0; x < 10; x++){
			do {
				randIndex = rand.nextInt(indexlen);
			} while (randIndex == 0);
			jumbled += unjumbled.substring(randIndex, randIndex+1);
			unjumbled.substring(randIndex, randIndex+1) = "";
			indexlen--;
		}
	}
}

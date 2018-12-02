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
		int randIndex;
		String charact;
		for (int x = 0; x < unjumbled.length(); x++){
			do {
				randIndex = rand.nextInt(indexlen);
				charact = unjumbled.substring(randIndex, randIndex+1);
				if (!jumbled.contains(charact)) {
					if (index[randIndex] != unjumbled.length()+100){
						break;
					}
				}
			} while (true);
			jumbled += unjumbled.substring(randIndex, randIndex+1);
			index[randIndex] = unjumbled.length()+100;
		}
		System.out.println(jumbled);
	}
}

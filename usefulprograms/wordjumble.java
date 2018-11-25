import java.util.Scanner;
import java.util.Random;

public class wordjumble {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter a word: ");
		String unjumbled = scan.nextLine();
		int len = unjumbled.length();
		int[] indexChoices = {0, 1, 2, 3, 4, 5};
		int randomIndex = indexChoices[0];
		String jumbled = "";
		for (int x = 0; x < len; x++) {
			while (randomIndex == len) {
				randomIndex = indexChoices[rand.nextInt(6)];
				System.out.print(randomIndex + " ");
			}
			System.out.println();
			jumbled += unjumbled.substring(randomIndex, randomIndex+1);
			for (int y = 0; y < len; y++){
				if (indexChoices[x] == randomIndex){
					indexChoices[x] = len;
				}
			}
		}
		System.out.println(jumbled);
	}
}

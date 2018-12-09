import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

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
		boolean hasRepeatedLetter = false;
		int numOfRepeatedLetters = 0;
		for (int x = 0; x < unjumbled.length(); x++){
			for (int y = 0; y < unjumbled.length(); y++){
				if ((x != y) && (unjumbled.substring(x, x+1).equals(unjumbled.substring(y, y+1)))){
					hasRepeatedLetter = true;
					break;
				}
			}
		}
		ArrayList<String> repeatedLetters = new ArrayList<String>();
		for (int x = 0; x < unjumbled.length(); x++){
			for (int y = 0; y < unjumbled.length(); y++){
				if ((x != y) && (unjumbled.substring(x, x+1).equals(unjumbled.substring(y, y+1)))){
					numOfRepeatedLetters++;
					System.out.println("Repeated letter found");
					repeatedLetters.add(unjumbled.substring(x, x+1));
				}
			}
		}
		System.out.println(numOfRepeatedLetters);
		for (int x = 0; x < unjumbled.length(); x++){
			do {
				randIndex = rand.nextInt(indexlen);
				charact = unjumbled.substring(randIndex, randIndex+1);
				if (!jumbled.contains(charact)) {
					if (index[randIndex] != unjumbled.length()+100){
						if (repeatedLetters.contains(charact)){
							break;
						}else {
							break;
						}
					}
				}
			} while (true);
			jumbled += unjumbled.substring(randIndex, randIndex+1);
			System.out.print("jumbled: " + jumbled + "\t\t\t");
			System.out.print("hasRepeatedLetter: " + hasRepeatedLetter + "\t\t\t");
			System.out.print("x: " + x + "\t\t\t");
			System.out.println("unjumbled.length()-" + numOfRepeatedLetters + ": " + (unjumbled.length()-numOfRepeatedLetters));
			if ((hasRepeatedLetter) && (x == unjumbled.length()+1)) {
				jumbled += repeatedLetters.get(x);
				System.out.println(jumbled);
				break;
			}
			index[randIndex] = unjumbled.length()+100;
		}
		System.out.println(jumbled);
	}
}

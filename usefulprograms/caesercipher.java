import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class caesercipher {
	public static void main(String[] args) {
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter word to encrypt: ");
		String word = input.nextLine();
		System.out.print("Enter the key (#): ");
		int key = input.nextInt();
		char[] encryption = new char[word.length()];
		for (int x = 0; x < encryption.length; x++) {
				encryption[x] = letters[(Arrays.binarySearch(letters, Character.toLowerCase(word.charAt(x)))+key)%25];
		}
		for (int x = 0; x < encryption.length; x++) {
			System.out.print(encryption[x]);
		}
		System.out.println();
	}
}

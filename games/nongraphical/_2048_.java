import java.util.Scanner;
import java.util.Random;

public class _2048_ {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int[] numbers = {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] gridarr = new int[16];
		for (int x = 0; x < 16; x++){
			gridarr[x] = numbers[rand.nextInt(16)];
		}
		printgrid(gridarr);
	}
	public static void printgrid(int[] arr) {
		for (int x = 0; x < 16; x+=4){
			System.out.printf("[%d][%d][%d][%d]\n", arr[x], arr[x+1], arr[x+2], arr[x+3]);
		}
	}
}

import java.util.Scanner;
import java.util.Arrays;

public class pattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list of terms (separate by comma): ");
		String[] patternstr = input.nextLine().split(", ");
		int[] pattern = new int[patternstr.length];
		for (int x = 0; x < patternstr.length; x++) {
			pattern[x] = Integer.parseInt(patternstr[x]);
		}
		int[] increments = new int[pattern.length-1];
		for (int x = 0; x < pattern.length-1; x++) {
			increments[x] = pattern[x+1]-pattern[x];
		}
		int incrementsInc = increments[1] - increments[0];
		System.out.printf("Start at " + (pattern[0]) + ", " + (increments[0] < 0 ? "Subtract" : "Add") + " %d" + (incrementsInc != 0 ? ", " + (increments[0] > 0 ? (incrementsInc < 0 ? "decrease" : "increase") : (incrementsInc < 0 ? "increase" : "decrease")) + " " + (increments[0] < 0 ? "decrement" : "increment") + " by %d each time\n" : "\n"), Math.abs(increments[0]), Math.abs(incrementsInc));
	}
}

import java.util.*;
import java.lang.*;

// Ask for expression
// Simplify and display steps for solution
// Example: 4 *5 / (6 ^ 9 - 7)+ 9(78 + 8)

public class oopSolver {
	// Define operator charactors
	String []add = {"+"};
	String []sub = {"-"};
	String []mul = {"*", "x", "\u00D7", "\u22C5"};
	String []div = {"/", "\u00F7"};
	String []pow = {"^", "**"};
	String [][]operators = {add, sub, mul, div, pow};

	// Define digits
	String []digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."};

	// Concatenate multiple string arrays
	public static String[] concatenate(String[]... arrays) {
		List<String> list = new ArrayList<>();
		for (String[] array: arrays) {
			Collections.addAll(list, array);
		}
		return list.toArray(new String[0]);
	}

	// Solve expression without brackets
	// Example: 4 / 4 * 2 -5^ 6
	public static String solveBracketRemoved(String expression) {
		String simplified = expression;
		// loop through operator arrays
		for (int x = 0; x < operators.length; x++) {
			for (int y = 0; y < operators[x].length; y++) {
				if (simplified.contains(operators[x][y])) {
					String opIndex = simplified.indexOf(operators[x][y])
					
				}
			}
		}
	}

	public static void main(String[] args) {
		
		// Ask for expression
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an expression: ");
		String expression = input.nextLine();
	}
}

import java.util.*;
import java.lang.*;
import java.text.*;

// Order Of Operation Solver
//     Ask for expression
//      Simplify and display steps for solution

// Example: 
// (2 + 5)(4 -5)- 4 *5 / (6 ^ 3 - 7)+ 9(17 + 8)          Original
// 8 - 10 + 20 - 25 - 4 *5 / (6 ^ 3 - 7)+ 9(17 + 8)      Distribute
// 8 - 10 + 20 - 25 - 4 *5 / (216 - 7)+ 9(17 + 8)        Simplify first bracket
// 8 - 10 + 20 - 25 - 4 *5 / 209 + 9(17 + 8)             Simplify first bracket
// 8 - 10 + 20 - 25 - 4 *5 / 209 + 9(25)                 Simplify second bracket
// 8 - 10 + 20 - 25 - 0.0957 + 9(25)                     Simplify first multiplication/division
// 8 - 10 + 20 - 25 - 0.0957 + 225                       Simplify second multiplication/division
// 217.9043                                              Simplify addition/subtraction

// Steps:
// 1. Distribute if product of two or more polynomials
// 2. Find innermost bracket
// 3. Simplify - exponent -> mul/div -> add/sub
// 4. Repeat step 2 and 3 until no brackets left
// 5. Find exponents and simplify
// 6. Find strings of consecutive multiplication and division operations and simplify
// 7. Simplify remaining addition and subtraction

// Global symbol identifiers
class Symbols {
	// Define operator charactors
	public static final String []add = {"+"};
	public static final String []sub = {"-"};
	public static final String []mul = {"*", "x", "\u00D7", "\u22C5"};
	public static final String []div = {"/", "\u00F7"};
	public static final String []pow = {"^", "**"};
	public static final String [][]operators = {add, sub, mul, div, pow};

	// Define digits
	public static final String []digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."};
}

public class oopSolver {
	public static String fmt(double d) {
		if (d == (long)d) {
			return String.format("%d", (long)d);
		} else {
			return String.format("%s", d);
		}
	}
	public static String signSimplify(String s) {
		String simplifiedSign = (s.length() - s.replace("-", "").length()) % 2 == 0 ? "+" : "-";
		return simplifiedSign;
	}
	// Return simplified value of expression with only addition and subtraction
	// Example: "-24.25 + 4 - 5" -> "-25.25"
	public static String additiveSimplify(String sum) {
		String sign = "";
		String tempNum = "";
		int cnt = 0;
		double []terms = new double[20];
		for (int x = 0; x < sum.length(); x++) {
			if (sum.charAt(x) == '+' || sum.charAt(x) == '-') {
				if (tempNum.equals("")) {
					sign += String.valueOf(sum.charAt(x));
					sign = signSimplify(sign);
				} else {
					terms[cnt++] = Double.parseDouble(sign + tempNum);
					sign = String.valueOf(sum.charAt(x));
					tempNum = "";
				}
			} else if (Arrays.stream(Symbols.digits).anyMatch(String.valueOf(sum.charAt(x))::equals)) {
				tempNum += String.valueOf(sum.charAt(x));
			} else {
				;
			}
		}
		terms[cnt] = Double.parseDouble(sign + tempNum);
		cnt++;
		double sumSimplified = 0;
		for (int x = 0; x < cnt; x++) {
			sumSimplified += terms[x];
		}
		return fmt(sumSimplified);
	}
	public static void multiplicativeSimplify(String product) {
		String tempNum = "";
		int tempOpenCnt = 0;
		int tempOpenCntHolder = 0;
		int endIdx = 0;
		int tempBeginIdx = 0;
		int beginIdx = 0;
		for (int x = 0; x < product.length(); x++) {
			if (String.valueOf(product.charAt(x)).equals("(")) {
				tempOpenCnt++;
				tempBeginIdx = x;
			} else if (String.valueOf(product.charAt(x)).equals(")")) {
				if (tempOpenCnt > tempOpenCntHolder) {
					endIdx = x;
					beginIdx = tempBeginIdx;
					tempOpenCntHolder = tempOpenCnt;
					tempOpenCnt = 0;
				} else {
					;
				}
			} else {
				;
			}
		}
		// (2356)25/2
		// (2356)/3(25)*(3((4)/4))
		System.out.println(beginIdx);
		System.out.println(endIdx);
		System.out.println(product.substring(beginIdx, endIdx+1));
	}
	// Return simplified polynomial after distributing 2 polynomials
	// Example: "4 + 5 - 7", "5" -> "20 + 25 - 35"
	public static String distribute(String polynomial1, String polynomial2) {
		double [][]terms = new double[2][20];
		String []polynomials = {polynomial1, polynomial2};
		int []cnt = new int[2];
		String sign = "";
		String tempNum = "";
		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < polynomials[x].length(); y++) {
				if (polynomials[x].charAt(y) == '+' || polynomials[x].charAt(y) == '-') {
					if (tempNum.equals("")) {
						sign += String.valueOf(polynomials[x].charAt(y));
						sign = signSimplify(sign);
					} else {
						terms[x][cnt[x]++] = Double.parseDouble(sign + tempNum);
						sign = String.valueOf(polynomials[x].charAt(y));
						tempNum = "";
					}
				} else if (Arrays.stream(Symbols.digits).anyMatch(String.valueOf(polynomials[x].charAt(y))::equals)) {
					tempNum += String.valueOf(polynomials[x].charAt(y));
				} else {
					;
				}
			}
			terms[x][cnt[x]] = Double.parseDouble(sign + tempNum);
			cnt[x]++;
			sign = "";
			tempNum = "";
		}
		double []distributedTerms = new double[cnt[0]*cnt[1]];
		for (int x = 0; x < cnt[0]; x++) {
			for (int y = 0; y < cnt[1]; y++) {
				distributedTerms[x*cnt[1]+y] = terms[0][x]*terms[1][y];
			}
		}
		String distributed = fmt(distributedTerms[0]);
		for (int x = 1; x < cnt[0]*cnt[1]-1; x++) {
			double tempTerm = distributedTerms[x];
			distributed += (tempTerm >= 0 ? " + " : " - ") + fmt(Math.abs(tempTerm));
		}
		distributed += (distributedTerms[cnt[0]*cnt[1]-1] >= 0 ? " + " : " - ") + fmt(Math.abs(distributedTerms[cnt[0]*cnt[1]-1]));
		return distributed;
	}

	public static void main(String[] args) {
		// Ask for expression
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an expression: ");
		String expression = input.nextLine();
		System.out.println("(\"23.25 - -35 + 42\", \"-36 + 25.36 - 35\")");
		System.out.println(distribute("23.25 - -35 + 42", "-36 + 25.36 - 35"));
		System.out.println("(\"24 + 35 - 36 - 356.25- 35\")");
		System.out.println(additiveSimplify("24 + 35 - 36 - 356.25- 35"));
		System.out.println(additiveSimplify(distribute("23.25 - -35 + 42", "-36 + 25.36 - 35")));
		System.out.println("(2356)/3(25)*(3((4)/4))");
		multiplicativeSimplify("(2356)/3(25)*(3((4)/4))");
	}
}

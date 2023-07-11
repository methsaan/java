import java.util.*;
import java.lang.*;
import java.text.*;

// Order Of Operation Solver
// Ask for expression
// Simplify and display steps for solution

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
	// Define operator characters
	public static final String []add = {"+"};
	public static final String []sub = {"-"};
	public static final String []mul = {"*", "x", "\u00D7", "\u22C5"};
	public static final String []div = {"/", "\u00F7"};
	public static final String []pow = {"^", "**"};
	public static final String [][]operators = {add, sub, mul, div, pow};

	// Define digits
	public static final String []digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."};
	public static final String []digitsMul = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "-", "+"};
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
	// Simplify group of multiplication and division operations not including brackets or bracket multiplication
	// 6*2 / 5 *25 -> 60.0
	public static String multiplicativeOpSimplify(String product) {
		double tempFirst = 1;
		double tempSecond = 1;
		String tempNum = "";
		boolean prod = true;
		boolean tempProd = true;
		boolean nonNumericBetween = false;
		boolean numeric = false;
		boolean reset = false;
		for (int x = 0; x < product.length(); x++) {
			if (Arrays.stream(Symbols.digitsMul).anyMatch(String.valueOf(product.charAt(x))::equals)) {
				numeric = true;
				if (!nonNumericBetween) {
					tempNum += String.valueOf(product.charAt(x));
				} else {
					tempNum = "1";
				}
				reset = false;
			} else if (Arrays.stream(Symbols.mul).anyMatch(String.valueOf(product.charAt(x))::equals)) {
				tempSecond = Double.parseDouble(tempNum);
				tempNum = "";
				tempProd = prod;
				prod = true;
				nonNumericBetween = false;
				numeric = false;
				reset = true;
			} else if (Arrays.stream(Symbols.div).anyMatch(String.valueOf(product.charAt(x))::equals)) {
				tempSecond = Double.parseDouble(tempNum);
				tempNum = "";
				tempProd = prod;
				prod = false;
				nonNumericBetween = false;
				numeric = false;
				reset = true;
			} else {
				if (numeric) {
					nonNumericBetween = true;
				}
				reset = false;
			}
			if (reset) {
				if (tempProd) {
					tempFirst = tempFirst * tempSecond;
				} else {
					tempFirst = tempFirst / tempSecond;
				}
			}
		}
		tempSecond = Double.parseDouble(tempNum);
		if (prod) {
			tempFirst = tempFirst * tempSecond;
		} else {
			tempFirst = tempFirst / tempSecond;
		}
		return fmt(tempFirst);
	}
	// Simplify bracket multiplication
	// (4)(-3)(3.5) -> -42
	// (6)4(22) -> 528
	// (6)(4)22 -> 528
	// 6(4)22 -> 528
	public static String multiplyBracketSimplify(String product) {
		double total = 1;
		String tempProduct = product;
		int index = tempProduct.indexOf("(");
		while (index != -1) {
			String tempNumStr = "";
			String tempStr = "";
			int closeIdx = index;
			for (int x = index; tempProduct.charAt(x) != ')'; x++) {
				tempStr += String.valueOf(tempProduct.charAt(x));
				if (Arrays.stream(Symbols.digitsMul).anyMatch(String.valueOf(tempProduct.charAt(x))::equals)) {
					tempNumStr += String.valueOf(tempProduct.charAt(x));
				}
				closeIdx = x;
			}
			tempStr += ")";
			closeIdx += 2;
			double tempNum = Double.parseDouble(tempNumStr);
			total *= tempNum;
			StringBuilder tempNewStr = new StringBuilder(tempProduct);
			tempNewStr = tempNewStr.delete(index, closeIdx);
			tempNewStr.insert(index, 'x');
			tempProduct = tempNewStr.toString();
			index = tempProduct.indexOf("(");
		}
		String tempNumStr = "";
		for (int x = 0; x < tempProduct.length(); x++) {
			if (Arrays.stream(Symbols.digitsMul).anyMatch(String.valueOf(tempProduct.charAt(x))::equals)) {
				tempNumStr += String.valueOf(tempProduct.charAt(x));
			} else {
				if (!tempNumStr.equals("")) {
					total *= Double.parseDouble(tempNumStr);
					tempNumStr = "";
				}
			}
		}
		if (!tempNumStr.equals("")) {
			total *= Double.parseDouble(tempNumStr);
			tempNumStr = "";
		}
		return fmt(total);
	}
	// Simplify multiplicative operations including bracket multiplication
	// Example: "4(2)/ 42*0.7(-14) * 10" -> "-18.66666..."
	public static String multiplicativeSimplify(String expression) {
		String tempExpression = "1*" + expression;
		int idxParen = tempExpression.indexOf("(");
		while (idxParen != -1) {
			int idxStart = 0;
			int idxEnd = 0;
			String[] mulDivOp = Arrays.copyOf(Symbols.mul, Symbols.mul.length + Symbols.div.length);
			System.arraycopy(Symbols.div, 0, mulDivOp, Symbols.mul.length, Symbols.div.length);
			for (int x = idxParen; !Arrays.stream(mulDivOp).anyMatch(String.valueOf(tempExpression.charAt(x))::equals) && x >= 0; x--) {
				idxStart = x;
			}
			for (int x = idxParen; !Arrays.stream(mulDivOp).anyMatch(String.valueOf(tempExpression.charAt(x))::equals) && x <= tempExpression.length(); x++) {
				idxEnd = x+1;
			}
			String evalBrackets = multiplyBracketSimplify(tempExpression.substring(idxStart, idxEnd));
			StringBuilder tempNewStr = new StringBuilder(tempExpression);
			tempNewStr = tempNewStr.delete(idxStart, idxEnd);
			tempNewStr.insert(idxStart, evalBrackets);
			tempExpression = tempNewStr.toString();
			idxParen = tempExpression.indexOf("(");
		}
		String result = multiplicativeOpSimplify(tempExpression);
		return result;
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
	public static boolean containsExponent(String expression) {
		for (int x = 0; x < expression.length(); x++) {
			if (Arrays.stream(Symbols.pow).anyMatch(String.valueOf(expression.charAt(x))::equals)) {
				return true;
			}
		}
		return false;
	}
	public static boolean containsAddSub(String expression) {
		String[] addSubOp = Arrays.copyOf(Symbols.add, Symbols.add.length + Symbols.sub.length);
		System.arraycopy(Symbols.sub, 0, addSubOp, Symbols.add.length, Symbols.sub.length);
		for (int x = 0; x < expression.length(); x++) {
			if (Arrays.stream(addSubOp).anyMatch(String.valueOf(expression.charAt(x))::equals)) {
				return true;
			}
		}
		return false;
	}
	public static boolean containsMulDiv(String expression) {
		String[] mulDivOp = Arrays.copyOf(Symbols.mul, Symbols.mul.length + Symbols.div.length);
		System.arraycopy(Symbols.div, 0, mulDivOp, Symbols.mul.length, Symbols.div.length);
		if (expression.indexOf("(") != -1) {
			return true;
		}
		for (int x = 0; x < expression.length(); x++) {
			if (Arrays.stream(mulDivOp).anyMatch(String.valueOf(expression.charAt(x))::equals)) {
				return true;
			}
		}
		return false;
	}
	public static String extractMulDiv(String expression, int idxRef) {
		String[] allOp = Arrays.copyOf(Symbols.mul, Symbols.mul.length + Symbols.div.length + Symbols.digits.length + 3);
		System.arraycopy(Symbols.div, 0, allOp, Symbols.mul.length, Symbols.div.length);
		System.arraycopy(Symbols.digits, 0, allOp, Symbols.mul.length + Symbols.div.length, Symbols.digits.length);
		allOp[allOp.length-3] = " ";
		allOp[allOp.length-2] = "(";
		allOp[allOp.length-1] = ")";
		String[] mulDivOp = Arrays.copyOf(Symbols.mul, Symbols.mul.length + Symbols.div.length);
		System.arraycopy(Symbols.div, 0, mulDivOp, Symbols.mul.length, Symbols.div.length);
		int startIdx = 0;
		int endIdx = 0;
		boolean minus = false;
		int idxMinus = 0;
		// 4-(2)/ 42*3-0.7(-14) * 10
		for (int x = idxRef; x >= 0; x--) {
			System.out.println("->" + String.valueOf(expression.charAt(x)));
			if (Arrays.stream(allOp).anyMatch(String.valueOf(expression.charAt(x))::equals)) {
				System.out.println("Part of mul/div string.");
				startIdx = x;
			} else {
				System.out.println("Not part of mul/div string.");
				if (expression.charAt(x) == '-') {
					System.out.println("Minus.");
					minus = true;
					idxMinus = x + 1;
				} else {
					System.out.println("Additive.");
					break;
				}
			}
			if (minus && !Arrays.stream(mulDivOp).anyMatch(String.valueOf(expression.charAt(x))::equals) && x + 1 < idxMinus) {
				System.out.println("Minus is not a negative symbol.");
				startIdx = idxMinus;
				break;
			}/* else {
				minus = false;
			}*/
		}
		System.out.println(startIdx);
		return "";
	}
	// Simplify expression containing all operations except for brackets
	//public static String simplifyAll(String expression) {
	//	String tempExpression = expression;
	//	while (tempExpression) {
	//	}
	//}
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
		System.out.println("6*2 / 5 *25");
		System.out.println(multiplicativeOpSimplify("6*2 / 5 *25"));
		System.out.println("6*-32033/ 5 *25");
		System.out.println(multiplicativeOpSimplify("6*-32033/ 5 *25"));
		// (4)(-3)(3.5) -> -42
		// (6)4(22) -> 528
		// (6)(4)22 -> 528
		// 6(4)22 -> 528
		// 6(4(22 -> 528
		System.out.println("(4)(-3)(3.5)");
		System.out.println(multiplyBracketSimplify("(4)(-3)(3.5)"));
		System.out.println("6(4)");
		System.out.println(multiplyBracketSimplify("6(4)"));
		System.out.println("(6)232(4)22");
		System.out.println(multiplyBracketSimplify("(6)232(4)22"));
		System.out.println("4(2)/ 42*0.7(-14) * 10");
		System.out.println(multiplicativeSimplify("4(2)/ 42*0.7(-14) * 10"));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("4-(2)/ 42*0.7(-14) * 10");
		System.out.println(extractMulDiv("4-(2)/ 42*0.7(-14) * 10", 9));
		System.out.println("4-(2)/ 42*-0.7(-14) * 10");
		System.out.println(extractMulDiv("4-(2)/ 42*-0.7(-14) * 10", 14));
		System.out.println("4-(2)/ 42*3-0.7(-14) * 10");
		System.out.println(extractMulDiv("4-(2)/ 42*3-0.7(-14) * 10", 15));
	}
}

public class term {
	private static int coefficient;
	private static String variable;
	private static String polarity;
	public static int coefficient() {
		return coefficient;
	}
	public static String variable() {
		return variable;
	}
	public static String polarity() {
		return polarity;
	}
	public static void setCoefficient(int num) {
		coefficient = num;
		polarity = coefficient < 0 ? "-" : "+";
	}
	public static void setVariable(String str) {
		variable = str;
	}
	public static void setPolarity(String str) {
		polarity = str;
	}
}

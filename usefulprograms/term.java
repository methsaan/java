public class term {
	private int coefficient;
	private String variable;
	private String polarity;
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
	}
	public static void setVariable(String str) {
		variable = str;
	}
	public static void setPolarity(String str) {
		polarity = str;
	}
}

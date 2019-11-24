import java.math.RoundingMode;
import java.text.DecimalFormat;

public class money {
	private double dollars;
	public money(double dollars) {
		this.dollars = dollars;
	}
	public double getDollarValue() {
		return dollars;
	}
	public String stringVal() {
		return String.format("$%.2f", dollars);
	}
}

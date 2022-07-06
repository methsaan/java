import java.util.Scanner;
import java.util.ArrayList;

public class moneyCoins {
	public static void main(String[] args) {
		money nickel = new money(0.05);
		money dime = new money(0.10);
		money quarter = new money(0.25);
		money dollar = new money(1);
		money twoDollar = new money(2);
		money fiveDollar = new money(5);
		money tenDollar = new money(10);
		money twentyDollar = new money(20);
		money fiftyDollar = new money(50);
		money hundredDollar = new money(100);
		money []orderedBills = {nickel, dime, quarter, dollar, twoDollar, fiveDollar, tenDollar, twentyDollar, fiftyDollar, hundredDollar, new money(-1)};
		ArrayList<String> billCoins = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value in dollars: ");
		double dollars = input.nextDouble();
		dollars *= 20;
		dollars = Math.ceil(dollars);
		dollars /= 20;
		double tempDollars = dollars;
		money closestAmount = new money(0);
		while (tempDollars > 0) {
			for (int x = 0; x < orderedBills.length-1; x++) {
				closestAmount = orderedBills[x];
				if (orderedBills[x+1].getDollarValue() > tempDollars) {
					break;
				}
			}
			billCoins.add(closestAmount.stringVal());
			tempDollars -= closestAmount.getDollarValue();
			tempDollars *= 100;
			tempDollars = Math.round(tempDollars);
			tempDollars /= 100;
		}
		System.out.println(new money(dollars).stringVal() + ": " + billCoins);
	}
}

import java.util.Scanner;
import java.util.ArrayList;

public class moneyCoins {
	public static void main(String[] args) {
		money nickel = new money(0.05);
		money dime = new money(0.1);
		money quarter = new money(0.25);
		money dollar = new money(1);
		money twoDollar = new money(2);
		money fiveDollar = new money(5);
		money tenDollar = new money(10);
		money fiftyDollar = new money(50);
		money hundredDollar = new money(100);
		money []bills = {nickel, dime, quarter, dollar, twoDollar, fiveDollar, tenDollar, fiftyDollar, hundredDollar};
		money []billsCoins = new money[30];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value: ");
		double value = Double.parseDouble(input.nextLine().substring(1));
		money tempVal = new money(value);
		int cnt = 0;
		while (tempVal.getValue() != 0) {
			double valueAdded = 0;
			for (int x = 0; x < 9; x++) {
				if (bills[x].getValue()*2 > tempVal.getValue()) {
					billsCoins[cnt] = bills[x];
					cnt++;
					valueAdded = bills[x].getValue();
					break;
				}
			}
			tempVal.setValue(tempVal.getValue()-valueAdded);
		}
		for (int x = 0; x < cnt; x++) {
			System.out.print(billsCoins[x].getValue() + " ");
		}
		System.out.println();
	}
}

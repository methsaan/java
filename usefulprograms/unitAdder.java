import java.util.Scanner;

public class unitAdder {
	public static void main(String[] args) {
		String[] metricUnits = {"mm", "cm", "dm", "m", "dam", "hm", "km"};
		String[] imperialUnits = {"th", "in", "ft", "yd", "ch", "fur", "mi"};
		int[] imperialConversions = {12, 12, 3, 22, 10, 8};
		int[] metricConversions = {10, 10, 10, 10, 10, 10};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first measurement: ");
		String firstnum = input.nextLine();
		System.out.print("Enter second measurement: ");
		String secondnum = input.nextLine();
	}
} 

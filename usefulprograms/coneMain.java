import java.util.*;

public class coneMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] values = new String[4];
		Map measurementVal = new Hashtable();
		System.out.println("Enter cone measurements (radius, height, area, volume) ( _ for missing): ");
		values = input.nextLine().split(" ");
		for (int x = 0; x < 4; x++) {
			String[] valueNames = {"radius", "height", "area", "volume"};
			measurementVal.put(valueNames[x], values[x]);
		}
		System.out.println(measurementVal);
		cone c = new cone(String.valueOf(measurementVal.get("radius")), String.valueOf(measurementVal.get("height")), String.valueOf(measurementVal.get("area")), String.valueOf(measurementVal.get("volume")));
		while (true) {
			c.fillHeight();
			c.printValues();
			c.fillRadius();
			c.printValues();
			c.fillVolume();
			c.printValues();
			c.fillArea();
			c.printValues();
		}
	}
}

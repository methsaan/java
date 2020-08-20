import java.util.Arrays;

public class cone {
	public static double radius;
	public static double height;
	public static double area;
	public static double volume;
	private static int valuesSet;
	public cone(String r, String h, String a, String v) {
		radius = !r.equals("_") ? Integer.parseInt(r) : -1;
		height = !h.equals("_") ? Integer.parseInt(h) : -1;
		area = !a.equals("_") ? Integer.parseInt(a) : -1;
		volume = !v.equals("_") ? Integer.parseInt(v) : -1;
	}
	public void setValuesSet(int valuesSet) {
		this.valuesSet = valuesSet;
	}
	public static int getValuesSet() {
		return valuesSet;
	}
	public static void fillVolume() {
		if (radius != -1 && height != -1) {
			volume = Math.PI*Math.pow(radius, 2)*(height/3);
		}
	}
	public static void fillArea() {
		if (radius != -1 && height != -1) {
			area = (Math.PI*Math.pow(radius, 2)) + (Math.PI*radius*(Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2))));
		}
	}
	public static void fillHeight() {
		if (radius != -1 && volume != -1) {
			height = (volume*3)/Math.pow(radius, 2)/Math.PI;
		}
	}
	public static void fillRadius() {
		if (height != -1 && volume != -1) {
			radius = ((volume*3)/height)/(2*Math.PI);
		}
	}
	public void printValues() {
		if (this.getValuesSet() != 2) {
			System.out.printf("radius: %s, volume: %s, height: %s, area: %s\n", fmt(radius), fmt(volume), fmt(height), fmt(area));
		}
	}
	public boolean fullInit() {
		if (radius != -1.0 && height != -1.0 && area != -1.0 && volume != -1.0) {
			return true;
		} else if (this.getValuesSet() == 2) {
			System.out.printf("Invalid arguments: Cannot calculate %s from %s\n", printList(radius != -1 ? "" : "radius", height != -1 ? "" : "height", area != -1 ? "" : "area", volume != -1 ? "" : "volume"), printList(radius == -1 ? "" : "radius", height == -1 ? "" : "height", area == -1 ? "" : "area", volume == -1 ? "" : "volume"));
			return true;
		}
		return false;
	}
	private static String fmt(double d) {
		if (d == (long)d)
			return String.format("%d", (long)d);
		else
			return String.format("%s", d);
	}
	private static String printList(String... itemsTot) {
		String result = "";
		int y = 0;
		int count = 0;
		for (int i = 0; i < itemsTot.length; i++) {
			if(itemsTot[i].equals("")) {
				count++;
			}
		}
		String[] items = new String[count];
		for (int x = 0; x < itemsTot.length; x++) {
			if (!itemsTot[x].equals("")) {
				items[y] = itemsTot[x];
				y++;
			}
		}
		for (int x = 0; x < items.length; x++) {
			result += x == items.length-1 ? (" and " + items[x]) : ((items[x] == "" || x == items.length-2) ? items[x] : (items[x] + ", "));
		}
		return result;
	}
}

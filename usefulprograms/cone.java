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
	public static void printValues() {
		System.out.println("radius: " + radius + ", volume: " + volume + ", height: " + height + ", area: " + area);
	}
	public boolean fullInit() {
		if (radius != -1.0 && height != -1.0 && area != -1.0 && volume != -1.0) {
			System.out.println("Worked");
			return true;
		} else if (this.getValuesSet() == 2) {
			System.out.printf("Invalid arguments: Cannot calculate %s from %s\n", printList(radius != -1 ? "" : "radius", height != -1 ? "" : "height", area != -1 ? "" : "area", volume != -1 ? "" : "volume"), printList(radius == -1 ? "" : "radius", height == -1 ? "" : "height", area == -1 ? "" : "area", volume == -1 ? "" : "volume"));
			return true;
		} else {
			System.out.println("Running");
		}
		return false;
	}
	private static String printList(String... itemsTot) {
		String result = "";
		int[] items = new int[itemsTot.length];
		System.arraycopy(itemsTot, 0, items, 0, itemsTot.length);
		//##############################################################################################################
		// remove empty strings
		for (int x = 0; x < items.length;
		for (int x = 0; x < items.length; x++) {
			result += x == items.length-1 ? ("and " + items[x]) : ((items[x] == "" || x == items.length-2) ? items[x] : (items[x] + ", "));
		}
		return result;
	}
}

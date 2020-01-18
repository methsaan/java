public class cone {
	public static double radius;
	public static double height;
	public static double area;
	public static double volume;
	public cone(String r, String h, String a, String v) {
		radius = !r.equals("_") ? Integer.parseInt(r) : -1;
		height = !h.equals("_") ? Integer.parseInt(h) : -1;
		area = !a.equals("_") ? Integer.parseInt(a) : -1;
		volume = !v.equals("_") ? Integer.parseInt(v) : -1;
	}
	public static void fillVolume() {
		if (radius != -1 && height != -1) {
			volume = ((2*Math.PI)*radius*height)/3;
		}
	}
	public static void fillArea() {
		if (radius != -1 && height != -1) {
			area = Math.PI*radius*(radius+Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
		}
	}
	public static void fillHeight() {
		if (radius != -1 && volume != -1) {
			area
		}
	}
}

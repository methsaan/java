public class cone {
	public static double radius;
	public static double height;
	public static double area;
	public static double volume;
	public cone(String r, String h, String a, String v) {
		radius = r != "_" ? r : -1;
		height = h != "_" ? h : -1;
		area = a != "_" ? a : -1;
		volume = v != "_" ? v : -1;
	}
	public static String area() {
		return new coneMethod({"radius", "height"}, ((2*Math.pi)*r*h)/3);
	}
}

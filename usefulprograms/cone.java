import java.util.Arrays;

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
			volume = Math.PI*Math.pow(radius, 2)*(height/3);
			System.out.println("Calculating volume");
			System.out.printf("PI*(%f^2)*(%f/3)\n", radius, height);
		}
	}
	public static void fillArea() {
		if (radius != -1 && height != -1) {
			area = (Math.PI*Math.pow(radius, 2)) + (Math.PI*radius*(Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2))));
			System.out.println("Calculating area");
			System.out.printf("(PI*%f^2) + (PI*%f*(sqrt(%f^2 + %f^2)))\n", radius, radius, radius, height);
		}
	}
	public static void fillHeight() {
		if (radius != -1 && volume != -1) {
			height = (volume*3)/Math.pow(radius, 2)/Math.PI;
			System.out.println("Calculating height");
			System.out.printf("(%f*3)/%f^2/PI\n", volume, radius);
		}
	}
	public static void fillRadius() {
		if (height != -1 && volume != -1) {
			radius = ((volume*3)/height)/(2*Math.PI);
			System.out.println("Calculating radius");
			System.out.printf("((%d*3)/%d)/(2*PI)\n", volume, height);
		}
	}
	public static void printValues() {
		System.out.println("radius: " + radius + ", volume: " + volume + ", height: " + height + ", area: " + area);
	}
	public static boolean fullInit() {
		if (radius != -1.0 && height != -1.0 && area != -1.0 && volume != -1.0) {
			return true;
		}
		return false;
	}
}

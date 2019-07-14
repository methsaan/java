import java.io.*;
import java.lang.*;
import java.util.*;

public class evalfile {;
	public static void main(String[] args) throws IOException {
		try {
			Object[] val = {};
			for (int x = 0; x < val.length; x++) {
				System.out.println(val[x].toString());
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static String q() {
		return "Error: running outside of eval";
	}
	public static void clear() {
		System.out.print("\033[H\033[2J");
	}
	public static void run(String x) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("runscript"));
		ProcessBuilder shell = new ProcessBuilder();
		out.write(x);
		out.close();
		ProcessBuilder pb = new ProcessBuilder("./runscript");
		pb.inheritIO();
		pb.directory(new File("/home/test/programming/java/usefulprograms/"));		pb.start();
	}
}

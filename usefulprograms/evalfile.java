import java.io.*;
import java.lang.*;
import java.util.*;

public class evalfile {;
	public static void main(String[] args) {
		try {
			Object[] val = {13+2431};
			for (int x = 0; x < val.length; x++) {
				System.out.println(val[x].toString());
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static String eval_q() {
		return "Error: running outside of eval.java";
	}
	public static String eval_clear() {
		return "[H[2J";
	}
	public static String eval_run(String x) throws IOException {
		ProcessBuilder pb = new ProcessBuilder(x);
		pb.inheritIO();
		pb.directory(new File("/home/test/programming/java/usefulprograms/"));		pb.start();
		return "eval_run()";
	}
}

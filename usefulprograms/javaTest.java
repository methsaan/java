import java.util.*;
import java.io.*;

public class javaTest {
	public static void printResults(Process process) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
	public static void main(String[] args) throws IOException {
		Process process = Runtime.getRuntime().exec("ping 4.2.2.2");
		printResults(process);
	}
}

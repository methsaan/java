import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class fileReader {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(new File("testfile.txt"));
		System.out.println(reader.nextInt());
		System.out.println(reader.nextDouble());
		System.out.println(reader.nextLine());
		reader.close();
	}
}

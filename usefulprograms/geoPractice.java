import java.*;

public class geoPractice {
	public static void main(String[] args) {
		run("ls");
		run("echo hello");
		run("java pascal");
	}
	public static void run(String x) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("runscript"));
		ProcessBuilder shell = new ProcessBuilder();
		out.write(x);
		out.close();
		ProcessBuilder pb = new ProcessBuilder("./runscript");
		pb.inheritIO();
		pb.directory(new File("/home/test/programming/java/usefulprograms/"));
		pb.start();
	}
}

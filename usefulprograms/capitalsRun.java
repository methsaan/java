public class capitalsRun {
	public static void main(String[] args) {
		capitals c = new capitals();
		double score = c.quiz(Integer.parseInt(args[0]));
		System.out.println("Score: " + score + "%");
	}
}

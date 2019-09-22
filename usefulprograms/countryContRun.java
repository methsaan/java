public class countryContRun {
	public static void main(String[] args) {
		countryContinent cc = new countryContinent();
		double score = cc.quiz(Integer.parseInt(args[0]));
		System.out.println("Score: " + score + "%");
	}
}

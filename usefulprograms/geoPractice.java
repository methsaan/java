import java.util.Scanner;

public class geoPractice {
	public static void main(String[] args) {
		countryContinent cc = new countryContinent();
		capitals c = new capitals();
		Scanner input = new Scanner(System.in);
		double[] scores = new double[Integer.parseInt(args[0])*2];
		int cnt = 0;
		for (int x = 0; x < Integer.parseInt(args[0]); x++) {
			System.out.print("Country-continent\nHow many questions: ");
			double score1 = cc.quiz(input.nextInt());
			System.out.println("Score: " + score1 + "%");
			scores[cnt++] = score1;
			System.out.print("Capital cities\nHow many questions: ");
			double score2 = c.quiz(input.nextInt());
			System.out.println("Score: " + score2 + "%");
			scores[cnt++] = score2;
		}
		double avg = 0;
		for (int x = 0; x < scores.length; x++) {
			avg += scores[x];
		}
		avg /= scores.length;
		System.out.println("Total score: " + avg + "%");
	}
}

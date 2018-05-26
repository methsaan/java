import java.util.*;

public class unknownSpot {
	public static void main(String[] args){
		int points = 0;
		System.out.println("Welcome to Unknown Spot");
		for (int x = 0; x < 16; x++) {
			String[] choices = new String[] {"a", "b", "c", "d"};
			Random randObj = new Random();
			int randChoice = randObj.nextInt(4);
			System.out.print("Enter 'a', 'b', 'c' or 'd': ");
			Scanner scanObj = new Scanner(System.in);
			String trueOrFalseInput = scanObj.nextLine();
			if (trueOrFalseInput.equals(choices[randChoice])) {
				System.out.println("You found treasure!");
				points += 1;
			}else {
				System.out.println("Whoops, no gold here.");
			}
		}
		System.out.println("Score: " + points);
		System.out.print((points/16.00)*100);
		System.out.println("%");
		System.out.println("Credits: Designer: Methuki Laknara Wickramasinghe, Creator: Methsaan Dinakara Wickramasinghe, Dedicated to: Pamini Wickramasinghe");
	}
}

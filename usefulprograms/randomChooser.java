import java.util.*;

public class randomChooser {
	public static void main(String[] args){
		System.out.printf("Welcome to the random chooser.\nEnter number of items: ");
		Scanner scanObj = new Scanner(System.in);
		int numOfTimes = scanObj.nextInt();
		String[] listx = {}
		Random randObj = new Random();
		for (int x = 0; x <= numOfTimes; x++) {
			System.out.printf("Enter item number %i\n", numOfTimes);
			listx[x] = scanObj.nextLine();
		}
		String chosenOne = breakfasts[randObj.nextInt(numOfItems-1)];
		System.out.println("The chosen item is " + chosenOne);
	}
}

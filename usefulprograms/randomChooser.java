import java.util.*;

public class randomChooser {
	public static void main(String[] args){
		int numberOfItems;
		System.out.print("Welcome to the random chooser.\nEnter number of items (max: 5): ");
		Scanner numOfItms = new Scanner(System.in);
		numberOfItems = numOfItms.nextInt();
		String[] itemArray = new String[numberOfItems];
		for (int x = 0; x > numberOfItems; x++){
			System.out.println("Enter Item " + x + ": ");
			Scanner nextItem = new Scanner(System.in);
			itemArray[x] = nextItem.nexLine();
		}
		Random randClass1 = new Random();
		int randChoice = randClass1.nextInt(numberOfItems);
		System.out.println("The chosen item is: " + itemArray[randChoice]);
	}
}

import java.util.*;

public class randomChooser {
	public static void main(String[] args){
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Random Chooser.");
		System.out.println("Enter number of items: ");
		Scanner scanTwo = new Scanner(System.in);
		int numOfItems = scanTwo.nextInt();
		System.out.println("What is it you are trying to do? ");
		String info = scan.nextLine();
		System.out.println("Wow, Interesting!");
		String[] itemList = new String[numOfItems];
		for (int x = 1; x <= numOfItems; x++) {
			System.out.print("Enter item number " + x + ": ");
			String nextItem = scan.nextLine();
			itemList[x-1] = nextItem;
		}
		int i = generator.nextInt(numOfItems);
		System.out.println("The chosen item is: " + itemList[i]);
	}
}

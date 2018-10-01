import java.util.Arrays;
import java.util.Random;

public class arrayMath {
	public static void main(String[] args) {
		int[] mathArray = {19,43,555,1,22,-33,55,-56,-1000,434};
		Random randomChooser1;
		int randNum1;
		Random randomChooser2;
		int randNum2;
		int sumArray;
		System.out.print("mathArray: ");
		for (int x = 0; x < mathArray.length; x++){
			System.out.print(mathArray[x] + " ");
		}
		System.out.println();
		for (int x = 0; x < 6; x++) {
			randomChooser1 = new Random();
			randNum1 = randomChooser1.nextInt(9) + 0;
			randomChooser2 = new Random();
			randNum2 = randomChooser2.nextInt(9) + 0;
			sumArray = mathArray[randNum1] + mathArray[randNum2];
			System.out.println("Adding " + mathArray[randNum1] + " and " + mathArray[randNum2]);
			System.out.println("Adding random numbers from mathArray: " + sumArray);
		}
	}
}

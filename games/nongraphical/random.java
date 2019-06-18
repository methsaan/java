import java.util.Random;
import java.util.Arrays;

public class random {
	public static int randrange(int start, int end){
		Random randObj = new Random();
		int low = start;
		int high = end;
		int result = randObj.nextInt(high-low) + low;
		return result;
	}
	public static String randChoice(String... array){
		Random randObj = new Random();
		int index = randObj.nextInt(array.length);
		return array[index];
	}
}

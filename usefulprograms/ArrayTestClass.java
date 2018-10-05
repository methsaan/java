import java.util.Arrays;

public class ArrayTestClass{
	public static void main(String[] args){
		Array a = new Array(12, 76, 23, 357, 32 ,6, 13265, 456, 32767, 16384);
		Array b = new Array(12, 35, 125, 3456, 234, 476, 324, 547, 5, 357, 2);
		String aString = a.toString();
		String bString = b.toString();
		System.out.println("a: " + aString);
		System.out.println("b: " + bString);
		boolean c = a.equals(b);
		System.out.println("Is a equal to b? " + c);
		int size = a.size();
		System.out.println("a.size(): " + size);
		int eighthOfB = b.get(7);
		System.out.println("Eighth element of b: " + eighthOfB);
		a.append(436);
		aString = a.toString();
		System.out.println("a is now: " + a);
		System.out.println("b is now: " + b);
		System.out.println("Length of a: " + a.size());
	}
}

import java.util.Random;
import java.util.Arrays;

public class sentenceBuilder {
	public static void main(String[] args) {
		String[] SingularArticles = new String[4] {"a", "the", "any", "every"};
		String[] CommonAnimateSubject = new String[10] {"man", "person", "woman", "boy", "girl", "dog", "cat", "monkey", "pig", "wolf"};
		String[] VerbsAnimatePresent = new String[9] {"wants", "has", "likes", "throws", "dislikes", "sees", "approaches", "hears", "rejects"};
		String[] CommonObjects = new String[7] CommonObjects = {"book", "banana", "person", "apple", "pancake", "computer", "animal"};
		Random rand = new Random();
		int randSA = rand.nextInt(4);
		int randCAS = rand.nextInt(10);
		int randVAP = rand.nextInt(9);
		int randCO = rand.nextInt(7);
		String a = SingularArticles[randSA];
		String b = CommonAnimateSubject[randCAS];
		String c = VerbsAnimatePresent[randVAP];
		String d = SingularArticles[randSA];
		String e = CommonObjects[randCO];
		System.out.printf("%s%s%s%s%s", a, b, c, d, e);
	}
}

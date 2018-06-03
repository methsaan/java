import java.util.Random;
import java.util.Arrays;

public class sentenceBuilder {
	public static void main(String[] args) {
		String[] SingularArticles = {"A", "The", "Any", "Every"};
		String[] SingularArticles2 = {"a", "the", "that", "this"};
		String[] CommonAnimateSubject = {"man", "person", "woman", "boy", "girl", "dog", "cat", "monkey", "pig", "wolf"};
		String[] VerbsAnimatePresent = {"wants", "has", "likes", "throws", "dislikes", "sees", "approaches", "hears", "rejects"};
		String[] CommonObjects = {"book", "banana", "person", "apple", "pancake", "computer", "animal"};
		Random rand = new Random();
		String SA = SingularArticles[rand.nextInt(4)];
		String SA2 = SingularArticles2[rand.nextInt(4)];
		String CAS = CommonAnimateSubject[rand.nextInt(10)];
		String VAP = VerbsAnimatePresent[rand.nextInt(9)];
		String CO = CommonObjects[rand.nextInt(7)];
		System.out.println(SA + " " + CAS + " " + VAP + " " + SA2 + " " + CO + ".");
	}
}

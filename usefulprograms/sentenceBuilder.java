import java.util.Random;
import java.util.Arrays;

public class sentenceBuilder {
	public static void main(String[] args) {
		String[] SingularArticles = {"A", "The", "Any", "Every"};
		String[] SingularArticles2 = {"a", "the", "that", "this"};
		String[] SingularArticles3 = {"a", "the", "any", "every"};
		String[] SingularArticles4 = {"A", "The", "That", "This"};
		String[] CommonAnimateSubject = {"man", "person", "woman", "boy", "girl", "dog", "cat", "monkey", "pig", "wolf"};
		String[] VerbsAnimatePresent = {"wants", "has", "likes", "throws", "dislikes", "sees", "approaches", "hears", "rejects"};
		String[] CommonObjects = {"book", "banana", "person", "apple", "pancake", "computer", "animal"};
		Random random = new Random();
		String[][] SAlist = {SingularArticles, SingularArticles4};
		String[][] SAlist2 = {SingularArticles3, SingularArticles2};
		String OneOrTwo1 = SAlist[random.nextInt(1)][];
		String OneOrTwo2 = SAlist[random.nextInt(1)][];
		System.out.println(OneOrTwo1 + "\t" + OneOrTwo2);
		//System.out.println(SA + " " + CAS + " " + VAP + " " + SA2 + " " + CO + ".");
	}
}

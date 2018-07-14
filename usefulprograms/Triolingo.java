import java.util.Random;
import java.util.Arrays;

public class sentenceBuilder {
	public static void main(String[] args) {
		String[] SingularArticles = {"A", "The", "Any", "Every"};
		String[] SingularArticles2 = {"a", "the", "that", "this", "their", "our"};
		String[] SingularArticles3 = {"a", "the", "my", "your", "his", "her"};
		String[] SingularArticles4 = {"A", "The", "That", "This"};
		String[] AnimateNoun = {"man", "person", "woman", "boy", "girl", "dog", "cat", "monkey", "pig", "wolf"};
		String[] VerbsAnimatePresent = {"wants", "has", "likes", "throws", "dislikes", "sees", "is", "hears", "rejects"};
		String[] InanimateAdjectives = {"bad", "good", "rejected", "big", "small", "boring", "funny", "foolish", "horrible", "awesome", "mean"};
		String[] InanimateNoun = {"book", "banana", "bag", "pancake", "computer", "piano"};
		Random random = new Random();
		for (int x = 0; x < 10; x++){
			String[][] SAlist = {SingularArticles, SingularArticles4};
			String[][] SAlist2 = {SingularArticles3, SingularArticles2};
			String randCaptSA1 = SAlist[random.nextInt(2)][random.nextInt(4)];
			String randSimpSA2 = SAlist2[random.nextInt(2)][random.nextInt(4)];
			String AN = AnimateNoun[random.nextInt(10)];
			String VAP = VerbsAnimatePresent[random.nextInt(9)];
			String IN = InanimateNoun[random.nextInt(6)];
			String Adj = InanimateAdjectives[random.nextInt(11)];
			String Adj2 = InanimateAdjectives[random.nextInt(11)];
			System.out.println("Translate this text to sinhala and french:\n");
			System.out.println(randCaptSA1 + " " +  Adj + " " + AN + " " + VAP + " " + randSimpSA2 + " " + Adj2 + " " + IN + ".");
		}
		//translate french sentence to sinhala and english: to be continued
		/*String[] SingularArticles2 = {"Un", "Ton", "Son", "Mon", "Leur"};
                String[] SingularArticles22 = {"a", "the", "that", "this", "their", "our"};
                String[] SingularArticles32 = {"a", "the", "my", "your", "his", "her"};
                String[] SingularArticles42 = {"A", "The", "That", "This"};
                String[] AnimateNoun2 = {"man", "person", "woman", "boy", "girl", "dog", "cat", "monkey", "pig", "wolf"};
                String[] VerbsAnimatePresent2 = {"wants", "has", "likes", "throws", "dislikes", "sees", "is", "hears", "rejects"};
                String[] InanimateAdjectives2 = {"bad", "good", "rejected", "big", "small", "boring", "funny", "foolish", "horrible", "awesome", "mean"};
                String[] InanimateNoun2 = {"book", "banana", "bag", "pancake", "computer", "piano"};
		*/
	}
}

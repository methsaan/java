import java.util.Random;
import java.util.Arrays;
import java.io.IOException;

public class Triolingo {
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
			System.out.println("Translate this text to sinhala and french:");
			System.out.println(randCaptSA1 + " " +  Adj + " " + AN + " " + VAP + " " + randSimpSA2 + " " + Adj2 + " " + IN + ".");
		}
		System.out.println("translate this french sentence to sinhala and english");
		String[] SingularArticles12 = {"Un", "Ton", "Son"};
                String[] SingularArticles22 = {"Mon", "Leur", "Ce"};
                String[] SingularArticles32 = {"Le", "Cela", "Ceci"};
                String[] SingularArticles42 = {"Votre", "Notre", "Du"};
                String[] AnimateNoun2 = {"pere", "garcon", "chien", "chat", "singe", "frere", "cochon", "grandpere", "loup", "amie"};
                String[] VerbsAnimatePresent2 = {"veut", "a", "aime", "lance", "n'aime pas", "voit", "est", "entend", "prend", "donne", "mange", "boit"};
                String[] InanimateAdjectives2 = {"mauvais", "bon", "pauvre", "propre", "petit", "legere", "amusant", "bete", "mechant", "genial", "dernier", "premier", "deuxieme", "troisieme"};
                String[] InanimateNoun2 = {"livre", "sandwich", "sac", "gateau", "ordinateur", "vin"};
		for (int x = 0; x < 10; x++){
                	String[][] SAlistf = {SingularArticles12, SingularArticles42};
                	String[][] SAlist2f = {SingularArticles32, SingularArticles22};
                	String randCaptSA1f = SAlistf[random.nextInt(2)][random.nextInt(3)];
                	String randSimpSA2f = SAlist2f[random.nextInt(2)][random.nextInt(3)];
                	String ANf = AnimateNoun2[random.nextInt(10)];
                	String VAPf = VerbsAnimatePresent2[random.nextInt(12)];
                	String INf = InanimateNoun2[random.nextInt(6)];
                	String Adjf = InanimateAdjectives2[random.nextInt(14)];
                	String Adj2f = InanimateAdjectives2[random.nextInt(14)];
                	System.out.println("Translate this text to sinhala and french:");
                	System.out.println(randCaptSA1f + " " +  Adjf + " " + ANf + " " + VAPf + " " + randSimpSA2f + " " + Adj2f + " " + INf + ".");
                }




	}
}

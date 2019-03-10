import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class musicHistory {
	public static void main(String[] args){
		for (int x = 0; x < 10; x++){
			String[] types = {"vocab", "time periods", "translations", "b info"};
			String randType = types[new Random().nextInt(4)];
			if (randType.equals("time periods")){
				String[] eras = {"baroque", "classical"};
				String era = eras[new Random().nextInt(2)];
				System.out.println("Time period of " + era + " era. _________________________________");
				String[] composers = {"Johann Sebastian Bach", "Wolfgang Amadeus Mozart"};
				System.out.println("Time period of " + composers[new Random().nextInt(2)] + ". ________________________________");
			}else if (randType.equals("vocab")){
				String[] words = {"polyphonic texture", "invention", "motive", "imitation", "sequence", "concerto grosso", "ritornello", "chamber music", "homophonic texture", "sonata form", "exposition", "development", "recapulation"};
				System.out.println("Definition of " + words[new Random().nextInt(13)] + ". ________________________________");
			}else if (randType.equals("translations")){
				String[] iTerms = {"ad libitum", "alla", "animato", "ben", "all'", "bene", "coll'", "colla", "colle", "col", "con", "con brio", "con espressione", "con fuoco", "con grazia", "con moto", "fp", "fortepiano", "grave", "e", "ed", "loco", "ma", "meno", "meno mosso", "non", "non troppo", "piu mosso", "piu", "poco", "poco a poco", "primo", "prima", "quasi", "secondo", "seconda", "sempre", "senza", "sforzando", "sf", "sfz", "simile"};
				System.out.println("English translation of: " + iTerms[new Random().nextInt(42)]);
			}else if (randType.equals("b info")){
				int randSong = new Random().nextInt(3);
				if (randSong == 1){
					String[] info = {"Genre", "Preforming forces", "Texture", "Compositional devices"};
					System.out.println(info[new Random().nextInt(4)] + " of Invention in C Major.\n________________________________________");
				}else if (randSong == 2){
					String[] info = {"Genre", "Key", "Tempo", "Structure", "Preforming forces"};
					System.out.println(info[new Random().nextInt(4)] + " of Bradenburg Concerto No. 5, first movement\n________________________________________");
				}else {
					String[] info = {"Genre", "Preforming forces", "Key", "Tempo", "Form"};
					System.out.println(info[new Random().nextInt(5)] + " of Eine kleine Nachtmusik, K 525, first movement\n________________________________________");
				}
			}
		}
	}
}

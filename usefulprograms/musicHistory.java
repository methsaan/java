import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class musicHistory {
	public static void main(String[] args){
		for (int x = 0; x < 15; x++){
			String[] types = {"vocab", "time periods", "translations", "b info"};
			String randType = types[new Random().nextInt(4)];
			if (randType.equals("time periods")){
				String[] eras = {"Medieval", "Rennaisance"};
				String era = eras[new Random().nextInt(2)];
				System.out.println("Time period of " + era + " era. _________________________________");
				String[] composers = {"Hildegard von Bingen", "Josquin des Prez"};
				System.out.println("Time period of " + composers[new Random().nextInt(2)] + ". ________________________________");
			}else if (randType.equals("vocab")){
				String[] words = {"morality play", "monophonic texture", "plainchant", "modes", "polyphonic texture", "rota", "ostinato", "frottola", "word painting", "a cappella", "homorhythmic texture", "gamelan", "metallophones", "raga", "sitar", "tala"};
				System.out.println("Definition of " + words[new Random().nextInt(15)] + ". ________________________________");
			}else if (randType.equals("translations")){
				String[] terms = {"allargando", "arco", "attacca", "bewegt", "calando", "allarg.", "cedez", "comodo", "con sordino", "fortepiano", "langsam", "fp", "largamente", "leger", "lentement", "l'istesso tempo", "fp", "fortepiano", "massig", "mit Ausdruck", "modere", "mouvement", "pizzicato", "ritenuto", "riten.", "schnell", "sehr", "sf", "sfz", "stringendo", "vite"};
				System.out.println("English translation of: " + terms[new Random().nextInt(31)]);
			}else if (randType.equals("b info")) {
				int randSong = new Random().nextInt(5);
				if (randSong == 0){
					String[] info = {"Era", "Composer", "Genre", "Preforming forces", "Language", "Summary of play", "Texture", "Compositional devices"};
					System.out.println(info[new Random().nextInt(4)] + " of Ordo Virtutum.\n________________________________________");
				}else if (randSong == 1){
					String[] info = {"Era", "Composer", "Genre", "Texture", "Preforming forces"};
					System.out.println(info[new Random().nextInt(4)] + " of Sumer Is Icumen In.\n________________________________________");
				}else if (randSong == 2) {
					String[] info = {"Era", "Composer", "Genre", "Texture", "Tempo", "Structure", "Preforming forces", "Language"};
					System.out.println(info[new Random().nextInt(4)] + " of El grillo.\n________________________________________");
				}else if (randSong == 3){
					String[] info = {"Genre", "Instruments used"};
					System.out.println(info[new Random().nextInt(4)] + " of Kaboran.\n________________________________________");
				}else if (randSong == 4){
					String[] info = {"Genre", "Composer"};
					System.out.println(info[new Random().nextInt(4)] + " of Pagodes.\n________________________________________");
				}else {
					String[] info = {"Genre", "Composer", "Instruments used"};
					System.out.println(info[new Random().nextInt(5)] + " of El grillo.\n________________________________________");
				}
			}
		}
	}
}

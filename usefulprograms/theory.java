import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class theory {
	public static void main(String[] args){
		//intervals
		String[] notes = {"Cb", "C ", "C#", "Db", "D ", "D#", "Eb", "E ", "E#", "Fb", "F ", "F#", "Gb", "G ", "G#", "Ab", "A ", "A#", "Bb", "B ", "B#"};
		String inter1 = notes[new Random().nextInt(21)];
		String inter2 = notes[new Random().nextInt(21)];
		String inter3 = notes[new Random().nextInt(21)];
		String inter4 = notes[new Random().nextInt(21)];
		String inter5 = notes[new Random().nextInt(21)];
		String inter6 = notes[new Random().nextInt(21)];
		String inter7 = notes[new Random().nextInt(21)];
		String inter8 = notes[new Random().nextInt(21)];
		String inter9 = notes[new Random().nextInt(21)];
		String inter10 = notes[new Random().nextInt(21)];
		String[] sharps = {new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " "};
		String[] flats = {new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " "};
		String[] clefs = {"TREBLE ", "BASE   "};
		if (new Random().nextBoolean() == true){
			System.out.println("      " + sharps[1] + sharps[2] + "    " + inter[1] + " |");
			System.out.println(clefs[new Random().nextInt(2)] + sharps[3] + sharps[4] + "     |");
			System.out.println("      " + sharps[5] + sharps[6] + "    " + inter[2] + " |");
		}else {
			System.out.println("       " + flats[1] + flats[2] + "    " + inter[1] + " |");
                        System.out.println(clefs[new Random().nextInt(2)] + flats[3] + flats[4] + "     |");
                        System.out.println("       " + flats[5] + flats[6] + "    " + inter[2] + " |");
		}
	}
}

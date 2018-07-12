import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class theory {
	public static void main(String[] args){
		//intervals
		System.out.println("1.");
		System.out.println("  a) Name the following intervals.");
		String[] notes = {"Cbb", "C  ", "CX ", "Dbb", "D  ", "DX ", "Ebb", "E  ", "EX ", "Fbb", "F  ", "FX ", "Gbb", "G  ", "GX ", "Abb", "A  ", "AX ", "Bbb", "B  ", "BX "};
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
		String[] sharps = {new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " "};
		String[] flats = {new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " "};
		String[] clefs = {"TREBLE ", "BASE   "};
		if (new Random().nextBoolean() == true){
			System.out.println("      " + sharps[0] + sharps[1] + "      " + inter1 + "  |  " + inter3 + "  |  " + inter5 + "  |  " + inter7 + "  |  " + inter9 + "  |");
			System.out.println(clefs[new Random().nextInt(2)] + sharps[2] + sharps[3] + "          | " + "      |       |       |       |");
			System.out.println("      " + sharps[4] + sharps[5] + "      " + inter2 + "  |  " + inter4 + "  |  " + inter6 + "  |  " + inter8 + "  |  " + inter10 + "  |");
		}else {
			System.out.println("      " + flats[0] + flats[1] + "      " + inter1 + "  |  " + inter3 + "  |  " + inter5 + "  |  " + inter7 + "  |  " + inter9 + "  |");
			System.out.println(clefs[new Random().nextInt(2)] + flats[2] + flats[3] + "          | " + "      |       |       |       |");
			System.out.println("      " + flats[4] + flats[5] + "      " + inter2 + "  |  " + inter4 + "  |  " + inter6 + "  |  " + inter8 + "  |  " + inter10 + "  |");
		}
		//rhythm rests
		//scale dictation
		//transposition
		//chord dictation
		//chord identification
		//key and time signature identification
		//composition
		//history and music terms
		//analysis
	}
}

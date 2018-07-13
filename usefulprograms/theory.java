import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class theory {
	public static void main(String[] args){
		//intervals
		System.out.println("1.");
		System.out.println("  a) Name the following intervals.");
		String[] enharmonics = {"Cbb", "CX ", "Dbb", "DX ", "Ebb", "EX ", "Fbb", "FX ", "Gbb", "GX ", "Abb", "AX ", "Bbb", "BX "};
		String[] wholes = {"C  ", "D  ", "E  ", "F  ", "G  ", "A  ", "B  "};
		String inter1 = enharmonics[new Random().nextInt(14)];
		String inter2 = wholes[new Random().nextInt(7)];
		String inter3 = enharmonics[new Random().nextInt(14)];
		String inter4 = wholes[new Random().nextInt(7)];
		String inter5 = enharmonics[new Random().nextInt(14)];
		String inter6 = wholes[new Random().nextInt(7)];
		String inter7 = enharmonics[new Random().nextInt(14)];
		String inter8 = wholes[new Random().nextInt(7)];
		String inter9 = enharmonics[new Random().nextInt(14)];
		String inter10 = wholes[new Random().nextInt(7)];
		String[] sharps = {new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " ", new Random().nextBoolean() ? "#" : " "};
		String[] flats = {new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " ", new Random().nextBoolean() ? "b" : " "};
		String[] clefs = {"TREBLE ", "BASS   "};
		String clef = clefs[new Random().nextInt(2)];
		if (new Random().nextBoolean() == true){
			System.out.println("      " + sharps[0] + sharps[1] + "      " + inter1 + "  |  " + inter3 + "  |  " + inter5 + "  |  " + inter7 + "  |  " + inter9 + "  |");
			System.out.println(clef + sharps[2] + sharps[3] + "          | " + "      |       |       |       |");
			System.out.println("      " + sharps[4] + sharps[5] + "    | " + inter2 + "  |  " + inter4 + "  |  " + inter6 + "  |  " + inter8 + "  |  " + inter10 + "  |");
		}else {
			System.out.println("      " + flats[0] + flats[1] + "      " + inter1 + "  |  " + inter3 + "  |  " + inter5 + "  |  " + inter7 + "  |  " + inter9 + "  |");
			System.out.println(clef + flats[2] + flats[3] + "          | " + "      |       |       |       |");
			System.out.println("      " + flats[4] + flats[5] + "      | " + inter2 + "  |  " + inter4 + "  |  " + inter6 + "  |  " + inter8 + "  |  " + inter10 + "  |");
		}
		System.out.println("  b) Change the upper note of each interval enharmonically. Rename each interval.");
		if (new Random().nextBoolean() == true){
                	System.out.println("      " + sharps[0] + sharps[1] + "      " + inter1 + "  |  " + inter3 +  "  |  " + inter5 + "  |  " + inter7 + "  |  " + inter9 + "  |");
                	System.out.println(clef + sharps[2] + sharps[3] + "          | " + "      |       |       |       |");
                	System.out.println("      " + sharps[4] + sharps[5] + "    | " + inter2 + "  |  " + inter4 + "  |  " + inter6 + "  |  " + inter8 + "  |  " + inter10 + "  |");
                }else {
                	System.out.println("      " + flats[0] + flats[1] + "     " + inter1 + "  |  " + inter3 + "  |  " + inter5 + "  |  " + inter7 + "  |  " + inter9 + "  |");
                	System.out.println(clef + flats[2] + flats[3] + "          | " + "      |       |       |       |");
                	System.out.println("      " + flats[4] + flats[5] + "    | " + inter2 + "  |  " + inter4 + "  |  " + inter6 + "  |  " + inter8 + "  |  " + inter10 + "  |");
                }
		//rhythm rests
		//scale dictation
		String[] majscale = {"C ", "Db", "D ", "Eb", "E ", "F ", "Gb", "G ", "Ab", "A ", "Bb", "B "};
		String[] minscale = {"A ", "Bb", "B ", "C ", "C#", "D ", "Eb", "E ", "F ", "F#", "G ", "G#"};
		String[] directions = {"ascending", "descending", "ascending and descending"};
		String scale = new Random().nextBoolean() ? majscale[new Random().nextInt(12)] + " Major": minscale[new Random().nextInt(12)] + " Minor";
		System.out.println("3. Write the following scales " + directions[2] + ", using the correct key signature for each. Use whole notes.");
		System.out.println("  a) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		scale = new Random().nextBoolean() ? majscale[new Random().nextInt(12)] + " Major": minscale[new Random().nextInt(12)] + " Minor";
		System.out.println("  b) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		scale = new Random().nextBoolean() ? majscale[new Random().nextInt(12)] + " Major": minscale[new Random().nextInt(12)] + " Minor";
		System.out.println("  c) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		scale = new Random().nextBoolean() ? majscale[new Random().nextInt(12)] + " Major": minscale[new Random().nextInt(12)] + " Minor";
		System.out.println("  d) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		scale = new Random().nextBoolean() ? majscale[new Random().nextInt(12)] + " Major": minscale[new Random().nextInt(12)] + " Minor";
		System.out.println("  e) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		//transposition
		//chord dictation
		String chordClef = clefs[new Random().nextInt(2)];
		String[] quality = {"minor", "major"};
		String[] minDegrees = {"tonic triad", "subdominant triad", "dominant triad", "relative major triad", "dominant 7th chord", "parrallel major triad", "leading tone diminished 7th"};
		String[] majDegrees = {"supertonic triad", "relative minor triad", "dominant 7th chord", "parrallel minor triad"};
		String[] positions = {"root position", "1st inversion", "2nd inversion"};
		String[] minRoots = {"C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "Bb", "B"};
		String[] majRoots = {"C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B"};
		String a="a", b="b", c="c", d="d", e="e";
		if (quality[new Random().nextInt(2)].equals("major")){
			a = "the " + majDegrees[new Random().nextInt(4)] + " of " + majRoots[new Random().nextInt(12)] + " major in " + positions[new Random().nextInt(3)];
		}else {
                	a = "the " + minDegrees[new Random().nextInt(4)] + " of " + minRoots[new Random().nextInt(12)] + " minor in " + positions[new Random().nextInt(3)];
                }
		if (quality[new Random().nextInt(2)].equals("major")){
			b = "the " + majDegrees[new Random().nextInt(4)] + " of " + majRoots[new Random().nextInt(12)] + " major in " + positions[new Random().nextInt(3)];
		}else {
                	b = "the " + minDegrees[new Random().nextInt(4)] + " of " + minRoots[new Random().nextInt(12)] + " minor in " + positions[new Random().nextInt(3)];
                }
		if (quality[new Random().nextInt(2)].equals("major")){
                	c = "the " + majDegrees[new Random().nextInt(4)] + " of " + majRoots[new Random().nextInt(12)] + " major in " + positions[new Random().nextInt(3)];
                }else {
                       	c = "the " + minDegrees[new Random().nextInt(4)] + " of " + minRoots[new Random().nextInt(12)] + " minor in " + positions[new Random().nextInt(3)];
                }
		if (quality[new Random().nextInt(2)].equals("major")){
                	d = "the " + majDegrees[new Random().nextInt(4)] + " of " + majRoots[new Random().nextInt(12)] + " major in " + positions[new Random().nextInt(3)];
                }else {
	        	d = "the " + minDegrees[new Random().nextInt(4)] + " of " + minRoots[new Random().nextInt(12)] + " minor in " + positions[new Random().nextInt(3)];
	        }
		if (quality[new Random().nextInt(2)].equals("major")){
			e = "the " + majDegrees[new Random().nextInt(4)] + " of " + majRoots[new Random().nextInt(12)] + " major in " + positions[new Random().nextInt(3)];
		}else {
			e = "the " + minDegrees[new Random().nextInt(4)] + " of " + minRoots[new Random().nextInt(12)] + " minor in " + positions[new Random().nextInt(3)];
		}
		System.out.println("5. Write the following chords in the " + chordClef + " using the correct key signature and any necessary accidentals.");
		System.out.println("  a)" + a);
		System.out.println("  b)" + b);
		System.out.println("  c)" + c);
		System.out.println("  d)" + d);
		System.out.println("  e)" + e);
		System.out.println("   a)       b)       c)       d)       e)    ");
		System.out.println("___________________________________________________________________");
		System.out.println("|       " + "         ||         ||         ||         ||         ||");
		System.out.println("|" + chordClef + "         ||         ||         ||         ||         ||");
		System.out.println("|       " + "         ||         ||         ||         ||         ||");
		System.out.println("|_______" + "_________||_________||_________||_________||_________||");
		//chord identification
		//key and time signature identification
		//composition
		//history and music terms
		//analysis
	}
}

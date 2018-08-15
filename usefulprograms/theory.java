import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class theory {
	public static void main(String[] args){
		System.out.println("1.");
		System.out.println("  a) Name the following intervals.");
		String[] enharmonics = {"Cbb", "CX ", "Dbb", "DX ", "Ebb", "EX ", "Fbb", "FX ", "Gbb", "GX ", "Abb", "AX ", "Bbb", "BX ", "Db ", "Eb ", "F# ", "C# ", "D# ", "Gb ", "G# ", "Ab ", "A# ", "Bb "};
		String[] wholes = {"C  ", "D  ", "E  ", "F  ", "G  ", "A  ", "B  ", "C# ", "D# ", "F# ", "G# ", "A# ", "Db", "Eb", "Gb", "Ab", "Bb"};
		String inter1 = enharmonics[new Random().nextInt(24)];
		String inter2 = wholes[new Random().nextInt(17)];
		String inter3 = enharmonics[new Random().nextInt(24)];
		String inter4 = wholes[new Random().nextInt(17)];
		String inter5 = enharmonics[new Random().nextInt(24)];
		String inter6 = wholes[new Random().nextInt(17)];
		String inter7 = enharmonics[new Random().nextInt(24)];
		String inter8 = wholes[new Random().nextInt(17)];
		String inter9 = enharmonics[new Random().nextInt(24)];
		String inter10 = wholes[new Random().nextInt(17)];
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
		String[] majscale = {"C ", "G ", "D ", "A ", "E ", "B ", "Gb", "Db", "Ab", "Eb", "Bb", "F ", "F#", "Cb", "C#"};
		String[] minscale = {"A ", "E ", "B ", "F#", "C#", "G#", "Eb", "Bb", "F ", "C ", "G ", "D ", "D#", "Eb", "A#"};
		String[] directions = {"ascending", "descending", "ascending and descending"};
		String scale = new Random().nextBoolean() ? majscale[new Random().nextInt(15)] + " Major": minscale[new Random().nextInt(15)] + " Minor";
		System.out.println("3. Write the following scales " + directions[2] + ", using the correct key signature for each. Use whole notes.");
		System.out.println("  a) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		scale = new Random().nextBoolean() ? majscale[new Random().nextInt(15)] + " Major": minscale[new Random().nextInt(15)] + " Minor";
		System.out.println("  b) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		scale = new Random().nextBoolean() ? majscale[new Random().nextInt(15)] + " Major": minscale[new Random().nextInt(15)] + " Minor";
		System.out.println("  c) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		scale = new Random().nextBoolean() ? majscale[new Random().nextInt(15)] + " Major": minscale[new Random().nextInt(15)] + " Minor";
		System.out.println("  d) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		scale = new Random().nextBoolean() ? majscale[new Random().nextInt(15)] + " Major": minscale[new Random().nextInt(15)] + " Minor";
		System.out.println("  e) " + scale + " in the " + clefs[new Random().nextInt(2)] + " clef");
		//transposition
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
		boolean randQuality = new Random().nextBoolean();
		String majOrMin2 = randQuality ? "major" : "minor";
		System.out.printf("  f) Write the %s %s scale acending using whole notes. Form triads over %s\n", minRoots[new Random().nextInt(12)], randQuality ? "major" : "minor", randQuality ? "all the notes except for the seventh" : "the first, fourth, fifth, sixth, and eighth note");
		//key and time signature identification
		//composition
		System.out.println("9.\n  a)");
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
		//analysis
	}
}

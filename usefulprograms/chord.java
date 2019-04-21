import java.util.Scanner;
import java.util.Arrays;

public class chord {
	public static void main(String []args) {
		int[] majorscale = {0, 2, 4, 5, 7, 9, 11, 12};
		int[] minorharmonic = {0, 2, 3, 5, 7, 8, 11, 12};
		int[] majorchord = {0, 4, 7};
		int[] minorchord = {0, 3, 7};
		int index;
		String[] letters = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
		String[] fullOctaves = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B","C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter chord or scale: ");
		String scaleChord = input.nextLine();
		String key = scaleChord.contains("#") ? scaleChord.substring(0, 2) : scaleChord.substring(0, 1);
		for (index = 0; index < letters.length; index++) {
			if (key.equals(letters[index])) {
				break;
			}
		}
		String quality = scaleChord.split("-")[1];
		String[] notes = new String[scaleChord.split("-")[2].equals("scale") ? 8 : 3];
		boolean isMajor = quality.equals("major");
		if (scaleChord.endsWith("chord")) {
			if (isMajor) {
				for (int x = 0; x < majorchord.length; x++) {
					notes[x] = fullOctaves[index + majorchord[x]];
				}
			}else {
				for (int x = 0; x < minorchord.length; x++) {
					notes[x] = fullOctaves[index + minorchord[x]];
				}
			}
		}else if (scaleChord.endsWith("scale")) {
			if (isMajor) {
				for (int x = 0; x < majorscale.length; x++) {
					notes[x] = fullOctaves[index + majorscale[x]];
				}
			}else {
				for (int x = 0; x < minorharmonic.length; x++) {
					notes[x] = fullOctaves[index + minorharmonic[x]];
				}
			}
		}
		System.out.println(ArrayUtils.indexOf(notes, "C"));
		String c = ArrayUtils.indexOf(notes, "C") < 8 && ArrayUtils.indexOf(notes, "C") > 0 ? "C" : " ";
		String cs = ArrayUtils.indexOf(notes, "C#") < 8 && ArrayUtils.indexOf(notes, "C#") > 0 ? "C#" : "  ";
		String d = ArrayUtils.indexOf(notes, "D") < 8 && ArrayUtils.indexOf(notes, "D") > 0 ? "D" : " ";
		String ds = ArrayUtils.indexOf(notes, "D#") < 8 && ArrayUtils.indexOf(notes, "D#") > 0 ? "D#" : "  ";
		String e = ArrayUtils.indexOf(notes, "E") < 8 && ArrayUtils.indexOf(notes, "E") > 0 ? "E" : " ";
		String f = ArrayUtils.indexOf(notes, "F") < 8 && ArrayUtils.indexOf(notes, "F") > 0 ? "F" : " ";
		String fs = ArrayUtils.indexOf(notes, "F#") < 8 && ArrayUtils.indexOf(notes, "F#") > 0 ? "F#" : "  ";
		String g = ArrayUtils.indexOf(notes, "G") < 8 && ArrayUtils.indexOf(notes, "G") > 0 ? "G" : " ";
		String gs = ArrayUtils.indexOf(notes, "G#") < 8 && ArrayUtils.indexOf(notes, "G#") > 0 ? "G#" : "  ";
		String a = ArrayUtils.indexOf(notes, "A") < 8 && ArrayUtils.indexOf(notes, "A") > 0 ? "A" : " ";
		String as = ArrayUtils.indexOf(notes, "A#") < 8 && ArrayUtils.indexOf(notes, "A#") > 0 ? "A#" : "  ";
		String b = ArrayUtils.indexOf(notes, "B") < 8 && ArrayUtils.indexOf(notes, "B") > 0 ? "B" : " ";
		String lc = ArrayUtils.indexOf(notes, "C") > 8 || ArrayUtils.indexOf(notes, "C") < 0 ? "C" : " ";
		String lcs = ArrayUtils.indexOf(notes, "C#") > 8 || ArrayUtils.indexOf(notes, "C#") < 0 ? "C#" : "  ";
		String ld = ArrayUtils.indexOf(notes, "D") > 8 || ArrayUtils.indexOf(notes, "D") < 0 ? "D" : " ";
		String lds = ArrayUtils.indexOf(notes, "D#") > 8 || ArrayUtils.indexOf(notes, "D#") < 0 ? "D#" : "  ";
		String le = ArrayUtils.indexOf(notes, "E") > 8 || ArrayUtils.indexOf(notes, "E") < 0 ? "E" : " ";
		String lf = ArrayUtils.indexOf(notes, "F") > 8 || ArrayUtils.indexOf(notes, "F") < 0 ? "F" : " ";
		String lfs = ArrayUtils.indexOf(notes, "F#") > 8 || ArrayUtils.indexOf(notes, "F#") < 0 ? "F#" : "  ";
		String lg = ArrayUtils.indexOf(notes, "G") > 8 || ArrayUtils.indexOf(notes, "G") < 0 ? "G" : " ";
		String lgs = ArrayUtils.indexOf(notes, "G#") > 8 || ArrayUtils.indexOf(notes, "G#") < 0 ? "G#" : "  ";
		String la = ArrayUtils.indexOf(notes, "A") > 8 || ArrayUtils.indexOf(notes, "A") < 0 ? "A" : " ";
		String las = ArrayUtils.indexOf(notes, "A#") > 8 || ArrayUtils.indexOf(notes, "A#") < 0 ? "A#" : "  ";
		String lb = ArrayUtils.indexOf(notes, "B") > 8 || ArrayUtils.indexOf(notes, "B") < 0 ? "B" : " ";
		System.out.println("___________________________________________________________________________________");
		System.out.println("|   |   | |   |  |   |   |  |   | |   |   |  |   | |   | |  |   | |    | |    |   |");
		System.out.println("|   |   | |   |  |   |   |  |   | |   |   |  |   | |   | |  |   | |    | |    |   |");
		System.out.println("|   | "+cs+"| |"+ds+" |  |   |"+fs+" |  |"+gs+" | | "+as+"|   |  |"+lcs+" | | "+lds+"| |  |"+lfs+" | | "+lgs+" | | "+las+" |   |");
		System.out.println("|   |___| |___|  |   |___|  |___| |___|   |  |___| |___| |  |___| |____| |____|   |");
		System.out.println("|     |    |     |     |     |      |     |    |    |    |    |     |      |      |");
		System.out.println("|  "+c+"  |  "+d+" |  "+e+"  |  "+f+"  |  "+g+"  |   "+a+"  |  "+b+"  | "+lc+"  | "+d+"  |  "+le+" |  "+lf+" |  "+lg+"  |  "+la+"   |   "+lb+"  |");
		System.out.println("|     |    |     |     |     |      |     |    |    |    |    |     |      |      |");
		System.out.println("|_____|____|_____|_____|_____|______|_____|____|____|____|____|_____|______|______|");
	}
}

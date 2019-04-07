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
		String[] notes = new String[8];
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
		String c = Arrays.stream(notes).anyMatch("C"::equals) ? "C" : " ";
		String cs = Arrays.stream(notes).anyMatch("C#"::equals) ? "C#" : "  ";
		String d = Arrays.stream(notes).anyMatch("D"::equals) ? "D" : " ";
		String ds = Arrays.stream(notes).anyMatch("D#"::equals) ? "D#" : "  ";
		String e = Arrays.stream(notes).anyMatch("E"::equals) ? "E" : " ";
		String f = Arrays.stream(notes).anyMatch("F"::equals) ? "F" : " ";
		String fs = Arrays.stream(notes).anyMatch("F#"::equals) ? "F#" : "  ";
		String g = Arrays.stream(notes).anyMatch("G"::equals) ? "G" : " ";
		String gs = Arrays.stream(notes).anyMatch("G#"::equals) ? "G#" : "  ";
		String a = Arrays.stream(notes).anyMatch("A"::equals) ? "A" : " ";
		String as = Arrays.stream(notes).anyMatch("A#"::equals) ? "A#" : "  ";
		String b = Arrays.stream(notes).anyMatch("B"::equals) ? "B" : " ";
		System.out.println("___________________________________________________________________________________");
		System.out.println("|   |   | |   |  |   |   |  |   | |   |   |  |   | |   | |  |   | |    | |    |   |");
		System.out.println("|   |   | |   |  |   |   |  |   | |   |   |  |   | |   | |  |   | |    | |    |   |");
		System.out.println("|   | "+cs+"| |"+ds+" |  |   |"+fs+" |  |"+gs+" | | "+as+"|   |  |"+cs+" | | "+ds+"| |  |"+fs+" | | "+gs+" | | "+as+" |   |");
		System.out.println("|   |___| |___|  |   |___|  |___| |___|   |  |___| |___| |  |___| |____| |____|   |");
		System.out.println("|     |    |     |     |     |      |     |    |    |    |    |     |      |      |");
		System.out.println("|  "+c+"  |  "+d+" |  "+e+"  |  "+f+"  |  "+g+"  |   "+a+"  |  "+b+"  | "+c+"  | "+d+"  |  "+e+" |  "+f+" |  "+g+"  |  "+a+"   |   "+b+"  |");
		System.out.println("|     |    |     |     |     |      |     |    |    |    |    |     |      |      |");
		System.out.println("|_____|____|_____|_____|_____|______|_____|____|____|____|____|_____|______|______|");
	}
}

import java.util.Scanner;
import java.util.Arrays;

public class chord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] major = {0, 2, 4, 5, 7, 9, 11, 12};
		int[] minorHarmonic = {0, 2, 3, 5, 7, 8, 11, 12};
		int[] minorMelodic = {0, 2, 3, 5, 7, 9, 11, 12};
		int[] minorNatural = {0, 2, 3, 5, 7, 8, 10, 12};
		int[] majorPentatonic = {0, 2, 4, 7, 9, 12};
		int[] minorPentatonic = {0, 3, 5, 7, 10, 12};
		int[] octatonic = {0, 2, 3, 5, 6, 8, 9, 11, 12};
		int[] chromatic = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] blues = {0, 3, 5, 6, 7, 10, 12};
		int[] majorChord = {0, 4, 7};
		int[] minorChord = {0, 3, 7};
		int[] dimChord = {0, 3, 6};
		int[] augChord = {0, 4, 8};
		System.out.print("Enter scale or chord: ");
		String scaleChord = input.nextLine();
		String note = scaleChord.split("-")[0];
		String type = scaleChord.split("-")[1];
		System.out.println(type);
		int[] chosenScale = new int[13];
		if (type.equals("Major Scale")) {
			chosenScale = major.clone();
		}else if (type.equals("Harmonic Minor Scale")) {
			chosenScale = minorHarmonic.clone();
		}else if (type.equals("Melodic Minor Scale")) {
			chosenScale = minorMelodic.clone();
		}else if (type.equals("Natural Minor Scale")) {
			chosenScale = minorNatural.clone();
		}else if (type.equals("Major Pentatonic Scale")) {
			chosenScale = majorPentatonic.clone();
		}else if (type.equals("Minor Pentatonic Scale")) {
			chosenScale = minorPentatonic.clone();
		}else if (type.equals("Octatonic Scale")) {
			chosenScale = octatonic.clone();
		}else if (type.equals("Chromatic Scale")) {
			chosenScale = chromatic.clone();
		}else if (type.equals("Blues Scale")) {
			chosenScale = blues.clone();
		}else if (type.equals("Major Chord")) {
			chosenScale = majorChord.clone();
		}else if (type.equals("Minor Chord")) {
			chosenScale = minorChord.clone();
		}else if (type.equals("Diminished Chord")) {
			chosenScale = dimChord.clone();
		}else if (type.equals("Augmented Chord")) {
			chosenScale = augChord.clone();
		}else {
			chosenScale = major.clone();
		}
		String[] flatMajKeys = {"F", "Bb", "Eb", "Ab", "Db", "Gb"};
		String[] flatMinKeys = {"D", "G", "C", "F", "Bb", "Eb"};
		boolean majCondition = scaleChord.contains("Major") && isIn(note, flatMajKeys);
		boolean minCondition = scaleChord.contains("Minor") && isIn(note, flatMinKeys);
		System.out.println(note);
		System.out.println("Major flat key: " + majCondition);
		System.out.println("Minor flat key: " + minCondition);
		String a = (majCondition || minCondition) ? "Db" : "C#";
		String b = (majCondition || minCondition) ? "Eb" : "D#";
		String c = (majCondition || minCondition) ? "Gb" : "F#";
		String d = (majCondition || minCondition) ? "Ab" : "G#";
		String e = (majCondition || minCondition) ? "Bb" : "A#";
		String f = (majCondition || minCondition) ? "Db'" : "C#'";
		String g = (majCondition || minCondition) ? "Eb'" : "D#'";
		String h = (majCondition || minCondition) ? "Gb'" : "F#'";
		String i = (majCondition || minCondition) ? "Ab'" : "G#'";
		String j = (majCondition || minCondition) ? "Bb'" : "A#'";
		String[] notes = {"C", a, "D", b, "E", "F", c, "G", d, "A", e, "B", "C'", f, "D'", g, "E'", "F'", h, "G'", i, "A'", j, "B'"};
		for (int x = 0; x < chosenScale.length; x++) {
			System.out.print(notes[chosenScale[x]+findIndex(notes, note)] + " ");
		}
		System.out.println();
	}
	public static int findIndex(String arr[], String t) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x].equals(t)) {
				return x;
			}
		}
		return 0;
	}
	public static boolean isIn(String str, String[] arr) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x].equals(str)) {
				return true;
			}
		}
		return false;
	}
}

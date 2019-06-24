import java.util.Scanner;

public class chopsticks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Object[] p1rightHand = {true, false, false, false, false, 1};
		Object[] p1leftHand = {false, false, false, false, true, 1};
		Object[] p2rightHand = {true, false, false, false, false, 1};
		Object[] p2leftHand = {false, false, false, false, true, 1};
		String p1handChoice;
		String p2handChoice;
		while (true) {
			System.out.print("\033[H\033[2J");
			System.out.println((p1rightHand[0] ? "#":"_") + (p1rightHand[1] ? "#":"_") + (p1rightHand[2] ? "#":"_") + (p1rightHand[3] ? "#":"_") + (p1rightHand[4] ? "#":"_"));
			System.out.println((p1leftHand[0] ? "#":"_") + (p1leftHand[1] ? "#":"_") + (p1leftHand[2] ? "#":"_") + (p1leftHand[3] ? "#":"_") + (p1leftHand[4] ? "#\n\n":"_\n\n"));
			System.out.println((p2rightHand[0] ? "#":"_") + (p2rightHand[1] ? "#":"_") + (p2rightHand[2] ? "#":"_") + (p2rightHand[3] ? "#":"_") + (p2rightHand[4] ? "#":"_"));
			System.out.println((p2leftHand[0] ? "#":"_") + (p2leftHand[1] ? "#":"_") + (p2leftHand[2] ? "#":"_") + (p2leftHand[3] ? "#":"_") + (p2leftHand[4] ? "#\n":"_\n"));
			System.out.println("Enter hand choice: ");
			p1handChoice = input.nextLine();
			if (p1HandChoice == "right-left") {
				p2leftHand[5] += p1rightHand[5];
				for (int x = 0; x < p2leftHand[5]; x++) {
					p2leftHand[x] = true;
				}
				if (p2leftHand > 5) {
					for (int x = 0; x > 5; x++) {
						p2leftHand[x] = false;
					}
				}
			}
			if (p1HandChoice == "right-right") {
				p2rightHand[5] += p1rightHand[5];
				for (int x = 4; x > 4-p2rightHand[5]; x--) {
					p2rightHand[x] = true;
				}
				if (p2rightHand > 5) {
					for (int x = 0; x > 5; x++) {
						p2rightHand[x] = false;
					}
				}
			}
			if (p1HandChoice == "left-right") {
				p2rightHand[5] += p1leftHand[5];
				for (int x = 4; x > 4-p2rightHand[5]; x--) {
					p2rightHand[x] = true;
				}
				if (p2rightHand > 5) {
					for (int x = 0; x > 5; x++) {
						p2rightHand[x] = false;
					}
				}
			}
			if (p1HandChoice == "left-left") {
				p2leftHand[5] += p1leftHand[5];
				for (int x = 0; x < p2leftHand[5]; x++) {
					p2leftHand[x] = true;
				}
				if (p2leftHand > 5) {
					for (int x = 0; x > 5; x++) {
						p2leftHand[x] = false;
					}
				}
			}
			System.out.print("\033[H\033[2J");
			System.out.println((p1rightHand[0] ? "#":"_") + (p1rightHand[1] ? "#":"_") + (p1rightHand[2] ? "#":"_") + (p1rightHand[3] ? "#":"_") + (p1rightHand[4] ? "#":"_"));
			System.out.println((p1leftHand[0] ? "#":"_") + (p1leftHand[1] ? "#":"_") + (p1leftHand[2] ? "#":"_") + (p1leftHand[3] ? "#":"_") + (p1leftHand[4] ? "#\n\n":"_\n\n"));
			System.out.println((p2rightHand[0] ? "#":"_") + (p2rightHand[1] ? "#":"_") + (p2rightHand[2] ? "#":"_") + (p2rightHand[3] ? "#":"_") + (p2rightHand[4] ? "#":"_"));
			System.out.println((p2leftHand[0] ? "#":"_") + (p2leftHand[1] ? "#":"_") + (p2leftHand[2] ? "#":"_") + (p2leftHand[3] ? "#":"_") + (p2leftHand[4] ? "#\n":"_\n"));
			System.out.println("Enter hand choice: ");
			p2handChoice = input.nextLine();
			if (p2HandChoice == "right-left") {
				p1leftHand[5] += p2rightHand[5];
				for (int x = 0; x < p1leftHand[5]; x++) {
					p1leftHand[x] = true;
				}
				if (p1leftHand > 5) {
					for (int x = 0; x > 5; x++) {
						p1leftHand[x] = false;
					}
				}
			}
			if (p2HandChoice == "right-right") {
				p1rightHand[5] += p2rightHand[5];
				for (int x = 4; x > 4-p1rightHand[5]; x--) {
					p1rightHand[x] = true;
				}
				if (p1rightHand > 5) {
					for (int x = 0; x > 5; x++) {
						p1rightHand[x] = false;
					}
				}
			}
			if (p2HandChoice == "left-right") {
				p1rightHand[5] += p2leftHand[5];
				for (int x = 4; x > 4-p1rightHand[5]; x--) {
					p1rightHand[x] = true;
				}
				if (p1rightHand > 5) {
					for (int x = 0; x > 5; x++) {
						p1rightHand[x] = false;
					}
				}
			}
			if (p2HandChoice == "left-left") {
				p1leftHand[5] += p2leftHand[5];
				for (int x = 0; x < p1leftHand[5]; x++) {
					p1leftHand[x] = true;
				}
				if (p1leftHand > 5) {
					for (int x = 0; x > 5; x++) {
						p1leftHand[x] = false;
					}
				}
			}
		}
	}
}

import java.util.Scanner;

public class choose {
	public static void main(String[] args) {
		System.out.println(choose(12, 5));
	}
	public static int choose(int group, int combination) {
		return group!(combination!(group-combination)!);
	}
}

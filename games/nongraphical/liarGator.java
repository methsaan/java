import java.util.Scanner;

public class liarGator{
	public static void main(String[] args){
		int momsAge;
		int childsAge;
		Scanner scan = new Scanner(System.in);
		System.out.print("How old is your mother? ");
		momsAge = scan.nextInt();
		System.out.print("How old are you? ");
		childsAge = scan.nextInt();
		if (childsAge > momsAge){
			System.out.println("See you later liargator!!");
		}else {
			System.out.println("Good job truthgator!!");
		}
	}
}

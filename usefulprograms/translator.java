import java.util.Scanner;
import java.util.Random;

public class translator {
	public static void main(String[] args){
		String language;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter language: ");
		language = scan.nextLine();
		int num;
		System.out.print("Enter a number: ");
		num = scan.nextInt();
		if (language.equalsIgnoreCase("english")){
			String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
			String[] oneToTwenty = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
			int modulus = num%10;
			int tensIndex = ((num-modulus)/10)-2;
			if (num == 100){
				System.out.println("one hundred");
			}else if (num == 0){
				System.out.println("zero");
			}else if ((modulus != 0) && (num > 20)){
				String wordForm = tens[tensIndex] + " " + oneToTwenty[modulus-1];
				System.out.println(wordForm);
			}else if (num > 20) {
				String wordForm = tens[tensIndex];
				System.out.println(wordForm);
			}else {
				modulus = num%20;
				String wordForm = oneToTwenty[modulus-1];
				System.out.println(wordForm);
			}
		}else if (language.equalsIgnoreCase("french")){
			String[] tens = {"vingt", "trente", "quarante", "cinquante", "soixante", "quatre-vingt"};
			String[] oneToTwenty = {"un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf"};
			int modulus = num%10;
			int tensIndex = ((num-modulus)/10)-2;
			if (num == 0){
				System.out.println("z\u00E9ro");
			}else if (num == 100){
				System.out.println("cent");
			}else{
				System.out.println("To be continued ...");
			}
		}
	}
}

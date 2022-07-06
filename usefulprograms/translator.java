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
			int tenMultiple = num%10;
			int tensIndex = ((num-tenMultiple)/10)-2;
			if (num == 20){
				System.out.println("twenty");
			}else if (num == 100){
				System.out.println("one hundred");
			}else if (num == 0){
				System.out.println("zero");
			}else if ((tenMultiple != 0) && (num > 20)){
				String wordForm = tens[tensIndex] + " " + oneToTwenty[tenMultiple-1];
				System.out.println(wordForm);
			}else if (num > 20) {
				String wordForm = tens[tensIndex];
				System.out.println(wordForm);
			}else {
				tenMultiple = num%20;
				String wordForm = oneToTwenty[tenMultiple-1];
				System.out.println(wordForm);
			}
		}else if (language.equalsIgnoreCase("french")){
			String[] tens = {"vingt", "trente", "quarante", "cinquante", "soixante", "sd", "quatre-vingt", "qvd"};
			String[] oneToTwenty = {"un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf"};
			int tenMultiple = num%10;
			int tensIndex = ((num-tenMultiple)/10)-2;
			if (num == 20){
				System.out.println("vingt");
			}else if ((num >= 70) && (num < 80)){
				String wordForm = "soixante " + oneToTwenty[(num%20)-1];
				System.out.println(wordForm);
			}else if ((num >= 90) && (num < 100)){
				String wordForm = "quatre-vingt " + oneToTwenty[(num%20)-1];
				System.out.println(wordForm);
			}else if (num == 0){
				System.out.println("z\u00E9ro");
			}else if (num == 100){
				System.out.println("cent");
			}else if ((tenMultiple != 0) && (num > 20)){
				String wordForm = tens[tensIndex] + " " + oneToTwenty[tenMultiple-1];
				System.out.println(wordForm);
			}else if (num > 20){
				String wordForm = tens[tensIndex];
				System.out.println(wordForm);
			}else {
				tenMultiple = num%20;
				String wordForm = oneToTwenty[tenMultiple-1];
				System.out.println(wordForm);
			}
		}else if (language.equalsIgnoreCase("sinhalese")){
			String[] tens1 = {"dahaya", "vissa", "thiha", "hathaliya", "panaha", "haththa", "haththaava", "asuwva", "anuwva", "seeyeh"};
			String[] tens2 = {"", "vissi", "thiss", "hathaliss", "panas", "hatta", "haththa", "asoow", "anoow"};
			String[] ones = {"ekka", "dekka", "thuna", "hathara", "paha", "haya", "hatha", "atta", "nameya", "dahayeh", "ecolaha", "dolaha", "dahathuna", "daahathara", "pahaleva", "dahaseya", "daahatha", "daha-atta", "dahanameya"};
			int tenMultiple = num%10;
			int tensIndex = ((num-tenMultiple)/10)-2;
			if (num == 100){
				System.out.println("seeyeh");
			}else if (num == 0) {
				System.out.println("binduva");
			}else if (tenMultiple == 0){
				System.out.println(tens1[tensIndex+1]);
			}else if ((tenMultiple != 0) && (num < 20)){
				System.out.println(ones[num-1]);
			}else {
				System.out.println(tens2[tensIndex+1] + " " + ones[tenMultiple-1]);
			}
		}

	}
}

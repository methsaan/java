import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class countryContinent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		String[] africa = {"Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo verde", "Cameroon", "Central African Republic", "Chad", "Comoros", "Democratic Republic of the Congo", "Congo", "Cote d'Ivoire", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Eswatini", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "Sao Tome and Principe", "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe"};
		String[] asia = {"Afghanistan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", "Burma", "Cambodia", "China", "East Timor", "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan", "Jordan", "Kazakhstan", "North Korea", "South Korea", "Kuwait", "Kyrgyzstan", "Laos", "Lebanon", "Malaysia", "Maldives", "Mongolia", "Nepal", "Oman", "Pakistan", "Philipines", "Qatar", "Russian Federation", "Saudi Arabia", "Singapore", "Sri Lanka", "Syria", "Tajikistan", "Thailand", "Turkey", "Turkmenistan", "United Arab Emirates", "Uzbekistan", "Vietnam", "Yemen"};
		String[] europe = {"Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czechia", "Denmark", "Estonia", "Finland", "France", "Georgia", "Germany", "Greece", "Hungary", "Iceland", "Ireland", "Italy", "Kazakhstan", "Kosovo", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg", "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands", "North Macedonia", "Norway", "Poland", "Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom", "Vatican City"};
		String[] northAmerica = {"Antigua and Barbuda", "Bahamas", "Barbados", "Belize", "Canada", "Costa Rica", "Cuba", "Dominica", "Dominican Republic", "El Salvador", "Grenada", "Guatemala", "Haiti", "Honduras", "Jamaica", "Mexico", "Nicaragua", "Panama", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenedines", "Trinidad and Tobago", "United States"};
		String[] oceania = {"Australia", "Fiji", "Kiribati", "Marshall Islands", "Micronesia", "Nauru", "New Zealand", "Palau", "Papua New Guinea", "Samoa", "Solomon Islands", "Tonga", "Tuvalu", "Vanuatu"};
		String[] southAmerica = {"Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela"};
		String[][] earth = {africa, asia, europe, northAmerica, oceania, southAmerica};
		System.out.print("Enter number of questions: ");
		int numOfQuestions = input.nextInt();
		int score = 0;
		input.nextLine();
		for (int x = 0; x < numOfQuestions; x++) {
			int contIndex = rand.nextInt(6);
			int countryIndex = rand.nextInt(earth[contIndex].length);
			System.out.print("\033[H\033[2J");
			System.out.print((x+1) + ". Which continent is " + earth[contIndex][countryIndex] + " in? ");
			String ans = input.nextLine();
			if (Arrays.stream(earth[continentIndex(ans)]).anyMatch(earth[contIndex][countryIndex]::equals)) {
				System.out.println("Correct");
				score++;
			}else {
				System.out.println("Correct answer: " + contByLength(findArr(earth[contIndex][countryIndex], earth).length));
			}
			for (long cnt = 0; cnt < 400000000; cnt++) {
				;
			}
		}
		System.out.println((double)score/numOfQuestions*100 + "%");
	}
	public static int continentIndex(String continent) {
		int returnVal = 0;
		if (continent.equals("Africa")) {
			returnVal = 0;
		}else if (continent.equals("Asia")) {
			returnVal = 1;
		}else if (continent.equals("Europe")) {
			returnVal = 2;
		}else if (continent.equals("North America")) {
			returnVal = 3;
		}else if (continent.equals("Oceania")) {
			returnVal = 4;
		}else if (continent.equals("South America")) {
			returnVal = 5;
		}
		return returnVal;
	}
	public static String contByLength(int len) {
		String continent = "None";
		if (len == 54) {
			continent = "Africa";
		}else if (len == 44) {
			continent = "Asia";
		}else if (len == 51) {
			continent = "Europe";
		}else if (len == 23) {
			continent = "North America";
		}else if (len == 14) {
			continent = "Oceania";
		}else if (len == 12) {
			continent = "South America";
		}
		return continent;
	}
	public static String[] findArr(String str, String[][] arrs) {
		String[] retVal = arrs[0];
		for (int x = 0; x < arrs.length; x++) {
			for (int y = 0; y < arrs[x].length; y++) {
				if (Arrays.stream(arrs[x]).anyMatch(str::equals)) {
					retVal = arrs[x];
				}
			}
		}
		return retVal;
	}
}

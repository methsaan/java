import java.util.*;

public class capitals {
	public static void main(String[] args) {
		Map countryCapitals = new Hashtable();
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		countryCapitals.put("Afghanistan", "Kabul");
		countryCapitals.put("Albania", "Tirana");
		countryCapitals.put("Algeria", "Algiers");
		countryCapitals.put("Andorra", "Andorra la Vella");
		countryCapitals.put("Angola", "Luanda");
		countryCapitals.put("Antigua and Barbuda", "Saint John's");
		countryCapitals.put("Argentina", "Buenos Aires");
		countryCapitals.put("Armenia", "Yerevan");
		countryCapitals.put("Australia", "Canberra");
		countryCapitals.put("Austria", "Vienna");
		countryCapitals.put("Azerbaijan", "Baku");
		countryCapitals.put("Bahamas", "Nassau");
		countryCapitals.put("Bahrain", "Manama");
		countryCapitals.put("Bangladesh", "Dhaka");
		countryCapitals.put("Barbados", "Bridgetown");
		countryCapitals.put("Belarus", "Minsk");
		countryCapitals.put("Belgium", "Brussels");
		countryCapitals.put("Belize", "Belmopan");
		countryCapitals.put("Benin", "Porto Novo");
		countryCapitals.put("Bhutan", "Thimphu");
		countryCapitals.put("Bolivia", "La Paz");
		countryCapitals.put("Bosnia and Herzegovina", "Sarajevo");
		countryCapitals.put("Botswana", "Gaborone");
		countryCapitals.put("Brazil", "Brasilia");
		countryCapitals.put("Brunei", "Bandar Seri Begawan");
		countryCapitals.put("Bulgaria", "Sofia");
		countryCapitals.put("Burkina Faso", "OuagaDougou");
		countryCapitals.put("Burundi", "Gitega");
		countryCapitals.put("Cambodia", "Phnom Penh");
		countryCapitals.put("Cameroon", "Yaounde");
		countryCapitals.put("Canada", "Ottawa");
		countryCapitals.put("Cape Verde", "Praia");
		countryCapitals.put("Central African Republic", "Bangui");
		countryCapitals.put("Chad", "N'Djamena");
		countryCapitals.put("Chile", "Santiago");
		countryCapitals.put("China", "Beijing");
		countryCapitals.put("Colombia", "Bogota");
		countryCapitals.put("Democratic Republic of the Congo", "Kinshasa");
		countryCapitals.put("Republic of the Congo", "Brazzaville");
		countryCapitals.put("Costa Rica", "San Jose");
		countryCapitals.put("Cote d'Ivoire", "Yamoussoukro");
		countryCapitals.put("Croatia", "Zagreb");
		countryCapitals.put("Cuba", "Havana");
		countryCapitals.put("Cyprus", "Nicosia");
		countryCapitals.put("Czech Republic", "Prague");
		countryCapitals.put("Denmark", "Copenhagen");
		countryCapitals.put("Djibouti", "Djibouti");
		countryCapitals.put("Dominica", "Roseau");
		countryCapitals.put("Dominican Republic", "Santo Dominigo");
		countryCapitals.put("East Timor", "Dili");
		countryCapitals.put("Ecuador", "Quito");
		countryCapitals.put("Egypt", "Cairo");
		countryCapitals.put("El Salvador", "San Salvador");
		countryCapitals.put("England", "London");
		countryCapitals.put("Equatorial Guinea", "Malabo");
		countryCapitals.put("Eritrea", "Asmara");
		countryCapitals.put("Estonia", "Tallinn");
		countryCapitals.put("Eswatini", "Mbabana");
		countryCapitals.put("Ethiopia", "Addis Ababa");
		countryCapitals.put("Federated States of Micronesia", "Palikir");
		countryCapitals.put("Fiji", "Suva");
		countryCapitals.put("Finland", "Helsinki");
		countryCapitals.put("France", "Paris");
		countryCapitals.put("French Guiana", "Cayenne");
		countryCapitals.put("Gabon", "Libreville");
		countryCapitals.put("Gambia", "Banjul");
		countryCapitals.put("Georgia", "Tbilisi");
		countryCapitals.put("Germany", "Berlin");
		countryCapitals.put("Ghana", "Accra");
		countryCapitals.put("Greece", "Athens");
		countryCapitals.put("Grenada", "Saint George's");
		countryCapitals.put("Guatemala", "Guatemala City");
		countryCapitals.put("Guinea", "Conakry");
		countryCapitals.put("Guinea-Bissau", "Bissau");
		countryCapitals.put("Guyana", "Georgetown");
		countryCapitals.put("Haiti", "Port au Prince");
		countryCapitals.put("Honduras", "Tegucigalpa");
		countryCapitals.put("Hungary", "Budapest");
		countryCapitals.put("Iceland", "Reykjavik");
		countryCapitals.put("India", "New Delhi");
		countryCapitals.put("Indonesia", "Jakarta");
		countryCapitals.put("Iran", "Tehran");
		countryCapitals.put("Iraq", "Baghdad");
		countryCapitals.put("Ireland", "Dublin");
		countryCapitals.put("Israel", "Tel Aviv");
		countryCapitals.put("Italy", "Rome");
		countryCapitals.put("Jamaica", "Kingston");
		countryCapitals.put("Japan", "Tokyo");
		countryCapitals.put("Jordon", "Amman");
		countryCapitals.put("Kazakhstan", "Astana");
		countryCapitals.put("Kenya", "Nairobi");
		countryCapitals.put("Kiribati", "Tarawa Atoll");
		countryCapitals.put("Kosovo", "Pristina");
		countryCapitals.put("Kuwait", "Kuwait City");
		countryCapitals.put("Kyrgizstan", "Bishkek");
		countryCapitals.put("Laos", "Vientaine");
		countryCapitals.put("Latvia", "Riga");
		countryCapitals.put("Lebanon", "Bierut");
		countryCapitals.put("Lesotho", "Maseru");
		countryCapitals.put("Libya", "Tripoli");
		countryCapitals.put("Liechtenstein", "Vaduz");
		countryCapitals.put("Lithuania", "Vilnius");
		countryCapitals.put("Luxembourg", "Luxembourg");
		countryCapitals.put("Madagascar", "Antananarivo");
		countryCapitals.put("Malawi", "Lilongwe");
		countryCapitals.put("Malaysia", "Kuala Lumpur");
		countryCapitals.put("Maldives", "Male");
		countryCapitals.put("Mali", "Bamako");
		countryCapitals.put("Malta", "Valletta");
		countryCapitals.put("Marshall Islands", "Majuro");
		countryCapitals.put("Mauritania", "Nouakchott");
		countryCapitals.put("Mauritius", "Port Louis");
		countryCapitals.put("Mexico", "Mexico City");
		countryCapitals.put("Moldova", "Chisinau");
		countryCapitals.put("Monaco", "Monaco");
		countryCapitals.put("Montenegro", "Montenegro");
		countryCapitals.put("Morocco", "Rabat");
		countryCapitals.put("Mozambique", "Maputo");
		countryCapitals.put("Myanmar", "Nay Pyi Taw");
		countryCapitals.put("Nambia", "Windhoek");
		countryCapitals.put("Nauru", "No official capital");
		countryCapitals.put("Nepal", "Kathmandu");
		countryCapitals.put("Netherlands", "Amsterdam");
		countryCapitals.put("New Zealand", "Wellington");
		countryCapitals.put("Nicaragua", "Managua");
		countryCapitals.put("Niger", "Niamey");
		countryCapitals.put("Nigeria", "Abuja");
		countryCapitals.put("North Korea", "Pyongyang");
		countryCapitals.put("North Macedonia", "Skopje");
		countryCapitals.put("Northern Ireland", "Belfast");
		countryCapitals.put("Norway", "Oslo");
		countryCapitals.put("Oman", "Muscat");
		countryCapitals.put("Pakistan", "Islamabad");
		countryCapitals.put("Palau", "Melekeok");
		countryCapitals.put("Panama", "Panama City");
		countryCapitals.put("Papua New Guinea", "Port Moresby");
		countryCapitals.put("Paraguay", "Asuncion");
		countryCapitals.put("Peru", "Lima");
		countryCapitals.put("Philipines", "Manila");
		countryCapitals.put("Poland", "Warsaw");
		countryCapitals.put("Portugal", "Lisbon");
		countryCapitals.put("Qatar", "Doha");
		countryCapitals.put("Romania", "Bucherest");
		countryCapitals.put("Russia", "Moscow");
		countryCapitals.put("Rwanda", "Kigali");
		countryCapitals.put("Saint Kitts and Nevis", "Basseterre");
		countryCapitals.put("Saint Lucia", "Castries");
		countryCapitals.put("Saint Vincent and the Grenadines", "Kingstown");
		countryCapitals.put("Samoa", "Apia");
		countryCapitals.put("San Marino", "San Marino");
		countryCapitals.put("Sao Tome and Principe", "Sao Tome");
		countryCapitals.put("Saudi Arabia", "Riyadh");
		countryCapitals.put("Scotland", "Edinburgh");
		countryCapitals.put("Senegal", "Dakar");
		countryCapitals.put("Serbia", "Belgrade");
		countryCapitals.put("Seychelles", "Victoria");
		countryCapitals.put("Sierra Leone", "Freetown");
		countryCapitals.put("Singapore", "Singapore");
		countryCapitals.put("Slovakia", "Bratislava");
		countryCapitals.put("Slovenia", "Ljubljana");
		countryCapitals.put("Soloman Islands", "Honiara");
		countryCapitals.put("Somalia", "Mogadishu");
		countryCapitals.put("South Africa", "Pretoria, Bloemfontein, Capetown");
		countryCapitals.put("South Korea", "Seoul");
		countryCapitals.put("South Sudan", "Juba");
		countryCapitals.put("Spain", "Madrid");
		countryCapitals.put("Sri Lanka", "Colombo");
		countryCapitals.put("Sudan", "Khartoum");
		countryCapitals.put("Suriname", "Paramaribo");
		countryCapitals.put("Sweden", "Stockholm");
		countryCapitals.put("Switzerland", "Bern");
		countryCapitals.put("Syria", "Damascus");
		countryCapitals.put("Taiwan", "Taipei");
		countryCapitals.put("Tajikistan", "Dushanbe");
		countryCapitals.put("Tanzania", "Dodoma");
		countryCapitals.put("Thailand", "Bangkok");
		countryCapitals.put("Togo", "Lome");
		countryCapitals.put("Tonga", "Nuku'alofa");
		countryCapitals.put("Trinidad and Tobago", "Port of Spain");
		countryCapitals.put("Tunisia", "Tunis");
		countryCapitals.put("Turkey", "Ankara");
		countryCapitals.put("Turkmenistan", "Ashgabat");countryCapitals.put("Tuvalu", "Funafuti");countryCapitals.put("Uganda", "Kampala");countryCapitals.put("Ukraine", "Kiev");countryCapitals.put("United Arab Emirates", "Abu Dhabi");countryCapitals.put("United Kingdom", "London (UK)");countryCapitals.put("United States", "Washington D.C.");countryCapitals.put("Uruguay", "Montvideo");countryCapitals.put("Uzbekistan", "Tashkent");countryCapitals.put("Vanautu", "Port Vila");countryCapitals.put("Vatican City", "Vatican City");countryCapitals.put("Venezuela", "Caracas");countryCapitals.put("Vietnam", "Hanoi");countryCapitals.put("Wales", "Cardiff");countryCapitals.put("Yemen", "Sana'a");countryCapitals.put("Zambia", "Lusaka");countryCapitals.put("Zimbabwe", "Harare");
		// countryCapitals.get("Wales") = Cardiff
		// getKeyFromValue(countryCapitals, "Port Vila") = Vanautu
		int score = 0;
		for (int x = 0; x < Integer.parseInt(args[0]); x++) {
			String country = String.valueOf(countryCapitals.keySet().toArray()[rand.nextInt(countryCapitals.keySet().toArray().length)]);
			System.out.print("\033[H\033[2J");
			System.out.print((x+1) + ". What is the capital city of " + country + ": ");
			String countryGuess = input.nextLine();
			if (countryGuess.equals(countryCapitals.get(country))) {
				System.out.println("Correct");
				score++;
			}else {
				System.out.println("Answer: " + countryCapitals.get(country));
			}
			for (long y = 0; y < 200000000; y++) {
				;
			}
		}
		if (args.length == 1) {
			System.out.println((score/Double.parseDouble(args[0])*100) + "%");
		}
	}
	public static Object getKeyFromValue(Map hm, Object value) {
		for (Object o : hm.keySet()) {
			if (hm.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}
}

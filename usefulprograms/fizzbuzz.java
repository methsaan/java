public class fizzbuzz {
	public static void main(String[] args){
		for (int x = 0; x <= 100; x++){
			if ((x%3 == 0) && (x%5 == 0)){
				System.out.print("FizzBuzz\t");
			}else if (x%3 == 0) {
				System.out.print("Fizz\t\t");
			}else if (x%5 == 0) {
				System.out.print("Buzz\t\t");
			}else {
				System.out.print(x + "\t\t");
			}
			if (x%10 == 0){
				System.out.println();
			}
		}
	}
}

import java.util.Scanner;

public class PIfinder{
	public static double getSmallest(double[] a){
		double temp;
		for (int i = 0; i < a.length; i++){
			for (int j = i + 1; j < a.length; j++){
				if (a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[0];
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of PI approximations: ");
		int numOfPIs = scan.nextInt();
		double PI = 3.141592653589793;
		double[][] PIfinderArray = new double[numOfPIs][3];
		double[] accuracies = new double[numOfPIs];
		int divisor = 1;
		for (int x = 0; x < PIfinderArray.length; x++){
			PIfinderArray[x][0] = Math.round(divisor*PI);
			PIfinderArray[x][1] = (double)divisor;
			PIfinderArray[x][2] = Math.round(divisor*PI)/(double)divisor;
			divisor++;
		}
		for (int x = 0; x < PIfinderArray.length; x++){
			System.out.print("|");
			for (int y = 0; y < PIfinderArray[x].length; y++) {
				if (y < 2) {
					System.out.print(((int)(PIfinderArray[x][y])) + (y < PIfinderArray[x].length-1 ? "  " : ""));
				} else {
					System.out.print((PIfinderArray[x][y]) + (y < PIfinderArray[x].length-1 ? "  " : ""));
				}
			}
			System.out.print("|\t\t");
			if (x%5 == 0){
				System.out.println();
			}
		}
		for (int x = 0; x < PIfinderArray.length; x++){
			accuracies[x] = Math.abs(PI - PIfinderArray[x][2]);
		}
		double mostAccurateDivisor = 0.0;
		double mostAccurateDividend = 0.0;
		double smallestAccuracy = getSmallest(accuracies);
		for (int x = 0; x < PIfinderArray.length; x++){
			if (Math.abs(PI - PIfinderArray[x][2]) == smallestAccuracy) {
				mostAccurateDivisor = PIfinderArray[x][1];
				mostAccurateDividend = PIfinderArray[x][0];
				break;
			}
		}
		System.out.println();
		System.out.println("Most accurate: " + mostAccurateDividend + " \u00F7 " + mostAccurateDivisor + " = " + mostAccurateDividend/mostAccurateDivisor);
	}
}

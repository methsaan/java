import java.util.Scanner;
import java.lang.Math;

public class coordlen {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int pt1_x;
		int pt1_y;
		int pt2_x;
		int pt2_y;
		int dist_x;
		int dist_y;
		int pt1_squared;
		int pt2_squared;
		double dist_pt1_2_pt2;
		System.out.print("Enter x coordinate of point a: ");
		pt1_x = scan.nextInt();
		System.out.print("Enter y coordinate of point a: ");
		pt1_y = scan.nextInt();
		System.out.print("Enter x coordinate of point b: ");
		pt2_x = scan.nextInt();
		System.out.print("Enter y coordinate of point b: ");
		pt2_y = scan.nextInt();
		dist_x = Math.abs(pt1_x-pt2_x);
		dist_y = Math.abs(pt1_y-pt2_y);
		pt1_squared = dist_x*dist_x;
		pt2_squared = dist_y*dist_y;
		dist_pt1_2_pt2 = Math.sqrt(pt1_squared+pt2_squared);
		System.out.println("Distance from point a to point b: " + dist_pt1_2_pt2);
		scan.nextLine();
	}
}

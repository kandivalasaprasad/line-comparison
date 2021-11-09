package geomerty_lineCpmparision;

import java.util.Scanner;

public class geomertyLineCpmparision_4 {

	int x1, x2, y1, y2;

	void readInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 value: ");
		x1 = sc.nextInt();
		System.out.println("enter x2 value: ");
		x2 = sc.nextInt();
		System.out.println("enter y1 value: ");
		y1 = sc.nextInt();
		System.out.println("enter y2 value: ");
		y2 = sc.nextInt();
	}

	double caluclation() {

		double result_x = Math.pow((x2 - x1), 2);
		double result_y = Math.pow((y2 - y1), 2);
		double length1 = result_x + result_y;
		return length1;
		// System.out.println( length1 );

	}

	public static void main(String[] args) {

		geomertyLineCpmparision_4 LC1 = new geomertyLineCpmparision_4();
		geomertyLineCpmparision_4 LC2 = new geomertyLineCpmparision_4();
		LC1.readInput();
		LC2.caluclation();
		LC2.readInput();
		LC2.caluclation();
		double line1 = LC1.caluclation();
		double line2 = LC2.caluclation();
		System.out.println( "lenth of line 1  " +line1 );
		System.out.println( "length of line 2  " +line2 );



		if (line1 == line2) {
			System.out.println("two lines length are equal");
		} else if (line1 > line2) {
			System.out.println(" line 1 length is greater then line2 ");
		} else if (line1 < line2) {
			System.out.println("line2 length is greater then line1");
		}

	}
}

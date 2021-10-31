package geomerty_lineCpmparision;

import java.util.Scanner;

public class geometryLineComparision {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter X1 value:  ");
		int x1 = s.nextInt();
		System.out.println("enter X2 value:  ");
		int x2 = s.nextInt();
		System.out.println("enter Y1 value:  ");
		int y1 = s.nextInt();
		System.out.println("enter Y2 value:  ");
		int y2 = s.nextInt();
		int i = ((x2 - x1) ^ 2 + (y2 + y1) ^ 2);
		System.out.println(i);

	}
}

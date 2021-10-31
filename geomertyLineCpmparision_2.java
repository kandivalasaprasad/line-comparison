package geomerty_lineCpmparision;

import java.util.Scanner;

public class geomertyLineCpmparision_2 {

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
		int i1 = ((x2-x1)^2 + (y2+y1)^2);
		System.out.println(i1 + " :  is the length of the line");
		
		System.out.println("enter U1 value:  ");
		int u1 = s.nextInt();
		
		System.out.println("enter U2 value:  ");
		int u2 = s.nextInt();
		System.out.println("enter v1 value:  ");
		int v1 = s.nextInt();
		System.out.println("enter V2 value:  ");
		int v2 = s.nextInt();
		int i2 = ((u2-u1)^2 + (v2+v1)^2);
		System.out.println(i2 + "  : is the length of the line" );
		
		if (i1 == i2) {
			System.out.println("two lines lengths are equal ");
		}
		else if(i1 > i2) {
			System.out.println("line1 lengths is greater then line2");
		}
		else if(i2 > i1) {
			System.out.println("line2 length is greater then line1 ");

		}

	}

}





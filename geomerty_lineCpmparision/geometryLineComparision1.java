package geomerty_lineCpmparision;

import java.util.Scanner;

public class geometryLineComparision1 {
	
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
			double	result_x = 	Math.pow((x2-x1),2);
			double	result_y = Math.pow((y2-y1) ,  2);
			double length1 = result_x + result_y;
			System.out.println("the length of the line is" +length1);
			
			
			System.out.println("enter U1 value:  ");
			int u1 = s.nextInt();
			System.out.println("enter U2 value:  ");
			int u2 = s.nextInt();
			System.out.println("enter v1 value:  ");
			int v1 = s.nextInt();
			System.out.println("enter V2 value:  ");
			int v2 = s.nextInt();
			double	result_x1 = Math.pow((u2-u1),2);
			double	result_y1 = Math.pow((v2-v1) ,  2);
			double length2 = result_x1 + result_y1;
			
			if (length1 == length2) {
				System.out.println(" two lines lengths are equal ");
			}
			else if(length1 != length2) {
				System.out.println("two lines lengths are not equal");
			}

		}

	}



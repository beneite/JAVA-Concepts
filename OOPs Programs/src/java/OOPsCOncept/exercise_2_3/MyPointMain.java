/* Exercise 2.3:
 * MyPoint Main method...
 */
package java.OOPsCOncept.exercise_2_3;

import java.util.*;

public class MyPointMain {

	public static void main(String[] args) {
		
		/*MyPoint p1=new MyPoint(3,4);				// reference variable 1.......
		MyPoint p2=new MyPoint(5,6);				// reference variable 2......
		
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(5,6));
		System.out.println(p1.distance());*/
		
		Scanner inp=new Scanner(System.in);
		
		int x,y,i;
		
		MyPoint p[]=new MyPoint[4];				// Assigning an array size to the reference....
		
		for(i=0;i<p.length;i++) {
			
			System.out.println("Coordinate no: "+(i+1));
			System.out.println("Enter X coordinate:");
				x=inp.nextInt();
			System.out.println("Enter y coordinate:");
				y=inp.nextInt();
		inp.close();		
			p[i]=new MyPoint(x,y);	
		}
		
		System.out.println("The Coordinates are:");
		for(i=0;i<p.length;i++) {
			System.out.print("Coordinate: "+(i+1));
			System.out.println(p[i].toString());
		}
			
	}

}

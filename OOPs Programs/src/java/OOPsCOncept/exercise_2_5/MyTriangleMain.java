/* Exercise 2.5:
 * MyTriangle Main method...
 */
package java.OOPsCOncept.exercise_2_5;

import java.OOPsCOncept.exercise_2_3.MyPoint;

public class MyTriangleMain {

	public static void main(String[] args) {
		
		MyTriangle mt1=new MyTriangle(1,1,8,2,3,3);
		
		MyPoint p1=new MyPoint(0,0);
		MyPoint p2=new MyPoint(0,2);
		MyPoint p3=new MyPoint(2,0);
		MyTriangle mt2=new MyTriangle(p1,p2,p3);
		
		System.out.println("Permimeter of Triangle 1:"+mt1.getPerimeter());
		System.out.println("Permimeter of Triangle 2:"+mt2.getPerimeter());
		
		System.out.println("Triangle 1 type:"+mt1.getType());
		System.out.println("Triangle 2 type:"+mt2.getType());
		
		System.out.println(mt1);
		System.out.println(mt2);

	}

}

/*	Exercise 4.1:
 * 	Main method...				-= Main method =-
 */
package java.OOPsCOncept.abstractExercise_4_1;

public class ShapeMain {

	public static void main(String[] args) {
		
		Circle c1=new Circle();
		Circle c2=new Circle(10,"green",false);
		
		System.out.println(c1);
		System.out.println(c2);
		
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(10,20);
		Rectangle r3=new Rectangle(10,20,"Blue",false);
		
		System.out.println();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		Square s1=new Square();
		Square s2=new Square(30);
		Square s3=new Square(40,"Yellow",false);
		
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}

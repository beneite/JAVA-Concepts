/*	Exercise 3.1:
 *  MyComplex Main method...
 */
package java.OOPsCOncept.exercise_3_1;

public class MyComplexMain {

	public static void main(String[] args) {
		
		MyComplex c1=new MyComplex(3,5);
		MyComplex c2=new MyComplex(4,6);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.equals(3,2));
			c1.setImag(2);
		System.out.println(c1.equals(3,2));
		
		System.out.println(c1.equals(c2));
			
	}

}

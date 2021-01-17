/*	Exercise 4.1:
 *  Square class...            -= SUB CLASS of Rectangle =-
 */
package abstractExercise_4_1;

public class Square extends Rectangle{
	
		// Constructor 1...
		Square(){
			super();
		}
		
		// Constructor 2...
		Square(double side){
			super(side,side);
		}

		// Constructor 3...
		Square(double side,String color,boolean filled){
			super(side,side,color,filled);
		}
		
		// get Side...
		public double getSide() {
			return super.getLength();
		}
		
		// to String()....
		public String toString() {
			return "Square { "+super.toString()+", Length: "+getSide()+" }";
		}
}

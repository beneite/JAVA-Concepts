/*	Exercise 4.3:
 * 	Resizable Circle class...
 */
package java.OOPsCOncept.interfaceExercise_4_3;

public class ResizableCircle extends Circle{
	
		ResizableCircle(double radius){
			super(radius);
		}
		
		public void resize(int lengthToChange) {
			super.radius+=lengthToChange;
		}
		
		// toString()..
		public String toString() {
			return super.toString();
		}
		
}

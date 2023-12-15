/*	Exercise 4.3:
 * 	Circle class...
 */
package java.OOPsCOncept.interfaceExercise_4_3;

public class Circle implements GeometricObject{
	
	protected double radius;
	
		// Constructor 1....
		Circle(){
			radius=1.0;
		}
		
		// Constructor 2....
		Circle(double radius){
			this.radius=radius;
		}

		// methods from GeometricObject interface...
		@Override
		public double getPerimeter() {
			return 2*Math.PI*radius;
		}

		@Override
		public double getArea() {
			return Math.PI*Math.pow(radius, 2);
		}
		
		// toString()..
		public String toString() {
			return "Radius: "+radius+", Perimeter: "+getPerimeter()+", Area:"+getArea();
		}
		

}

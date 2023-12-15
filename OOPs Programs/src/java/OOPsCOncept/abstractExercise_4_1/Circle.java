/*	Exercise 4.1:
 *  Circle class...            -= SUB CLASS=-
 */
package java.OOPsCOncept.abstractExercise_4_1;

public class Circle extends Shape{
	
	protected double radius;
	
		// Constructor 1...
		Circle(){
			this.radius=1.0;
		}
		
		// Constructor 2...
		Circle(double radius){
			this.radius=radius;
		}
		
		// Constructor 3...
		Circle(double radius,String color,boolean filled){
			super(color,filled);							// using super to call the constructor....
			this.radius=radius;			
		}

		// getters and setters....
		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		// methods....
		public double getArea() {
			return Math.PI*Math.pow(radius,2 );
		}
		
		public double getPerimeter() {
			return 2*Math.PI*radius;
		}
		
		// toString()...
		public String toString() {
			return "Cricle {"+super.toString()+", Radius:"+getRadius()+", Area:"+getArea()+", Perimeter: "+getPerimeter()+"}";
		}
}

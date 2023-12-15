/*	Exercise 4.1:
 *  Rectangle class...            -= SUB CLASS=-
 */
package java.OOPsCOncept.abstractExercise_4_1;

public class Rectangle extends Shape{
	
	protected double width;
	protected double length;
	
		// Constructor 1...
		Rectangle(){
			width=1.0;
			length=1.0;
		}
		
		// Constructor 2...
		Rectangle(double length,double width){
			this.length=length;
			this.width=width;
		}
		
		// Constructor 3...
		Rectangle(double length,double width,String color,boolean filled){
			super(color,filled);											// using super() to call the constructor...
			this.length=length;
			this.width=width;
		}

		// getters and setters...
		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}
		
		// methods...
		public double getArea() {
			return length*width;
		}
		
		public double getPerimeter() {
			return (length+width)*2;
		}
		
		// toString()....
		public String toString() {
			return "Rectangle { "+super.toString()+", Length: "+getLength()+", Width: "+getWidth()+", Area: "+getArea()+", Perimeter: "+getPerimeter()+"}";
		}

}

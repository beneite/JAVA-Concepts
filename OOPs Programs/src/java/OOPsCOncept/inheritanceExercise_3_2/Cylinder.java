/*	Exercise 3.2:
 *  Cylinder class....   SubClass...
 */
package java.OOPsCOncept.inheritanceExercise_3_2;

public class Cylinder extends Circle{

		private double height;
		
		// Constructor 1.....
		Cylinder(){
			super();
			this.height=1.0;
		}
		
		// Constructor 2.....
		Cylinder(double radius){
			super.radius=radius;			// super(radius)...
			this.height=1.0;
		}
		
		// Constructor 3....
		Cylinder(double radius,double height){
			super.radius=radius;
			this.height=height;
		}
		
		// Constructor 4....
		Cylinder(double radius,double height,String color){
			super.radius=radius;
			super.color=color;
			this.height=height;
		}

		// getters and setters....
		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}
		
		// method....
		public double getVolume() {
			return (super.getArea()*getHeight());
		}
		
		
		
		
		
		
		
		
		
		
}

/*	Exercise 3.2:
 *  Circle class....    BASE CLASS
 */
package java.OOPsCOncept.inheritanceExercise_3_2;

public class Circle {	
	
	protected double radius;
	protected String color;
	
	// Constructor 1....
	Circle(){
		this.radius=1.0;
		this.color="red";
	}
	
	// Constructor 2....
	Circle(double radius){
		this.radius=radius;
		
	}
	
	// Constructor 3....
	Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}

	// getters and setters....
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// method....
	public double getArea() {
		return (Math.PI*this.radius*this.radius);
	}
	
	// toString....
	public String toString() {
		return "Cricle [ Radius="+getRadius()+", Color: "+getColor()+" ]";
	}
	

}













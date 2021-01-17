/* Exercise 1.1:
 *  This is the Base class.....         Building Block
 */ 
package exercise_1_1;

public class CircleCLass {
	
	private double radius;
	private String color;
	
	// default constructor....
	CircleCLass(){
		radius=1;
		color="red";
	}
	
	// Parameterized constructor....
	CircleCLass(double radius,String color){		
		this.radius=radius;	
		this.color=color;
	}
	
	// returns radius....
	public double getRadius() {
		return radius;
	}
	
	// returns area....
	public double getArea() {
		return(Math.PI*radius*radius);
	}
	
	// returns a description of the instance.....
	public String getDetails() {
		return "Circle [ Radius:"+radius+" Colour:"+color+" ]";
	}

}

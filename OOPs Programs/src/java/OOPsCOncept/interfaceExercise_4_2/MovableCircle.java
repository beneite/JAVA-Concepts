/*	Exercise 4.2:
 * 	MovableCircle class
 */
package java.OOPsCOncept.interfaceExercise_4_2;

public class MovableCircle implements Movable{

	private int radius;
	private MovablePoint centre;
	
	// Constructor....
	MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
		centre=new MovablePoint(x,y,xSpeed,ySpeed);
		this.radius=radius;
	}
	
	// methods...
	@Override
	public void moveUp() {
		centre.y+=centre.ySpeed;		
	}

	@Override
	public void moveDown() {
		centre.y-=centre.ySpeed;				
	}

	@Override
	public void moveLeft() {
		centre.x-=centre.xSpeed;				
	}

	@Override
	public void moveRight() {
		centre.x+=centre.xSpeed;				
	}
	
	// getter...
	public int getRadius() {
		return radius;
	}
	
	// toString()...
	public String toString() {
		return centre.toString()+", Radius: "+getRadius();
	}
	
	
	

}

/*	Exercise 4.2:
 * 	MovablePoint class
 */
package java.OOPsCOncept.interfaceExercise_4_2;

public class MovablePoint implements Movable{
	
	int x,y,ySpeed,xSpeed;
	
	// Constructor...
	MovablePoint(int x,int y,int xSpeed,int ySpeed){
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}

	// getters....
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	// methods
	@Override
	public void moveUp() {
		y=y+ySpeed;
	}

	@Override
	public void moveDown() {
		y=y-ySpeed;		
	}

	@Override
	public void moveLeft() {
		x=x-xSpeed;	
	}

	@Override
	public void moveRight() {
		x=x+xSpeed;		
	}
	
	// toString()....
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
}

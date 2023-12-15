/*	Exercise 3.4:
 * 	Point2D class...  -=BASE CLASS=-
 */
package OOPsCOncept.inheritanceExercise_3_4;

public class Point2D {
		
	protected float x;
	protected float y;
	
	// Constructor 1...
	Point2D(){
		this.x=0.0f;
		this.y=0.0f;
	}
	
	// Constructor 2...
	Point2D(float x,float y){
		this.x=x;
		this.y=y;
	}
	
	// getters...
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
	
	// method...
	public float[] getXY() {
		float arr[]=new float[2];
		arr[0]=getX();
		arr[1]=getY();
		
		return arr;
	}
	
	// toString()....
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
	
	
}

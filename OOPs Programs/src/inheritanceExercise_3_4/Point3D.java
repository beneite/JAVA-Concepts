/*	Exercise 3.4:
 * 	Point3D class...  -=SUB CLASS=-
 */
package inheritanceExercise_3_4;

public class Point3D extends Point2D{
	
	protected float z;
	
	// Constructor 1....
	Point3D(){
		super();
		this.z=0.0f;
	}
	
	// Constructor 2....
	Point3D(float x,float y,float z){
		super(x,y);
		this.z=z;
	}
	
	// getter...
	public float getZ() {
		return this.z;
	}
	
	// methods....
	public float[] getXYZ() {
		float arr[]=new float[3];
		arr[0]=super.getX();
		arr[1]=super.getY();
		arr[2]=getZ();
		
		return arr;
	}
	
	// toString()....
	public String toString() {
		return "[ "+super.toString()+","+getZ()+" ]";
	}
	

}

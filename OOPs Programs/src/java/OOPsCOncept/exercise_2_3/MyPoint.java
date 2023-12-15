/* Exercise 2.3:
 * MyPoint Class...
 */
package java.OOPsCOncept.exercise_2_3;

public class MyPoint {
	
	public int x;
	public int y;

	// Constructor 1...
	MyPoint(){
		this.x=0;
		this.y=0;
	}
	
	// Constructor 2...
	public MyPoint(int x,int y){
		this.x=x;
		this.y=y;
	}

	// getters and setters...
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// Methods....
	
	public int[] getxy() {                       // method to return 2 values....
		int arr[]=new int[2];
		arr[0]=x;
		arr[1]=y;
		return arr;                              //return new int[] {x,y};.....		
	}
	
	public double distance(int x,int y) {        // distance using x and y.....
		int xDiff=this.x-x;
		int yDiff=this.y-y;
		
		double dist=Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		return dist;
	}
	
	public double distance(MyPoint another) {     // Distance using reference variable.....
		int xDiff=this.x-another.x;
		int yDiff=this.y-another.y;
		
		double dist=Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		return dist;
	}
	
	public double distance() {						// Distance using 0,0 as reference...
		
		double dist=Math.sqrt(this.x*this.x + this.y*this.y);
		return dist;
	}
	
	// toString method.....
	public String toString() {
		return "( "+this.x+","+this.y+" )";
	}
	
}
























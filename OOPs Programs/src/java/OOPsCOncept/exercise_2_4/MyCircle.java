/*  Exercise 2.4:
 *  MyCircle class...
 */
package java.OOPsCOncept.exercise_2_4;

import java.OOPsCOncept.exercise_2_3.MyPoint;                             // importing MyPoint from exercise 2.3....

public class MyCircle {
	
	private int radius;
	private MyPoint centre;	

	// Constructor 1.....
	public MyCircle(){
		this.radius=1;
		this.centre=new MyPoint(0,0);
	}
	
	// Constructor 2....
	MyCircle(int x,int y,int radius){
		this.centre=new MyPoint(x,y);
		this.radius=radius;
	}
	
	// Constructor 3....
	MyCircle(MyPoint centre,int radius){
		this.centre=centre;
		this.radius=radius;
	}

	// Getters and Setters.....
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		System.out.println("Radius Changed !!!");
		this.radius = radius;
	}

	public MyPoint getCentre() {
		return centre;
	}

	public void setCentre(MyPoint centre) {			// changes the centre by using the instance.....
		this.centre = centre;
	}
	
	public int getCentreX() {
		return centre.getX();						// getting centre x coordinate....
	}
	
	public void setCentreX(int x) {
		this.centre= new MyPoint(x,centre.y);		// setting centre X coordinate....
	}
	
	public int getCentreY() {
		return centre.getY();						// getting centre y coordinate....
	}
	
	public void setCentreY(int y) {
		this.centre= new MyPoint(centre.x,y);		// setting centre y coordinate....
	}
	
	public int[] getCentreXY() {					// returns the centre x,y coordinate....
		
		int arr[]=new int[2];
		arr[0]=getCentreX();
		arr[1]=getCentreY();
		return arr;
	}
	
	public void setCentreXY(int x,int y) {			// changes the centre coordinates.... 
		centre.x=x;
		centre.y=y;
	}
	
	public double distance(MyCircle another) {		// returns the distance between 2 centre...
		int x1,x2,y1,y2;
		double dist;
		x1=getCentreX();
		y1=getCentreY();
		x2=centre.x;
		y2=centre.y;
		dist=Math.sqrt(Math.pow(x1-x2,2)-Math.pow(y1-y2, 2));
		return dist;
	}
	
	public double area() {							// returns the area.....
		return Math.PI*radius*radius;
	}
	
	public double parameter() {						// returns the parameter....
		return Math.PI*2*radius;
	}
	
	// toString method....
	public String toString() {
		return "My Circle [ Radius: "+radius+", Centre:("+centre.x+","+centre.y+")]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

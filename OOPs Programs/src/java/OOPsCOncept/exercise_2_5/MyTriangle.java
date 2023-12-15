/* Exercise 2.5:
 * MyTriangle CLass...
 */
package java.OOPsCOncept.exercise_2_5;

import java.OOPsCOncept.exercise_2_3.MyPoint;

public class MyTriangle {
	
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	// Constructor 1....
	MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
		v1=new MyPoint(x1,y1);
		v2=new MyPoint(x2,y2);
		v3=new MyPoint(x3,y3);
	}
	
	// Constructor 2....
	MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
	}
	
	
	
	// methods...
	public double getPerimeter() {					// method to calculate the perimeter....
		double sum=0.0,dist;
		dist=Math.sqrt(Math.pow(v1.x-v2.x, 2)+Math.pow(v1.y-v2.y, 2)); 		// distance from v1 to v2.... 
			sum+=dist;
		dist=Math.sqrt(Math.pow(v2.x-v3.x, 2)+Math.pow(v2.y-v3.y, 2));		// distance from v2 to v3.... 
			sum+=dist;
		dist=Math.sqrt(Math.pow(v3.x-v1.x, 2)+Math.pow(v3.y-v1.y, 2));		// distance from v3 to v1.... 
			sum+=dist;
			
		return sum;	
	}
	
	public String getType() {
		
		double d1,d2,d3;
		String s1;
		d1=Math.sqrt(Math.pow(v1.x-v2.x, 2)+Math.pow(v1.y-v2.y, 2));      // calculating the length of the edges....
		d2=Math.sqrt(Math.pow(v2.x-v3.x, 2)+Math.pow(v2.y-v3.y, 2));
		d3=Math.sqrt(Math.pow(v3.x-v1.x, 2)+Math.pow(v3.y-v1.y, 2));
		
		if(d1==d2 && d2==d3) {												// determining the type of triangle...
			s1="Equilateral";
		}else if(d1!=d2 && d2!=d3 && d1!=d3) {
			s1="Scalene";
		}else {
			s1="Isoceles";
		}
		
		return s1;		
	}
	
	// toString.....
	public String toString() {
		return "MyTriangle [ V1("+v1.x+","+v1.y+"); V2("+v2.x+","+v2.y+"); V3("+v3.x+","+v3.y+")]";
	}	
}

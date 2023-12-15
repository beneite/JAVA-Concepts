/*  Exercise 2.4:
 *  MyCircle main method...
 */
package java.OOPsCOncept.exercise_2_4;



public class MyCircleMain {

	public static void main(String[] args) {
		
	
		MyCircle mc1=new MyCircle();							// Default constructor.....
			System.out.println("Radius 1: "+mc1.getRadius());
		
			System.out.println(mc1);
			
		MyCircle mc2=new MyCircle(2,1,3);                        // Constructor 2.....
			System.out.println("Radius 2: "+mc2.getRadius());
		
			System.out.println(mc2);
		
		MyCircle mc3=new MyCircle(mc2.getCentre(),4); 
			System.out.println("Radius 2: "+mc3.getRadius());
		
			System.out.println(mc3);
			
			mc3.setCentreXY(3,4);
			System.out.println(mc3);
			
			System.out.println("Distance:"+mc1.distance(mc3));
			
	}

}

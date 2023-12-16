/* Exercise 1.1
 *  Main function....
 */
package OOPsCOncept;

public class CircleCLassMain {

	public static void main(String[] args) {
		
		CircleCLass cir=new CircleCLass();
		
		// Circle 1....
		System.out.println(cir.getDetails());
		System.out.println("Radius: "+cir.getRadius()+"m. Area: "+cir.getArea()+".");
		
		// Circle 2....
		CircleCLass cir2= new CircleCLass(10,"Green");
		System.out.println(cir2.getDetails());
		System.out.println("Radius: "+cir2.getRadius()+"m. Area: "+cir2.getArea()+".");
	}

}

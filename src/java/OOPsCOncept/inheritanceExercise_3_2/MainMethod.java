/*	Exercise 3.2:
 * 	Main method....
 */
package OOPsCOncept.inheritanceExercise_3_2;

public class MainMethod {

	public static void main(String[] args) {
		
		Cylinder c1=new Cylinder();
		System.out.println(c1.toString());
		System.out.println("Cylinder 1: Base Radius:"+c1.getRadius()+"; Height:"+c1.getHeight()+"; Color:"+c1.getColor());
		System.out.println("Volume:"+c1.getVolume());
		System.out.println();
		
		Cylinder c2=new Cylinder(10);
		System.out.println(c2.toString());
		System.out.println("Cylinder 2: Base Radius:"+c2.getRadius()+"; Height:"+c2.getHeight()+"; Color:"+c2.getColor());
		System.out.println("Volume:"+c2.getVolume());
		System.out.println();
		
		Cylinder c3=new Cylinder(10,10);
		System.out.println(c1.toString());
		System.out.println("Cylinder 3: Base Radius:"+c3.getRadius()+"; Height:"+c3.getHeight()+"; Color:"+c3.getColor());
		System.out.println("Volume:"+c3.getVolume());
		System.out.println();
		
		Cylinder c4=new Cylinder(10,10,"Green");
		System.out.println(c4.toString());
		System.out.println("Cylinder 4: Base Radius:"+c4.getRadius()+"; Height:"+c4.getHeight()+"; Color:"+c4.getColor());
		System.out.println("Volume:"+c4.getVolume());
		
	}

}

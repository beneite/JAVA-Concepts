/*	Exercise 4.2:
 * 	MovableMain method...
 */
package OOPsCOncept.interfaceExercise_4_2;

public class MovableMainMethod {

	public static void main(String[] args) {
		
		MovablePoint mp1=new MovablePoint(1,1,2,3);
		mp1.moveUp();
		mp1.moveLeft();
		System.out.println(mp1);
		
		MovableCircle mc1=new MovableCircle(1,1,2,3,5);
		mc1.moveDown();
		mc1.moveRight();
		System.out.println(mc1);
	}

}

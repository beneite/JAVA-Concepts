/*	Exercise 4.3:
 *  Main Method....
 */
package OOPsCOncept.interfaceExercise_4_3;

public class MainMethod {

	public static void main(String[] args) {
		
		ResizableCircle rc1=new ResizableCircle(10);
		System.out.println(rc1);
		
		rc1.resize(2);
		System.out.println(rc1);
	}

}

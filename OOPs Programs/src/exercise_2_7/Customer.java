/* Exercise 2.7:
 * Customer class...
 */
package exercise_2_7;

public class Customer {

	private int id;
	private String name;
	private char gender;
	
	// Constructor....
	Customer(int id,String name,char gender){
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
	
	// methods....
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	// toString......
	public String toString() {
		return getName()+"["+getId()+"]";
	}
	
}

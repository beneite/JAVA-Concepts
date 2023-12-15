/* Exercise 2.6:
 * Customer class...
 */
package java.OOPsCOncept.exercise_2_6;

public class Customer {
	
	private int id;
	private String name;
	private int discount;
	
	// Constructor....
	Customer(int id,String name,int discount){
		this.id=id;
		this.name=name;
		this.discount=discount;
	}
	
	// methods...
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount=discount;
	}
	
	// toString....
	public String toString() {
		return name+"("+id+","+discount+")";
	}

}

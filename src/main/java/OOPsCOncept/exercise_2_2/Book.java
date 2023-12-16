/*  Exercise 2.2:
 *  Book class....
 */
package OOPsCOncept.exercise_2_2;

public class Book {
	
	private String name;
	private Author[] authors;
	private double price;
	private int quantity;
	
	// Constructor...
	Book(String name,Author[] authors,double price,int quantity){
		this.name=name;
		this.authors=authors;
		this.price=price;
		this.quantity=quantity;
	}
	
	// Methods...
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getAuthorsName() {
		return getName();
	}
	
	// toString.....
	/*public String toString() {
		return "Book [ Name: "+getName()+" Authors={ "+toString1()+"} Price: $"+getPrice()+" Quantity:"+getQuantity()+"no. ]";
	}*/

}

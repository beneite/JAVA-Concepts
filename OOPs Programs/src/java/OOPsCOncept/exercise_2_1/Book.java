/* Exercise 2.1:
 * Book Class...
 */
package java.OOPsCOncept.exercise_2_1;

public class Book {
	
	private String name;
	private Author author;                             // an instance of the Author class is used as a variable...
	private double price;
	private int qty;
	
	// Constructor 1.....
	Book(String name,Author author,double price){
		this.name=name;
		this.author=author;
		this.price=price;
	}
	
	// Constructor 2.....
	Book(String name,Author author,double price,int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}

	// Methods....
	
	public String getName() {
		return name;							// returns Book name.....
	}
	
	public String getAuthor() {
		return author.getName();				// returns Author's Name.....
	}
	
	public double getPrice() {
		return price;							// returns price....
	}
	
	public int getQuantity() {
		return qty;								// returns the quantity.....
	}
	
	public void setPrice(double price) {
		this.price=price;						// sets the price......
	}
	
	public void setQuantity(int q) {
		qty=q;							// sets the quantity.....
	}
	
	// toString.....
	
	public String toString() {
		return "Book [ Book Name: "+getName()+", "+author.toString()+" "+getPrice()+","+getQuantity()+".";
	}
}

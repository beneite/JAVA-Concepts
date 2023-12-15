/* Exercise 2.6:
 * Invoice class...
 */
package java.OOPsCOncept.exercise_2_6;

public class Invoice {
	
	private int id;
	private Customer customer;
	private double amount;
	
	// Constructor....
	Invoice(int id,Customer customer,double amount){
		this.id=id;
		this.customer=customer;
		this.amount=amount;		
	}
	
	// methods....
	public int getId() {
		return id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public double getAmountAfterDiscount() {
		int dis;
		double amountDiscount;
		dis=customer.getDiscount();
		amountDiscount=dis*amount/100;
		return amount-amountDiscount;
	}

}

/* Exercise 2.7:
 * Account class...
 */
package exercise_2_7;

public class Account {
	
	private int id;
	private Customer customer;
	private double balance;
	
	// Constructor 1....
	Account(int id,Customer customer,double balance){
		this.id=id;
		this.customer=customer;
		this.balance=balance;
	}
	
	// Constructor 2....
	Account(int id,Customer customer){
		this.id=id;
		this.customer=customer;
		this.balance=0.0;
	}
	
	// Methods....
	public int getId() {
		return id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double amount) {
		this.balance=amount;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public void addDeposit(double amount) {
		this.balance+=amount;
	}
	
	public String withdraw(double amount) {
		if(amount>this.balance)
			return "The Withdrawal amount is more than balance. Transaction FAILED !!!";
		else {
			this.balance-=amount;
			return "Transaction Successfull "+amount+" debited from account";
		}
		
	}
	
	// toString....
	public String toString() {
		return customer.toString()+" Balance:$"+getBalance()+"/-";
	}
	
	
	
	
	
	
	
	
	

}

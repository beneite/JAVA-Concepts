/* Exercise 1.3:
 * Building block....
 */
package OOPsCOncept.exercise_1_3;

public class AccountClass {
	
	private int accNo;
	private String name;
	private double balance;
	
	// Constructor 1.....
	AccountClass(int accNo,String name){
		this.accNo=accNo;
		this.name=name;
		balance=0.0;
	}
	
	// COnstructor 2.....
	AccountClass(int accNo,String name,double balance){
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
	}
	
	public int getaccNo() {
		return accNo;                   // returning accNo.....
	}
	
	public String getName() {
		return name;                    // returning Name.....
	}
	
	public double getBalance() {
		return balance;					// returning Balance.....
	}

	public double credit(double amt) {     // method to credit amount....
		balance=balance+amt;
		return balance;
	}
	
	public double debit(double amt) {      // method to debit amount....
		balance=balance-amt;
		if(balance>=0)
			return amt;
		else
			return -1;
	}
	
	public double transferTo(int accNo2,double amt2) { 
		balance=balance-amt2;
		if(balance>0)
			return balance;
		else
			return -1;					// method to transfer amount....		
	}
	
	// Account details....
	public String toString() {
		return "Account No. : "+getaccNo()+", Name: "+getName()+", Balance: $"+getBalance()+"/-";
	}
}



















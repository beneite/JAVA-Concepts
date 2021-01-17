/* Exercise 2.7:
 * Customer-Account method...
 */
package exercise_2_7;

public class CustomerAccountMain {

	public static void main(String[] args) {
		
		Customer c1=new Customer(1,"Ashish",'M');
		Customer c2=new Customer(2,"Aditya",'M');
		
		Account a1=new Account(11,c1,100);
		Account a2=new Account(11,c2);
		
		a1.addDeposit(100);
		a2.addDeposit(300);
		
		System.out.println(a1.withdraw(250));
		System.out.println(a2.withdraw(300));
		
		a2.setBalance(10);
		
		System.out.println(a1);
		System.out.println(a2);

	}

}

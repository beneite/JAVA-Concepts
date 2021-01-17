/* Exercise 1.3:
 *  Main Method...
 */
package exercise_1_3;

public class AccountClassMain {

	public static void main(String[] args) {
		
		double balance2,creditAmt=200,debitAmt=1500;
		
		AccountClass acc1=new AccountClass(213,"Ashish Mishra");          // reference 1 with 0 account balance
		AccountClass acc2=new AccountClass(214,"Aditya Mishra",3000);		// reference 2 with 3000 account balance
		
		// Printing Initial details of accounts....
		System.out.println(acc1);
		System.out.println(acc2);

		// Credit amount 200 to acc1...   bal=200
		acc1.credit(creditAmt);
		
		// debit amount 1500 from acc2... bal=1500
		balance2=acc2.debit(debitAmt);
			if(balance2<0)
			{
				System.out.println("Amount Exceded");		
				System.out.println("Transaction Failed !!!");
				balance2=acc2.credit(debitAmt);
			}
			else
			{
				System.out.println("Amount Debited Seccessfully");
			}
			System.out.println("Details:");
			/*System.out.println(acc1.accDetails());
			System.out.println(acc2.accDetails());*/
			System.out.println(acc1);
			System.out.println(acc2);
		
	}

}

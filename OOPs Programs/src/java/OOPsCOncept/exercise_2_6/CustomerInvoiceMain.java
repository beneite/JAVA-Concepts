/* Exercise 2.6:
 * CustomerInvoiceMain method...
 */
package java.OOPsCOncept.exercise_2_6;

public class CustomerInvoiceMain {

	public static void main(String[] args) {
			
		Customer c1=new Customer(1,"Ashish",10);
		Customer c2=new Customer(2,"Aditya",20);
		
		Invoice iv1=new Invoice(11,c1,100);
		
		System.out.println(c1+" "+iv1.getAmountAfterDiscount());
		
		iv1.setCustomer(c2);
		System.out.println(c2+" "+iv1.getAmountAfterDiscount());	

	}

}

/* Exercise 1.2:
 *  Main Method.....
 */
package exercise_1_2;

public class EmployeeClassMain {

	public static void main(String[] args) {
	
		EmployeeClass emp=new EmployeeClass(856785,"Ashish","Mishra",33000);
		
		System.out.println(emp.getFinalDetails());        // returns the basic details....
		
		System.out.println("Annual Income: $"+emp.getAnnualSalary()+"/-");    // Annual Salary.....
		
		System.out.println("Annual Income after increment: $"+emp.setSalaryIncrement(5)+"/-");    // Annual salary after increment...
		
		

	}

}

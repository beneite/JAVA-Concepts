/* Exercise 1.2:
 *  Building Block....
 */
package java.OOPsCOncept.exercise_1_2;

public class EmployeeClass {

		private int id;
		private String fName;
		private String lName;
		private float salary;
		
		// Constructor....
		EmployeeClass(int id,String fName,String lName,float salary ){
			this.id=id;
			this.fName=fName;
			this.lName=lName;
			this.salary=salary;
		}
		
		// return First Name....
		public int getid() {
			return id;
		}
		
		// return First Name....
		public String getfName() {
			return fName;
		}
		
		// return Last Name....
		public String getlName() {
			return lName;
		}
				
		// return Full Name....
		public String getfullName() {
			return fName +" "+ lName;
		}		
		
		// return Salary....
		public float getSalary() {
			return salary;
		}
		
		// return annual salary....
		public float getAnnualSalary() {
			return 12*salary;
		}
		
		// Increments the salary....
		public float setSalaryIncrement(int incrementPer) {
			return ((salary+(salary*incrementPer/100))*12);
		}
		
		// Description.....
		public String getFinalDetails() {
			return "ID: "+id+"; Name: "+getfullName()+"; Salary: $"+getSalary()+"/-";
		}
}
















/*	Exercise 3.3:
 * 	Staff class.....  Subclass
 */
package inheritanceExercise_3_3;

public class Staff extends Person{
	
		private String section;
		private double pay;
		
		// Constructor...
		Staff(String name,String address,String section,double pay){
			super(name,address);
			this.section=section;
			this.pay=pay;
		}

		// getter and setters....
		public String getSection() {
			return section;
		}

		public void setSection(String section) {
			this.section = section;
		}

		public double getPay() {
			return pay;
		}

		public void setPay(double pay) {
			this.pay = pay;
		}
		
		// toString().....
		public String toString() {
			return "Staff { "+super.toString()+"; Section: "+getSection()+", Salary: "+getPay()+" }";
		}

}

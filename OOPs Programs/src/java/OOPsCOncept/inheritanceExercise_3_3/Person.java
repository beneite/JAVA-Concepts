/*	Exercise 3.3:
 *  Person class...			BASE CLASS..
 */
package java.OOPsCOncept.inheritanceExercise_3_3;

public class Person {
		
		protected String name;
		protected String address;
		
		// Constructor....
		Person(String name,String address){
			this.name=name;
			this.address=address;
		}

		// getters and setters....
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		// toString().....
		public String toString() {
			return "[ Name: "+getName()+", Address: "+getAddress()+" ]";
		}
		
		

}

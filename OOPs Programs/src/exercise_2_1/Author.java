/* Exercise 2.1:
 * Author Class...
 */
package exercise_2_1;

public class Author {
	
	private String name;
	private String email;
	private char gender;            // M or F...
	
	// Constructor...
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	// Methods....
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	// toString.....
	public String toString() {
		return "Author [ Name: "+getName()+", E-mail: "+getEmail()+", Gender: "+getGender()+" ]";
	}

}

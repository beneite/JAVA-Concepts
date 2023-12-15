/* Exercise 2.2:
 * Author class...
 */
package java.OOPsCOncept.exercise_2_2;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	// Constructor....
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
	
	public void setEmail(String em) {
		email=em;
	}
	
	public String toString1() {
		return "Author [ Name: "+getName()+", E-Mail: "+getEmail()+", Gender: "+getGender()+"]";
	}

}

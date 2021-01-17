/*	Exercise 3.3:
 *  Student class...			SUB CLASS..
 */
package inheritanceExercise_3_3;

public class Student extends Person{
	
	private String program;
	private int year;
	private double fee;
	
	// Constructor...
	Student(String name,String address,String program,int year,double fee){
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	
	// getters and setters....
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	// toString()....
	public String toString() {
		return "Student { "+super.toString()+"; Program: "+getProgram()+", Year: "+getYear()+", Fee:"+getFee()+" }";
	}
}
















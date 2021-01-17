/*	Exercise 3.1:
 *  MyComplex class...
 */
package exercise_3_1;

public class MyComplex {
	
	private double real;
	private double imag;
	
	// Constructor 1....
	MyComplex(){
		this.real=0.0;
		this.imag=0.0;
	}
	
	// Constructor 2....
	MyComplex(double real,double imag){
		this.real=real;
		this.imag=imag;
	}
	
	// getters and setters....	
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	// methods....
	public void setValue(double real,double imag) {
		this.real=real;
		this.imag=imag;
	}
	
	public boolean equals(double real,double imag){
		return(this.real==real && this.imag==imag);
	}
	
	public boolean equals(MyComplex another) {
		return (another.getReal()==this.getReal() && another.getImag()==this.getImag());
	}
	
	// toString...
	public String toString() {
		return "("+getReal()+"+"+getImag()+"i )";
	}
	

}

/*	Exercise 4.1:
 *  Abstract class...            -= BASE CLASS=-
 */
package java.OOPsCOncept.abstractExercise_4_1;

public abstract class Shape {
		
		protected String color;
		protected boolean filled;
		
		// Constructor 1......
		Shape(){
			this.color="red";
			this.filled=true;
		}
		
		// Constructor 2.....
		Shape(String color,boolean filled){
			this.color=color;
			this.filled=filled;
		}
		
		// getters and setters....
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isFilled() {
			return filled;
		}

		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		
		// Abstract methods....
		public abstract double getArea();
		public abstract double getPerimeter();
		
		// toString()....
		public String toString() {
			return "Shape[ Color:"+getColor()+", Filled:"+isFilled()+"]";
		}
}

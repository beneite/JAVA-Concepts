/* Exercise 2.2:
 *  Main method...
 */
package OOPsCOncept.exercise_2_2;

public class MainMethod {

	public static void main(String[] args) {
		
		Author authors[]=new Author[2];                         // Declare a variable of type Author[]......The variable now points to an array....
		
		authors[0]=new Author("A","A@gmail.com",'M');
		authors[1]=new Author("B","B@gmail.com",'M');
		
		Book bk=new Book("Book A1",authors,500,3);
		
		System.out.println(authors[0].getName());
		System.out.println(authors[1].getName());
		
		System.out.println(bk);	

	}

}

/* Exercise 2.1:
 * Main Method...
 */
package OOPsCOncept.exercise_2_1;

public class MainMethod {

	public static void main(String[] args) {
		
		Author author1=new Author("A1","A!@gmail.com",'M');
		Book book1=new Book("Book1",author1,100,3);
		
		System.out.println(book1);       //System.out.println(book1.toString())
		
		System.out.println("Author Name: "+book1.getAuthor());

	}

}

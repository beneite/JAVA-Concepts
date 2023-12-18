/**
 *
 */
package collectionsPrograms.LinkedList;

import java.util.LinkedList;

public class linkedListAllMethods {

    public static void main(String[] args){
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.addFirst("A");
        ll1.addLast("F");
        ll1.add("B");
        ll1.addLast("C");
        System.out.println("ll1 elements:"+ll1);
        System.out.println("ll1 First elements:"+ll1.getFirst());
        System.out.println("ll1 Last elements:"+ll1.getLast());
    }
}

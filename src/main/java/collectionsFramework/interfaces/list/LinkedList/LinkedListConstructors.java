/**
 *
 */
package collectionsFramework.interfaces.list.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListConstructors {

    public static void main(String[] args){

        // #1. default
        LinkedList<String> ll1 = new LinkedList<>();
        System.out.println("ll1 elements:"+ll1);

        // #2. constructor to convert other collections to LL
        HashSet<String> hs= new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        LinkedList<String> ll2 = new LinkedList<>(hs);
        System.out.println("ll2 elements:"+ll2);
    }
}

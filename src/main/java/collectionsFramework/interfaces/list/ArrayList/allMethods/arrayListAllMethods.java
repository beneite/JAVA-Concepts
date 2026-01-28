/** add, addAll, remove, heterogeneous elements
 *
 */
package collectionsFramework.interfaces.list.ArrayList.allMethods;

import java.util.ArrayList;

public class arrayListAllMethods {

    public static void main(String[] args){

        // heterogeneous elements storing
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add('A');
        arrayList.add(2);
        arrayList.add(null);
        arrayList.add(12.5);
        arrayList.add(null);
        arrayList.add("B");
        System.out.println("arrayList elements"+arrayList);

        // removing elements
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("A");
        arrayList2.add("B");
        arrayList2.add("C");
        arrayList2.add("D");
        arrayList2.remove(2);
        arrayList2.remove("D");
        System.out.println("arrayList2 elements"+arrayList2);
    }
}

/** Different constructors of ArrayList
 *
 */
package collectionsPrograms.arrayListCode.differentConstructors;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListAllConstructors {

    public static void main(String[] args){

        //1. default constructor
        ArrayList<String> defaultArrList = new ArrayList<>();
        System.out.println("defaultArrList elements:"+defaultArrList);
        System.out.println("defaultArrList Size:"+defaultArrList.size());

        //2. constructor with size
        ArrayList<Integer> sizeArrList = new ArrayList<>(10);

        //3. constructor to convert other collections to arraylist
        HashSet<String> hs= new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");

        ArrayList<String> hsToArrList = new ArrayList<>(hs);
        System.out.println("hs elements:"+hs);
        System.out.println("hsToArrList elements:"+hsToArrList);
    }
}

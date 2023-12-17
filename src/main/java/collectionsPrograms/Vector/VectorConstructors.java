/**
 *
 */
package collectionsPrograms.Vector;

import java.util.HashSet;
import java.util.Vector;

public class VectorConstructors {

    public static void main(String[] args){

        Vector<String> vct1= new Vector<>();
        System.out.println("vct1 elements:"+vct1);
        //#1. displaying the default capacity of vector
        System.out.println("vct1 size:"+vct1.capacity());

        //#2. constructor to explicitly define capacity/size
        Vector<String> vct2 = new Vector<>(4);
        System.out.println("vct2 size:"+vct2.capacity());

        //#3. constructor with capacity and incremental capacity
        Vector<String> vct3 = new Vector<>(6,5);
        System.out.println("vct3 size:"+vct3.capacity());

        //4. constructor to convert other collections to vector
        HashSet<String> hs= new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");

        Vector<String> vct4 = new Vector<>(hs);
        System.out.println("vct4 elements:"+vct4);


    }
}

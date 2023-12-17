/**
 *
 */
package collectionsPrograms.Vector;

import java.util.Vector;

public class VectorAllMethods {

    public static void main(String[] args) {

        Vector vct1 = new Vector();
        vct1.add(1);
        vct1.add('A');
        vct1.add(2);
        vct1.add(null);
        vct1.add(12.5);
        vct1.add(null);
        vct1.add("B");
        System.out.println("vct1 elements:" + vct1);
        System.out.println("vct1 First elements:" + vct1.firstElement());
        System.out.println("vct1 Last elements:" + vct1.lastElement());
        System.out.println("vct1 elementAt:" + vct1.elementAt(vct1.size()-1));
        System.out.println("vct1 remove:" + vct1.remove(vct1.size()-1));
        System.out.println("vct1 elementAt:" + vct1.elementAt(vct1.size()-1));
        System.out.println("vct1 remove:" + vct1.removeElement('A'));
        System.out.println("vct1 remove:" + vct1.removeElement('c'));
        vct1.removeAllElements();
        System.out.println("vct1 elements:" + vct1);
    }
}

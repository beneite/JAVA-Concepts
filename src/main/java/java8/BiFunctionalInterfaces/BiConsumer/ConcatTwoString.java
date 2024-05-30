/**
 * method to concat two strings
 */
package java8.BiFunctionalInterfaces.BiConsumer;

import java.util.function.BiConsumer;

public class ConcatTwoString {
    public static void main(String[] args){
        BiConsumer<String, String> mergeThem = (str1, str2)-> System.out.println(str1+str2);

        mergeThem.accept("abc","def");
        mergeThem.accept("Ashish","Mishra");
    }
}

/**
 * method to count the number of spaces in a string
 */
package java8.PracticalUse.functionUsage;

import java.util.function.Function;

public class CountNoOfSpaces {

    public static void main(String[] args){

        Function<String,Integer> countSpaces = str -> str.length()-str.replace(" ","").length();

        System.out.println(countSpaces.apply("Mr Ashish Mishra Ji"));
    }
}

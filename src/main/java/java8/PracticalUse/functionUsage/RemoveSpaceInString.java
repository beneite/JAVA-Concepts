/**
 * program to remove 1 character from the string and return string
 */
package java8.PracticalUse.functionUsage;

import java.util.function.Function;

public class RemoveSpaceInString {

    public static void main(String[] args){
        Function<String,String> removeHim = str -> str.replace("1","");

        System.out.println(removeHim.apply("Ash1ish"));
    }
}

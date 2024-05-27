/**
 * program print Non null strings and empty strings from an array of strings
 */
package java8.PracticalUse.predicateUsage;

import java.util.function.Predicate;

public class RemoveNullFromStringArray {

    public static void main(String[] args) {

        String[] names = {"Ashish", "Kajal","" ,null ,"Keyur", "Dinesh", "Kohli", "Neeraj", null};

        Predicate<String> removeNullOrEmtpty = name -> name == null || name.length()== 0  ;

        for(String name : names){
            if(removeNullOrEmtpty.negate().test(name)){
                System.out.println(name);
            }
        }
    }
}

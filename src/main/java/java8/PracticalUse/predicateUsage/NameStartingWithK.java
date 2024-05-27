/**
 * method to find the names which are starting with K
 */
package java8.PracticalUse.predicateUsage;

import java.util.function.Predicate;

public class NameStartingWithK {

    public static void main(String[] args) {
    String[] names = {"Ashish", "Kajal","" ,"Keyur", "Dinesh", "Kohli", "Neeraj"};

    Predicate<String> startWithK = (name)-> !name.isEmpty() && name.charAt(0) == 'K' ;

    for(String name : names){
        if(startWithK.test(name)){
            System.out.println(name);
        }
    }
    }
}

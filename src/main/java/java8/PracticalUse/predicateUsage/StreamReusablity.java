/**
 * Over here it will not work since we cannot split the stream and can have only 1 terminal operation attached
 */
package java8.PracticalUse.predicateUsage;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamReusablity {
    public static void main(String[] args){

        ArrayList<String> l = new ArrayList<>();
        l.add("Ashish"); l.add("Raj"); l.add("Ram"); l.add("Alok"); l.add("Mani");

        Stream<String> validNames = l.stream().filter(str -> str.length()>3);

        // using this variable for multiple purposes

        // converting to upper case
        System.out.println("printing upper case");
        validNames.map(str -> str.toUpperCase()).forEach(str ->System.out.println(str));

        // converting to upper case
        System.out.println("printing lower case");
        validNames.map(str -> str.toLowerCase()).forEach(str ->System.out.println(str));        // *****ERROR******


    }
}

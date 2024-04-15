package java8.lambda.HigherOrderFunction.typeTwo;

/**
 * as if now, we provide the data to a method and the method will perform some operation as per the method definition.
 */
public class ConventionalMethodWorking {

    public static void main(String[] args){
        convertToUpperCase("Ashish");
        convertToLowerCase("Ashish");
    }

    public static void convertToUpperCase(String str){
        System.out.println(str.toUpperCase());
    }
    public static void convertToLowerCase(String str){
        System.out.println(str.toLowerCase());
    }
}

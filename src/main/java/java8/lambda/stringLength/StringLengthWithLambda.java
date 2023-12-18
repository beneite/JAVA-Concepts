/**
 * method to find string length using lambda expression
 */
package java8.lambda.stringLength;

@FunctionalInterface
interface findStringLength{
    public int findLength(String str);
}

public class StringLengthWithLambda {
    public static void main(String[] args){
        findStringLength length = (str)->str.length();
        findStringLength length2 = str->str.length();

        System.out.println(length.findLength("ABC"));
        System.out.println(length.findLength("ABCDF"));
        System.out.println(length2.findLength("ABC"));
        System.out.println(length2.findLength("ABCDF"));
    }
}

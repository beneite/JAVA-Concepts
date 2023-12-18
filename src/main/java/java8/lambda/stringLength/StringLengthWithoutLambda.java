/**
 * method to find string length without using lambda expression
 */
package java8.lambda.stringLength;

interface inter{
    public int findLength(String str);
}

class Demo implements inter{

    public int findLength(String str) {
        return str.length();
    }
}

public class StringLengthWithoutLambda {
    public static void main(String[] args){
        inter i = new Demo();
        System.out.println(i.findLength("ABC"));
        System.out.println(i.findLength("ABCD"));
    }
}

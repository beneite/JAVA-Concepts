package Reflection.getClassClassObject;

public class GetClassExample {

    public static void main(String[] args){
        GetClassExample getClassExample = new GetClassExample();
        Class c = getClassExample.getClass();
        System.out.println("Name:"+c.getName());
    }
}

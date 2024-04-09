package java8.PracticalUse;

@FunctionalInterface
interface myFunctionalInterface{
    public void myMethod();
}

public class FunctionalInterfaceAsBehaviour {

    public static void callMeAsBehaviour(myFunctionalInterface myFunctionalInterface){
        myFunctionalInterface.myMethod();
    }

    public static void main(String[] args){
        callMeAsBehaviour(()-> System.out.println("hello"));
    }
}

package multiThreadingConcepts.methods;

/**
 * public boolean isAlive()
 * This method can be used to check whether a thread is in live or not.
 */

public class IsAlive {
    public static void main(String[] args){
        Thread th = new Thread();
        System.out.println(th.isAlive());//false
        th.start();
        System.out.println(th.isAlive());//true
        System.out.println(th.isAlive());// can be false if thread execution is completed
        System.out.println(th.isAlive());
        System.out.println(th.isAlive());
    }
}

package multiThreadingConcepts.methods;

/**
 * public static int activeCount()
 * It will return the no of threads which are in active.
 */

public class ActiveCount {

    public static void main(String[] args){
        System.out.println("Thread active count:"+Thread.activeCount());
        Thread th = new Thread();
        Thread th2 = new Thread();
        th.start();
        System.out.println("Thread active count:"+Thread.activeCount());
        th2.start();
        System.out.println("Thread active count:"+Thread.activeCount());
    }
}

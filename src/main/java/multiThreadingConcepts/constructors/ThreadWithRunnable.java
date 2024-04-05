package multiThreadingConcepts.constructors;

/**
 * This constructor can be used to create Thread class object with the specified Runnable
 * reference.
 */
public class ThreadWithRunnable {

    public static void main(String[] args){
        Runnable r = new Thread();
        Thread th = new Thread(r);
        System.out.println(th);
    }
}

package multiThreadingConcepts.constructors;

/**
 * This constructor can be used to create Thread class object with the specified name.
 */
public class ThreadWithThreadName {

    public static void main(String[] args){
        Thread th = new Thread("core Java");
        System.out.println("Thread default values:"+th);
    }
}

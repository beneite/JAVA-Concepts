package multiThreadingConcepts.constructors;

/**
 * This constructor can be used to create Thread class object with the specified Runnable
 * reference and with the specified name.
 */
public class ThreadWithRunnableAndName {

    public static void main(String[] args){
        Runnable r = new Thread();
        Thread th = new Thread(r,"Ashish");
        System.out.println(th);

    }
}

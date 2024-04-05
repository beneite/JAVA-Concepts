package multiThreadingConcepts.constructors;

/**
 * This constructor can be used to create Thread class object with the specified
 * ThreadGroup name and with the specified thread name.
 *
 * NOTE: To provide ThreadGroup name we have to use a predefined class like
 * java.lang.ThreadGroup, to create ThreadGroup class object we have to use the following
 * Constructor.
 */
public class GroupNameAndRunnable {

    public static void main(String[] args){
        Runnable r = new Thread();
        ThreadGroup tg = new ThreadGroup("Ashish group");
        Thread th = new Thread(tg,r);
        System.out.println(th);
    }
}

package multiThreadingConcepts.constructors;

/**
 * public Thread(ThreadGroup tg, Runnable r, String name)
 * This constructor can be used to create Thread class object with the specified
 * ThreadGroup name, with the Runnable reference and with the thread name.
 */
public class GroupAndRunnableAndName {
    public static void main(String[] args){
        Runnable r = new Thread();
        ThreadGroup tg = new ThreadGroup("Ashish Group");
        Thread th = new Thread(tg,r,"Thread Name");
        System.out.println(th);
    }
}

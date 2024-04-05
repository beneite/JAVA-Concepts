package multiThreadingConcepts.constructors;

/**
 * This constructor can be used to create Thread class object with the specified
 * ThreadGroup name and with the specified Thread name.
 */
public class GroupNameWithThreadName {

    public static void main(String[] args){
        Runnable r = new Thread();
        ThreadGroup tg = new ThreadGroup("Ashish Group");
        Thread th = new Thread(tg,"Ashish");
        System.out.println(th);
    }
}

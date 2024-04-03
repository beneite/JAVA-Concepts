package multiThreadingConcepts.threadCreation;

/**
 * please follow the below steps to create a thread using Runnable class:
 * 1. implement the Runnable class
 * 2. Override the run method.
 * 3. create an object of the below class.
 * 4. Create and object of thread class by passing the base class object as parameter in constructor.
 * 5. invoke the thread using start
 */
public class ByImplementingRunnableClass implements Runnable{

    public void run(){
        System.out.println("Thread start via run");
    }

    public static void main(String[] args){
        ByImplementingRunnableClass myThread = new ByImplementingRunnableClass();
        Thread th = new Thread(myThread);
        th.start();
    }
}

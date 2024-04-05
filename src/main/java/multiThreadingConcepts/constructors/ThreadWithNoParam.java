package multiThreadingConcepts.constructors;

/**
 * This constructor can be used to create thread class object with the following
 * properties.
 * Thread unique id: #21
 * Thread Name: Thread-0
 * Thread Priority: 5
 * Thread group Name : main
 */
public class ThreadWithNoParam implements Runnable{

    @Override
    public void run() {
        System.out.println("my custom run");
    }

    public static void main(String[] args){
        ThreadWithNoParam classObject = new ThreadWithNoParam();
        Thread th = new Thread(classObject);
        th.start();
        System.out.println("Thread default values:"+th);
    }
}

/*
  The output you're seeing, Thread[#21,Thread-0,5,main], indicates that your Thread object has been assigned a specific ID (#21).
  When a Thread object is created and started, the Java Virtual Machine (JVM) assigns a unique ID to it. This ID is used internally to identify the thread. In your case, the ID assigned to your Thread object is 21.
  So, the output Thread[#21,Thread-0,5,main] breaks down as follows:
  #21: This is the unique ID assigned to your thread.
  Thread-0: This is the name of the thread. If you don't explicitly set a name, Java assigns a default name like Thread-0, Thread-1, and so on.
  5: This is the priority of the thread. Priority ranges from 1 to 10, with 1 being the lowest priority and 10 being the highest.
  main: This is the name of the thread group. By default, threads belong to the main thread group unless specified otherwise.
  Therefore, the output Thread[#21,Thread-0,5,main] is entirely valid and corresponds to the default toString() representation of the Thread object, indicating the ID, name, priority, and thread group of the thread.
 */
package multiThreadingConcepts.deamonThread;

/**
 * void setDaemon(boolean status):
 * In Java, daemon threads are low-priority threads that run in the background to perform tasks such as garbage collection or provide services to user threads.
 * The life of a daemon thread depends on the mercy of user threads, meaning that when all user threads finish their execution, the Java Virtual Machine (JVM) automatically terminates the daemon thread.
 * To put it simply, daemon threads serve user threads by handling background tasks and have no role other than supporting the main execution.
 */

public class DemonThreadPractise extends Thread{

    public DemonThreadPractise(String threadName){
        super(threadName);
    }

    public void run()
    {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }

        else
        {
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args){
        DemonThreadPractise t1 = new DemonThreadPractise("t1");
        DemonThreadPractise t2 = new DemonThreadPractise("t2");
        DemonThreadPractise t3 = new DemonThreadPractise("t3");

        // Setting user thread t1 to Daemon
        t1.setDaemon(true);

        // starting first 2 threads
        t1.start();
        t2.start();

        // Setting user thread t3 to Daemon
        t3.setDaemon(true);
        t3.start();
    }
}

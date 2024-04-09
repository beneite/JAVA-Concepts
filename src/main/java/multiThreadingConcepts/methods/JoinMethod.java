package multiThreadingConcepts.methods;

/**
 * public void join()throws InterruptedException
 * This method will pause a thread to complete a thread on which we accessed join()
 * method , after completion of the respective thread, paused thread will continue its
 * execution part automatically.
 */

class Welcome implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Welcome thread:"+i);
        }
    }
}

public class JoinMethod {

    public static void main(String[] args) throws InterruptedException {
        Welcome welcome = new Welcome();
        Thread th = new Thread(welcome);
        th.start();
        th.join();
        for(int i=0;i<10;i++){
            System.out.println("Main thread:"+i);
        }
    }
}

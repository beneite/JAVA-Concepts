package multiThreadingConcepts.threadCreation;

/**
 * please follow the below steps to create a thread using Thread class:
 * 1. extend the thread class.
 * 2. override the existing methods. ex: run
 * 3. create an object of the below class.
 * 4. invoke the thread using start. start create a call stack through calling run()
 */

public class ByExtendingThreadClass extends Thread{

    public void run(){
        System.out.println("Thread start via run");
    }

    public static void main(String[] args){

        ByExtendingThreadClass myThread = new ByExtendingThreadClass();
        myThread.start();

        //myThread.start(); if we call this again, this will throw run time exception.
        // myThread.run(): will not invoke thread but will call the call method directly.
    }
}

package multiThreadingConcepts.methods;

/**
 * public static void sleep(long time) throws InterruptedException
 *  This method can be used to keep a running thread into sleeping state up to the
 * specified sleep time.
 *  In general, we will use sleep() method in run() method of user defined thread class,
 * where to handle InterruptedException we must use try-catch-finally syntax only, we
 * must not use "throws" keyword in
 *  run() method prototype, because, we are overriding Thread class or Runnable
 * interface predefined run() method.
 */
public class SleepMethod {
    public static void main(String[] args){

    }
}

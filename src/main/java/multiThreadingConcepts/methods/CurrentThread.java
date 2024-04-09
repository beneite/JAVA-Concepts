package multiThreadingConcepts.methods;

/**
 * public static thread currentThread()
 * It can be used to get Thread object reference which is in active at present.
 */
class MyThread extends Thread
{
    @Override
    public void run() {

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class CurrentThread {
    public static void main(String[] args){
        MyThread myThread1 =  new MyThread();
        MyThread myThread2 =  new MyThread();
        MyThread myThread3 =  new MyThread();
        myThread1.setName("myThread1");
        myThread2.setName("myThread2");
        myThread3.setName("myThread3");

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}

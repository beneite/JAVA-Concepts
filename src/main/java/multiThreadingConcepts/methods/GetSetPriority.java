package multiThreadingConcepts.methods;

/**
 * It can be used to set a particular priority value to the Thread, but, here the priority
 * value must be provided in the range from 1 to 10, if we provide any other value then
 * JVM will rise an exception like java.lang.IllegalArgumentException.
 * To represent Thread priority values, java.lang.Thread class has provided the following
 * constants.
 * public static final int MIN_PRIORITY=1;
 * public static final int NORM_PRIORITY=5;
 * public static final int MAX_PRIORITY=10;
 */

public class GetSetPriority {

    public static void main(String[] args){
        Thread threadOne = new Thread();
        System.out.println(threadOne.getPriority());
        threadOne.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Min priority:"+threadOne.getPriority());
        threadOne.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Max Priority:"+threadOne.getPriority());
        threadOne.setPriority(12);  // error
        System.out.println("for 12:"+threadOne.getPriority());
    }
}

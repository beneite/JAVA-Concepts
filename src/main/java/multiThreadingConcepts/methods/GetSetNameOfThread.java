package multiThreadingConcepts.methods;

/**
 * public void setName(String name)
 * It can be used to set a particular name to the Thread explicitly.
 *
 * public String getName()
 * It can be used to get thread name explicitly.
 */

public class GetSetNameOfThread {

    public static void main(String[] args){
        Thread threadOne = new Thread();
        System.out.println(threadOne.getName());
        threadOne.setName("AshishThread");
        System.out.println(threadOne.getName());
    }
}

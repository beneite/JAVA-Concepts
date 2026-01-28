/**
 *
 */
package collectionsFramework.interfaces.list.Stack;

import java.util.Stack;

public class StackMethods {

    public static void main(String[] args){

        Stack<String> stack1 = new Stack<>();
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");
        stack1.push("D");
        stack1.push("E");
        System.out.println("stack1 Elements:"+stack1);

        System.out.println("element pop:"+stack1.pop());
        System.out.println("stack1 Elements:"+stack1);

        System.out.println("stack1 Peek:"+stack1.peek());
        System.out.println("stack1 Size:"+stack1.size());

        System.out.println("stack1 Elements:"+stack1);
        System.out.println("stack1 Search:"+stack1.search("B"));
        System.out.println("stack1 Search:"+stack1.search('B'));

    }
}

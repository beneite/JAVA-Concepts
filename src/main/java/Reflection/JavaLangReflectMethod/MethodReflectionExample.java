package Reflection.JavaLangReflectMethod;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodReflectionExample {

    // Sample class with methods
    public static class MyClass {
        private String name;
        private int value;

        public MyClass(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public void printDetails() throws ArrayIndexOutOfBoundsException{
            System.out.println("Name: " + name + ", Value: " + value);
        }

        public int calculateSquare(int num) {
            return num * num;
        }

        private void privateMethod() {
            System.out.println("Private method called");
        }
    }

    public static void main(String[] args) {
        try {
            // Get the class object
            Class<?> clazz = MyClass.class;

            // Get all declared methods of the class
            Method[] methods = clazz.getDeclaredMethods();

            // Create an instance of MyClass
            MyClass instance = new MyClass("Example", 42);

            // Iterate over each method
            for (Method method : methods) {
                // Print method information
                System.out.println("Method Name: " + method.getName());
                System.out.println("Declaring Class: " + method.getDeclaringClass());
                System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
                System.out.println("Return Type: " + method.getReturnType());
                System.out.println("Parameter Types: " + java.util.Arrays.toString(method.getParameterTypes()));
                System.out.println("Exception Types: " + java.util.Arrays.toString(method.getExceptionTypes()));
                System.out.println();

                // Handle accessibility
                method.setAccessible(true);

                // Invoke methods with specific conditions
                if (method.getName().equals("printDetails")) {
                    method.invoke(instance); // Invoke printDetails() method
                } else if (method.getName().equals("calculateSquare") && method.getParameterCount() == 1) {
                    Object result = method.invoke(instance, 5); // Invoke calculateSquare(5) method
                    System.out.println("Result of calculateSquare(5): " + result);
                }
                // Additional logic to invoke other methods as needed

                System.out.println("************************************************************");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * Explanation
 * Class Definition (MyClass): Defines a sample class MyClass with three methods:
 *
 * printDetails(): Prints the instance's name and value.
 * calculateSquare(int num): Calculates the square of a number.
 * privateMethod(): A private method that prints a message.
 * Reflection (java.lang.reflect.Method):
 *
 * Class<?> clazz = MyClass.class;: Retrieves the Class object for MyClass.
 * Method[] methods = clazz.getDeclaredMethods();: Retrieves all declared methods of MyClass.
 * Iterating over Methods: The program iterates over each method obtained:
 *
 * Prints method information such as name, declaring class, modifiers, return type, parameter types, and exception types.
 * Sets accessibility using method.setAccessible(true); if necessary.
 * Method Invocation:
 *
 * Depending on the method name and parameters, the program selectively invokes methods:
 * Invokes printDetails() to display the instance's state.
 * Invokes calculateSquare(5) to compute the square of the number 5.
 * Output:
 *
 * Each method invocation result is printed, demonstrating dynamic method invocation using reflection.
 */

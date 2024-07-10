package Reflection.JavaLangReflectConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorReflectionExample {
    // Sample class with different constructors
    public static class MyClass {
        private String name;
        private int value;

        public MyClass() {
            this.name = "Default Name";
            this.value = 0;
        }

        public MyClass(String name) {
            this.name = name;
            this.value = 0;
        }

        public MyClass(String name, int value) throws ArrayIndexOutOfBoundsException, NullPointerException{
            this.name = name;
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyClass{name='" + name + "', value=" + value + "}";
        }
    }

    public static void main(String[] args) {
        try {
            // Get the class object
            Class<?> clazz = MyClass.class;

            // Get all declared constructors of the class
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();

            // Iterate over each constructor
            for (Constructor<?> constructor : constructors) {
                // Print constructor information
                System.out.println("Constructor Name: " + constructor.getName());
                System.out.println("Constructor Simple Name: " + constructor.getDeclaringClass().getSimpleName());
                System.out.println("Declaring Class: " + constructor.getDeclaringClass());
                System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
                System.out.println("Parameter Types: " + java.util.Arrays.toString(constructor.getParameterTypes()));
                System.out.println("Parameter Count: " + constructor.getParameterCount());
                System.out.println("Exception Types: " + java.util.Arrays.toString(constructor.getExceptionTypes()));
                System.out.println();

                // Handle accessibility if needed
                constructor.setAccessible(true);

                // Create instances using each constructor
                Object instance;
                if (constructor.getParameterCount() == 0) {
                    instance = constructor.newInstance();
                } else if (constructor.getParameterCount() == 1 && constructor.getParameterTypes()[0] == String.class) {
                    instance = constructor.newInstance("Custom Name");
                } else if (constructor.getParameterCount() == 2 && constructor.getParameterTypes()[0] == String.class && constructor.getParameterTypes()[1] == int.class) {
                    instance = constructor.newInstance("Custom Name", 42);
                } else {
                    // Handle other constructors as needed
                    continue; // Skip if no suitable constructor found
                }

                // Print created instance
                System.out.println("Created Instance: " + instance);
                System.out.println("************************************************************");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * Explanation
 * Class Definition: The MyClass class is a sample class with multiple constructors. Each constructor initializes name and value fields differently.
 *
 * Reflection:
 *
 * Class<?> clazz = MyClass.class; obtains the class object for MyClass.
 * Constructor<?>[] constructors = clazz.getDeclaredConstructors(); retrieves all declared constructors of MyClass.
 * Iterating over Constructors: The program iterates over each constructor obtained:
 *
 * Prints constructor information such as name, declaring class, modifiers, parameter types, parameter count, and exception types.
 * Sets accessibility using constructor.setAccessible(true); if necessary.
 * Creates instances using constructor.newInstance(args); with appropriate arguments based on parameter types and counts.
 * Instance Creation:
 *
 * It checks each constructor's parameters to decide which one to invoke for instance creation.
 * If no suitable constructor is found, it skips to the next iteration.
 * Output:
 *
 * Each created instance is printed using System.out.println("Created Instance: " + instance);.
 */
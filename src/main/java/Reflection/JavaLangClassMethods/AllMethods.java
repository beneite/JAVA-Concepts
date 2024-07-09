package Reflection.JavaLangClassMethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class AllMethods {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("Reflection.JavaLangClassMethods.Employee");

        // Returns the fully qualified name of the class.
        System.out.println("Class Full name:"+c.getName());

        // Returns the simple name of the class.
        System.out.println("Class name:"+c.getSimpleName());

        // Returns the modifiers of the class or interface represented by this Class object
        System.out.println("Access modifiers:"+ Modifier.toString(c.getModifiers()));

        // returns super class name
        System.out.println("Super class name:"+ c.getSuperclass().getSimpleName());

        // returns the list of Interfaces
        System.out.println("Interfaces:");
        Class[] interfacesList = c.getInterfaces();
        Arrays.stream(interfacesList).forEach(e -> System.out.print(e.getName()+"\t"));
        System.out.println();

        // returns the list of Constructors
        System.out.println("Constructors:");
        Constructor[] constructorsList = c.getDeclaredConstructors();
        Arrays.stream(constructorsList).forEach(e -> System.out.print(e.getName()+"\t"));
        System.out.println();

        // returns the list of Methods
        System.out.println("Methods:");
        Method[] methodsList = c.getDeclaredMethods();
        Arrays.stream(methodsList).forEach(e -> System.out.print(e.getName()+"\t"));
        System.out.println();
    }
}

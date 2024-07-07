package Reflection.getClassClassObject;

/**
 * In Java, when you write Class c = UsingClassName.class;,
 Yes, when you use `UsingClassName.class` in Java, it does indeed load the class using its bytecode. Here's how it works in more detail:

 1. **Class Loading**: The JVM loads classes into memory as they are referenced in the code. This process is part of the JVM's class loading mechanism, which is responsible for locating and loading classes into the JVM.

 2. **Bytecode Loading**: When you write `UsingClassName.class`, the JVM needs to load the bytecode of the `UsingClassName` class. The bytecode is the compiled form of the Java source code, stored in `.class` files.

 3. **Metadata Creation**: Once the bytecode is loaded, the JVM creates a `Class` object that represents the loaded class. This `Class` object contains metadata about the class, such as its name, superclass, implemented interfaces, fields, methods, and annotations.

 4. **Reflection**: The `Class` object (`c` in `Class c = UsingClassName.class;`) allows you to perform reflection, which is the ability to dynamically inspect and manipulate classes, methods, and fields at runtime. You can use methods like `getName()`, `getMethods()`, `getFields()`, etc., on the `Class` object to retrieve information about the class and its members.

 In summary, `UsingClassName.class` triggers the JVM to load the bytecode of the `UsingClassName` class into memory and creates a `Class` object that represents this class. This process is fundamental to how Java handles class loading and reflection, enabling dynamic and flexible behavior in Java applications.
 */

public class UsingClassName {
    public static void main(String[] args){
        Class c = UsingClassName.class;

        System.out.println("Name:"+c.getName());
    }
}

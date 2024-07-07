package Reflection.getClassClassObject;

/**
 * When you write Class c = Class.forName("Reflection.getClassClassObject.ForNameExample"); in Java, you are dynamically loading a class named Reflection.getClassClassObject.ForNameExample using its fully qualified name ("Reflection.getClassClassObject.ForNameExample"). Here’s what happens internally:
 * Class Loading: The Class.forName() method is a static method of the java.lang.Class class. It triggers the JVM to load and initialize the class specified by its fully qualified name ("Reflection.getClassClassObject.ForNameExample").
 * Class Initialization: If the class Reflection.getClassClassObject.ForNameExample hasn't been loaded before, the JVM initiates its loading process. This involves locating the class bytecode (usually in a .class file), loading it into memory, and initializing the class if it hasn't been already.
 * Returning the Class Object: Once the class is successfully loaded and initialized, Class.forName() returns a Class object that represents the loaded class (Reflection.getClassClassObject.ForNameExample). This Class object contains metadata about the class, such as its name, superclass, implemented interfaces, fields, methods, and annotations.
 */
public class ForNameExample {

    public int a;
    public void display(){

    }

    public static void main(String[] args){

        try {
            Class c = Class.forName("Reflection.getClassClassObject.ForNameExample");
            System.out.println("Name:"+c.getName());
            System.out.println("Simple Name:"+c.getSimpleName());

            Package pkg = c.getPackage();
            System.out.println("Package: " + pkg.getName());


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

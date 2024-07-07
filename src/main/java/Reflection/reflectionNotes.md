## Java reflection

- Java reflection is a powerful feature that allows you to inspect and modify the structure and behavior of classes,
  interfaces, fields, and methods at runtime. It provides a way to examine or modify the behavior of applications
  running in the Java Virtual Machine (JVM).
- Reflection is an API that is used to examine or modify the behavior of methods, classes, and interfaces at runtime.
  The required classes for reflection are provided under ```java.lang.reflect``` and ```java.lang.Class``` package which
  is essential in order to understand reflection.

> Note: We can also access the private member of a class outside the class using reflection.

## Here are some key aspects of Java reflection:

- **Inspecting Classes**: You can use reflection to examine the fields, methods, and constructors of a class. This
  allows you to dynamically discover information about a class's structure.

- **Accessing Fields and Methods**: Reflection enables you to access and modify fields and invoke methods at runtime,
  even if they are private or inaccessible under normal circumstances.

- **Dynamic Instantiation**: Reflection allows you to dynamically create instances of classes and invoke their
  constructors.

- **Annotations**: You can use reflection to inspect annotations associated with classes, fields, and methods, enabling
  you to create more flexible and configurable applications.

- **Performance Considerations**: While powerful, reflection can have performance implications compared to direct method
  calls or field accesses, as it involves runtime type checking and method lookup.

## Reflection API arch:

<img src="/gitresources/imagesForNotes/reflectionApiArchitecture.png" alt=""/>

## Reflection API Behaviour:

<img src="/gitresources/imagesForNotes/reflectionApiBehaviour.png" alt=""/>

### Java Reflection: Where It Can Be Used

Java reflection is a powerful feature that allows you to inspect and modify the structure and behavior of classes,
interfaces, fields, and methods at runtime. Here are some common use cases for Java reflection:

1. **Frameworks and Libraries**: Many frameworks and libraries use reflection to provide flexible and extensible
   features. For example, dependency injection frameworks like Spring rely heavily on reflection to instantiate and
   configure objects based on annotations and configuration files.

2. **Serialization and Deserialization**: Reflection is used in serialization frameworks (e.g., Jackson, Gson) to
   dynamically map Java objects to JSON or XML representations and vice versa.

3. **Testing**: Reflection is often used in testing frameworks (e.g., JUnit) to dynamically discover and execute test
   cases, especially when using annotations to mark test methods.

4. **Debugging and Profiling**: Reflection can be useful in debugging tools and profilers to inspect the state of
   objects and classes at runtime.

5. **Dynamic Proxies**: Reflection is used to create dynamic proxies, which intercept method invocations to add
   additional behavior, such as logging or security checks.

6. **JavaBeans**: Reflection is used in JavaBeans to dynamically access and manipulate properties of Java objects using
   conventions like `getPropertyName()` and `setPropertyName()`.

7. **GUI Development**: Reflection can be used in graphical user interface (GUI) frameworks to bind UI components to
   data models dynamically.

8. **Configuration and Metadata**: Reflection enables applications to read and interpret configuration files and
   metadata annotations at runtime.

9. **Plugins and Extensions**: Reflection allows applications to dynamically load and execute code from external plugins
   or extensions.

10. **Database Access**: Reflection can be used in Object-Relational Mapping (ORM) frameworks (e.g., Hibernate) to map
    Java objects to database tables dynamically.

These examples illustrate the versatility of Java reflection, providing runtime introspection and adaptability in
various domains of software development.

For more information on Java reflection, refer to
the [Java Reflection API Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/reflect/package-summary.html).

## java.lang.Class class

The java.lang.Class class performs mainly two tasks:

- provides methods to get the metadata of a class at run time.
- provides methods to examine and change the run time behavior of a class.

### Commonly used methods of Class class:

| Method                                                                                                                  | Description                                               |
|-------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------|
| 1) public String getName()                                                                                              | returns the class name                                    |
| 2) public static Class forName(String className)throws ClassNotFoundException                                           | loads the class and returns the reference of Class class. |
| 3) public Object newInstance()throws InstantiationException,IllegalAccessException                                      | creates new instance.                                     |
| 4) public boolean isInterface()                                                                                         | checks if it is interface.                                |
| 5) public boolean isArray()                                                                                             | checks if it is array.                                    |
| 6) public boolean isPrimitive()                                                                                         | checks if it is primitive.                                |
| 7) public Class getSuperclass()                                                                                         | returns the superclass class reference.                   |
| 8) public Field\[\] getDeclaredFields()throws SecurityException                                                         | returns the total number of fields of this class.         |
| 9) public Method\[\] getDeclaredMethods()throws SecurityException                                                       | returns the total number of methods of this class.        |
| 10) public Constructor\[\] getDeclaredConstructors()throws SecurityException                                            | returns the total number of constructors of this class.   |
| 11) public Method getDeclaredMethod(String name,Class\[\] parameterTypes)throws NoSuchMethodException,SecurityException | returns the method class instance.                        |

### How to get the object of Class class?
There are 3 ways to get the instance of Class class. They are as follows:
* [forName()](getClassClassObject/ForNameExample.java) method of Class class 
* [getClass()](getClassClassObject/GetClassExample.java) method of Object class
* the [.class](getClassClassObject/UsingClassName.java) syntax
1) **forName() method of Class class**
   - is used to load the class dynamically or to load the particular class byte code.
   - get the meta data of the class
   - returns the instance of Class class.
   - It should be used if you know the fully qualified name of class.This cannot be used for primitive types.

2) **getClass() method of Object class**
   - It returns the instance of Class class. It should be used if you know the type. 
   - Moreover, it can be used with primitives.
3) **The .class syntax**
   - If a type is available, but there is no instance, then it is possible to obtain a Class by appending ".class" to the name of the type.
   - It can be used for primitive data types also.




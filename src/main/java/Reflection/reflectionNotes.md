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

# java.lang.Class Methods

In Java, the `java.lang.Class` class is part of the reflection API and provides methods to get information about the
classes and objects during runtime. Below are some commonly used methods of the `Class` class: [Program Link](JavaLangClassMethods/AllMethods.java)

| Category                                 | Method Signature                                                    | Description                                                                                                                                                                                                    |
|------------------------------------------|---------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Getting Class Information**            | `String getName()`                                                  | Returns the name of the class.                                                                                                                                                                                 |
|                                          | `String getSimpleName()`                                            | Returns the simple name of the class.                                                                                                                                                                          |
|                                          | `Package getPackage()`                                              | Returns the package of the class.                                                                                                                                                                              |
|                                          | `ClassLoader getClassLoader()`                                      | Returns the class loader of the class.                                                                                                                                                                         |
|                                          | `Type getGenericSuperclass()`                                       | Returns the superclass of the class.                                                                                                                                                                           |
| **Creating Instances**                   | `T newInstance()`                                                   | Creates a new instance of the class using the no-arg constructor.                                                                                                                                              |
| **Retrieving Annotations**               | `<A extends Annotation> A getAnnotation(Class<A> annotationClass)`  | Returns the annotation of the specified type.                                                                                                                                                                  |
|                                          | `Annotation[] getAnnotations()`                                     | Returns all annotations present on the class.                                                                                                                                                                  |
| **Getting Fields**                       | `Field getField(String name)`                                       | Returns the public field with the specified name.                                                                                                                                                              |
|                                          | `Field[] getFields()`                                               | Returns all the public fields.                                                                                                                                                                                 |
|                                          | `Field getDeclaredField(String name)`                               | Returns the specified field (including private and protected).                                                                                                                                                 |
|                                          | `Field[] getDeclaredFields()`                                       | Returns all fields (including private and protected).                                                                                                                                                          |
| **Getting Methods**                      | `Method getMethod(String name, Class<?>... parameterTypes)`         | Returns the public method with the specified name and parameter types.                                                                                                                                         |
|                                          | `Method[] getMethods()`                                             | Returns all the public methods.                                                                                                                                                                                |
|                                          | `Method getDeclaredMethod(String name, Class<?>... parameterTypes)` | Returns the specified method (including private and protected).                                                                                                                                                |
|                                          | `Method[] getDeclaredMethods()`                                     | Returns all methods (including private and protected).                                                                                                                                                         |
| **Getting Constructors**                 | `Constructor<T> getConstructor(Class<?>... parameterTypes)`         | Returns the public constructor with the specified parameter types.                                                                                                                                             |
|                                          | `Constructor<?>[] getConstructors()`                                | Returns all the public constructors.                                                                                                                                                                           |
|                                          | `Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)` | Returns the specified constructor (including private and protected).                                                                                                                                           |
|                                          | `Constructor<?>[] getDeclaredConstructors()`                        | Returns all constructors (including private and protected).                                                                                                                                                    |
| **Superclasses and Interfaces**          | `Class<? super T> getSuperclass()`                                  | Returns the superclass of the class.                                                                                                                                                                           |
|                                          | `Class<?>[] getInterfaces()`                                        | Returns the interfaces implemented by the class.                                                                                                                                                               |
| **Modifiers**                            | `int getModifiers()`                                                | Returns the modifiers of the class or interface represented by this `Class` object (e.g., public, private, abstract).                                                                                          |
| **Instance Checking and Casting**        | `boolean isInstance(Object obj)`                                    | Determines if the specified object is an instance of the class.                                                                                                                                                |
|                                          | `boolean isAssignableFrom(Class<?> cls)`                            | Determines if the class or interface represented by this `Class` object is either the same as, or is a superclass or superinterface of, the class or interface represented by the specified `Class` parameter. |
|                                          | `T cast(Object obj)`                                                | Casts an object to the class or interface represented by this `Class` object.                                                                                                                                  |
| **Array and Primitive Type Information** | `boolean isArray()`                                                 | Determines if the `Class` object represents an array class.                                                                                                                                                    |
|                                          | `boolean isPrimitive()`                                             | Determines if the `Class` object represents a primitive type.                                                                                                                                                  |

These methods allow you to dynamically interact with and inspect Java classes at runtime, which is a powerful feature
for tasks such as building frameworks, libraries, and tools that need to work with arbitrary classes.

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
    - If a type is available, but there is no instance, then it is possible to obtain a Class by appending ".class" to
      the name of the type.
    - It can be used for primitive data types also.




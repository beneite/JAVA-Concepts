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

# `java.lang.Class` Methods

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

# `java.lang.reflect.Field` Methods

This document provides an overview of the main methods available in the `java.lang.reflect.Field` class, organized by category.[Program Link](JavaLangReflectField/FieldReflectionExample.java)

| **Category**           | **Method**                         | **Description**                                                            | **Example**                                      |
|------------------------|------------------------------------|----------------------------------------------------------------------------|--------------------------------------------------|
| **Get Field Information** | `getName`                          | Returns the name of the field.                                             | `String fieldName = field.getName();`            |
|                        | `getType`                          | Returns the `Class` object representing the type of the field.              | `Class<?> fieldType = field.getType();`          |
|                        | `getDeclaringClass`                | Returns the `Class` object representing the class that declares the field. | `Class<?> declaringClass = field.getDeclaringClass();` |
|                        | `getModifiers`                     | Returns the Java language modifiers for the field as an integer.            | `int modifiers = field.getModifiers();`          |
|                        | `isSynthetic`                      | Returns `true` if this field is a synthetic field; `false` otherwise.       | `boolean isSynthetic = field.isSynthetic();`     |
| **Access Field Values**| `get(Object obj)`                  | Returns the value of the field on the specified object.                     | `Object value = field.get(obj);`                 |
|                        | `getBoolean(Object obj)`           | Returns the value of the field as a `boolean`.                              | `boolean value = field.getBoolean(obj);`         |
|                        | `getByte(Object obj)`              | Returns the value of the field as a `byte`.                                 | `byte value = field.getByte(obj);`               |
|                        | `getChar(Object obj)`              | Returns the value of the field as a `char`.                                 | `char value = field.getChar(obj);`               |
|                        | `getShort(Object obj)`             | Returns the value of the field as a `short`.                                | `short value = field.getShort(obj);`             |
|                        | `getInt(Object obj)`               | Returns the value of the field as an `int`.                                 | `int value = field.getInt(obj);`                 |
|                        | `getLong(Object obj)`              | Returns the value of the field as a `long`.                                 | `long value = field.getLong(obj);`               |
|                        | `getFloat(Object obj)`             | Returns the value of the field as a `float`.                                | `float value = field.getFloat(obj);`             |
|                        | `getDouble(Object obj)`            | Returns the value of the field as a `double`.                               | `double value = field.getDouble(obj);`           |
| **Modify Field Values**| `set(Object obj, Object value)`    | Sets the field value on the specified object to the new value.              | `field.set(obj, newValue);`                      |
|                        | `setBoolean(Object obj, boolean z)`| Sets the field value as a `boolean`.                                        | `field.setBoolean(obj, newValue);`               |
|                        | `setByte(Object obj, byte b)`      | Sets the field value as a `byte`.                                           | `field.setByte(obj, newValue);`                  |
|                        | `setChar(Object obj, char c)`      | Sets the field value as a `char`.                                           | `field.setChar(obj, newValue);`                  |
|                        | `setShort(Object obj, short s)`    | Sets the field value as a `short`.                                          | `field.setShort(obj, newValue);`                 |
|                        | `setInt(Object obj, int i)`        | Sets the field value as an `int`.                                           | `field.setInt(obj, newValue);`                   |
|                        | `setLong(Object obj, long l)`      | Sets the field value as a `long`.                                           | `field.setLong(obj, newValue);`                  |
|                        | `setFloat(Object obj, float f)`    | Sets the field value as a `float`.                                          | `field.setFloat(obj, newValue);`                 |
|                        | `setDouble(Object obj, double d)`  | Sets the field value as a `double`.                                         | `field.setDouble(obj, newValue);`                |
| **Handle Accessibility**| `isAccessible`                     | Returns the value of the accessible flag for this field.                    | `boolean isAccessible = field.isAccessible();`   |
|                        | `setAccessible(boolean flag)`      | Sets the accessible flag for this field.                                    | `field.setAccessible(true);`                     |


# `java.lang.reflect.Constructor` Methods

This document provides an overview of the main methods available in the `java.lang.reflect.Constructor` class, organized by category.[Program Link](JavaLangReflectConstructor/ConstructorReflectionExample.java)

| **Category**           | **Method**                         | **Description**                                                                  | **Example**                                             |
|------------------------|------------------------------------|----------------------------------------------------------------------------------|---------------------------------------------------------|
| **Get Constructor Info**| `getName`                          | Returns the name of the constructor (which is the name of the declaring class).  | `String constructorName = constructor.getName();`       |
|                        | `getDeclaringClass`                | Returns the `Class` object representing the class that declares this constructor.| `Class<?> declaringClass = constructor.getDeclaringClass();` |
|                        | `getModifiers`                     | Returns the Java language modifiers for the constructor as an integer.           | `int modifiers = constructor.getModifiers();`           |
|                        | `getParameterTypes`                | Returns an array of `Class` objects representing the parameter types of the constructor.| `Class<?>[] paramTypes = constructor.getParameterTypes();` |
|                        | `getParameterCount`                | Returns the number of formal parameters for the constructor.                     | `int paramCount = constructor.getParameterCount();`     |
|                        | `getExceptionTypes`                | Returns an array of `Class` objects representing the exception types thrown by the constructor.| `Class<?>[] exceptionTypes = constructor.getExceptionTypes();` |
| **Invoke Constructor** | `newInstance(Object... initargs)`  | Uses the constructor to create and initialize a new instance of the class.       | `Object obj = constructor.newInstance(arg1, arg2);`     |
| **Handle Accessibility**| `isAccessible`                     | Returns the value of the accessible flag for this constructor.                   | `boolean isAccessible = constructor.isAccessible();`    |
|                        | `setAccessible(boolean flag)`      | Sets the accessible flag for this constructor.                                   | `constructor.setAccessible(true);`                      |


---

# `java.lang.reflect.Method` Methods

This document provides an overview of the main methods available in the `java.lang.reflect.Method` class, organized by category.[Program link](JavaLangReflectMethod/MethodReflectionExample.java)

| **Category**           | **Method**                         | **Description**                                                                 | **Example**                                                   |
|------------------------|------------------------------------|---------------------------------------------------------------------------------|---------------------------------------------------------------|
| **Get Method Info**    | `getName`                          | Returns the name of the method.                                                 | `String methodName = method.getName();`                        |
|                        | `getDeclaringClass`                | Returns the `Class` object representing the class that declares the method.      | `Class<?> declaringClass = method.getDeclaringClass();`         |
|                        | `getModifiers`                     | Returns the Java language modifiers for the method as an integer.                | `int modifiers = method.getModifiers();`                       |
|                        | `getReturnType`                    | Returns a `Class` object representing the return type of the method.             | `Class<?> returnType = method.getReturnType();`                 |
|                        | `getParameterTypes`                | Returns an array of `Class` objects representing the parameter types of the method.| `Class<?>[] paramTypes = method.getParameterTypes();`         |
|                        | `getExceptionTypes`                | Returns an array of `Class` objects representing the exception types thrown by the method.| `Class<?>[] exceptionTypes = method.getExceptionTypes();`    |
|                        | `isVarArgs`                        | Returns true if this method was declared with a variable number of arguments.    | `boolean isVarArgs = method.isVarArgs();`                       |
| **Invoke Method**      | `invoke(Object obj, Object... args)`| Invokes the underlying method represented by this `Method` object.              | `Object result = method.invoke(instance, arg1, arg2);`         |
| **Handle Accessibility**| `isAccessible`                     | Returns the value of the accessible flag for this method.                        | `boolean isAccessible = method.isAccessible();`                 |
|                        | `setAccessible(boolean flag)`      | Sets the accessible flag for this method.                                        | `method.setAccessible(true);`                                   |
 
---

## Interview questions:

### 1. _getDeclaredMethods() v/s getMethod():_ 
**getMethod**: Retrieves only public methods, including those inherited from superclasses and interfaces.
**getDeclaredMethod** can retrieve public methods as well as private, protected, and package-private methods declared in the class. Unlike getMethod, which only retrieves public methods (including inherited ones), getDeclaredMethod focuses on methods declared specifically within the class, regardless of their access modifiers.

<hr style="border:2px solid cyan">

### 2. _how newInstance is different from Object obj = new Object ();_
### `newInstance()` vs `new Object()`

This document compares the `newInstance()` method from `java.lang.reflect.Constructor` with the regular object creation syntax using `new`.

### `new Object()`

1. **Static Typing**: Creates a new instance of an object with known type at compile-time.

2. **Direct Invocation**: Instantiates classes directly using their constructors.

3. **Compile-Time Checking**: Ensures class existence, accessible constructors, and parameter matching at compile-time.

4. **Type Safety**: `obj` type is known at compile-time, so type casting isn't required.

### `Constructor.newInstance()`

1. **Dynamic Typing**: Creates instances of classes dynamically using reflection, suitable for cases where class types are determined at runtime.

2. **Reflection**: Allows instantiation of classes whose names are known only at runtime.

3. **Exception Handling**: Requires handling `InstantiationException`, `IllegalAccessException`, and `InvocationTargetException` exceptions.

4. **Accessibility**: Can bypass accessibility restrictions using `setAccessible(true)` on the `Constructor` object.

### Comparison Summary

- **Static vs. Dynamic**: `new Object()` is static instantiation known at compile-time, while `newInstance()` is dynamic and determined at runtime.

- **Compile-Time Checking**: `new Object()` is checked at compile-time, `newInstance()` uses reflection and errors can occur at runtime.

- **Flexibility**: `newInstance()` provides flexibility to instantiate classes dynamically, suitable for reflective and dynamic programming needs.

In summary, `new Object()` is straightforward for standard object creation, while `newInstance()` via reflection is powerful for dynamic and flexible instantiation, useful in advanced programming scenarios.

<hr style="border:2px solid cyan">
<H1>Lambda Notes</H1>

In Java, lambda expressions can be categorized based on the type of functional interface they target. Functional
interfaces are interfaces with exactly one abstract method, which can be implemented using lambda expressions. Here are
some common types of lambda expressions based on the functional interfaces they work with:

### Types of Lambda Expressions

| Type           | Description                                                                                            | Example                             |
|----------------|--------------------------------------------------------------------------------------------------------|-------------------------------------|
| Consumer       | Lambda expression that takes an argument and performs some operation without returning any result.     | `(x) -> System.out.println(x)`      |
| Supplier       | Lambda expression that takes no arguments and produces a result.                                       | `() -> Math.random()`               |
| Predicate      | Lambda expression that takes an argument and returns a boolean result based on some condition.         | `(x) -> x > 10`                     |
| Function       | Lambda expression that takes an argument and produces a result.                                        | `(x) -> x * 2`                      |
| UnaryOperator  | Special case of a function where the input and output types are the same.                              | `(x) -> x * x`                      |
| BinaryOperator | Lambda expression that takes two arguments of the same type and produces a result of the same type.    | `(x, y) -> x + y`                   |
| Comparator     | Lambda expression that compares two objects and returns an integer indicating their order.             | `(x, y) -> x.compareTo(y)`          |
| Runnable       | Lambda expression that represents a block of code to be executed, typically used for concurrent tasks. | `() -> System.out.println("Hello")` |

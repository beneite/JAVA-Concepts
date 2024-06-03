# Optional in Java

Java provides the `Optional` class to address the problem of null references and to help avoid `NullPointerException`. `Optional` is a container object which may or may not contain a non-null value. If a value is present, `isPresent()` returns `true` and `get()` returns the value. Otherwise, methods such as `orElse()` and `orElseGet()` help provide a fallback mechanism.
- [GeeksforGeeks article on Java 8 Optional Class](https://www.geeksforgeeks.org/java-8-optional-class/)

## Key Features of `Optional`

### Creation
- **Empty Optional**: `Optional.empty()`
- **Optional with Value**: `Optional.of(value)`
- **Nullable Optional**: `Optional.ofNullable(value)`

### Checking Presence
- **isPresent()**: Returns `true` if there is a value, otherwise `false`.
- **isEmpty()**: Returns `true` if there is no value, otherwise `false` (Java 11+).

### Retrieving Values
- **get()**: Returns the value if present, otherwise throws `NoSuchElementException`.
- **orElse(value)**: Returns the value if present, otherwise returns `value`.
- **orElseGet(Supplier<? extends T> other)**: Returns the value if present, otherwise invokes `other` and returns the result.
- **orElseThrow()**: Returns the value if present, otherwise throws `NoSuchElementException`.
- **orElseThrow(Supplier<? extends X> exceptionSupplier)**: Returns the value if present, otherwise throws an exception provided by `exceptionSupplier`.

### Transforming Values
- **map(Function<? super T, ? extends U> mapper)**: If a value is present, applies the provided mapping function to it, and if the result is non-null, returns an `Optional` describing the result.
- **flatMap(Function<? super T, Optional<U>> mapper)**: If a value is present, applies the provided `Optional`-bearing mapping function to it, returns that result, otherwise returns an empty `Optional`.

### Filtering Values
- **filter(Predicate<? super T> predicate)**: If a value is present and the value matches the given predicate, returns an `Optional` describing the value, otherwise returns an empty `Optional`.

## Example Usage

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> optionalValue = Optional.of("Hello, World!");

        // Creating an Optional with a potentially null value
        String nullableValue = null;
        Optional<String> optionalNullableValue = Optional.ofNullable(nullableValue);

        // Creating an empty Optional
        Optional<String> emptyOptional = Optional.empty();

        // Checking presence and retrieving values
        if (optionalValue.isPresent()) {
            System.out.println("Value is present: " + optionalValue.get());
        } else {
            System.out.println("Value is not present");
        }

        // Using orElse and orElseGet
        String value = optionalNullableValue.orElse("Default Value");
        System.out.println("Value or default: " + value);

        value = optionalNullableValue.orElseGet(() -> "Computed Default Value");
        System.out.println("Value or computed default: " + value);

        // Using orElseThrow
        try {
            value = emptyOptional.orElseThrow(() -> new RuntimeException("No value present"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Transforming values using map and flatMap
        Optional<Integer> length = optionalValue.map(String::length);
        System.out.println("Length of the string: " + length.orElse(0));

        Optional<String> upperCaseValue = optionalValue.flatMap(val -> Optional.of(val.toUpperCase()));
        System.out.println("Uppercase value: " + upperCaseValue.orElse("No value"));

        // Filtering values
        Optional<String> filteredValue = optionalValue.filter(val -> val.startsWith("Hello"));
        System.out.println("Filtered value: " + filteredValue.orElse("No match"));
    }
}

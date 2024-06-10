package dataTypes.Optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
Explanation:

1. **Creating Optional Instances**: Demonstrates creating `Optional` objects using `of`, `ofNullable`, and `empty`.
2. **Checking Presence of a Value**: Uses `isPresent` and `ifPresent` to check and handle the presence of values.
3. **Retrieving the Value**: Shows how to use `orElse`, `orElseGet`, and `orElseThrow` for safe retrieval.
4. **Transforming the Value**: Uses `map` and `flatMap` to transform the contained value.
5. **Filtering the Value**: Demonstrates filtering the `Optional` value.
6. **Combining Optionals**: Chains multiple `Optional` operations together.
7. **Using Optional with Streams**: Integrates `Optional` with Java Streams.
8. **Method Returning Optional**: Example method that returns an `Optional`.
9. **Method Using Optional as a Parameter**: Example method that accepts an `Optional` as a parameter.
10. **Demonstrating All Operations Together**: Combines multiple `Optional` operations in a single sequence.

This program provides a comprehensive demonstration of how to effectively use `Optional` in Java, covering creation, checking, retrieval, transformation, filtering, combination, and integration with methods and streams.
*/

public class OptinalSampleProgram {
    public static void main(String[] args) {
        // Creating Optional instances
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nonEmptyOptional = Optional.of("Hello, World!");
        Optional<String> nullableOptional = Optional.ofNullable(null);
        Optional<String> anotherNullableOptional = Optional.ofNullable("Hello, World!");

        // Checking presence of a value
        if (nonEmptyOptional.isPresent()) {
            System.out.println("nonEmptyOptional contains: " + nonEmptyOptional.get());
        }

        nonEmptyOptional.ifPresent(value -> System.out.println("Value in nonEmptyOptional: " + value));

        // Retrieving the value
        String value1 = nullableOptional.orElse("Default Value");
        System.out.println("Value from nullableOptional with orElse: " + value1);

        String value2 = nullableOptional.orElseGet(() -> "Default Value");
        System.out.println("Value from nullableOptional with orElseGet: " + value2);

        try {
            String value3 = nullableOptional.orElseThrow(() -> new IllegalArgumentException("Value is missing"));
            System.out.println("Value from nullableOptional with orElseThrow: " + value3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Transforming the value
        Optional<Integer> lengthOptional = nonEmptyOptional.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Length of nonEmptyOptional value: " + length));

        Optional<String> upperCaseOptional = nonEmptyOptional.flatMap(value -> Optional.of(value.toUpperCase()));
        upperCaseOptional.ifPresent(value -> System.out.println("Uppercase value: " + value));

        // Filtering the value
        Optional<String> filteredOptional = nonEmptyOptional.filter(value -> value.startsWith("Hello"));
        filteredOptional.ifPresent(value -> System.out.println("Filtered value: " + value));

        // Combining Optionals
        Optional<String> combinedOptional = nonEmptyOptional
                .filter(value -> value.length() > 5)
                .map(String::toUpperCase);
        combinedOptional.ifPresent(value -> System.out.println("Combined value: " + value));

        // Using Optional with Streams
        List<Optional<String>> list = Arrays.asList(Optional.of("one"), Optional.empty(), Optional.of("three"));
        List<String> filteredList = list.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        System.out.println("Filtered list from Optionals in Stream: " + filteredList);

        // Method returning Optional
        Optional<String> nameOptional = findNameById(1);
        nameOptional.ifPresent(name -> System.out.println("Name found by ID: " + name));

        // Method using Optional as a parameter
        printName(nameOptional);

        // Demonstrating all operations together
        String combinedOperationResult = nullableOptional
                .orElse("default")
                .toUpperCase();
        System.out.println("Combined operation result: " + combinedOperationResult);
    }

    // Method returning Optional
    public static Optional<String> findNameById(int id) {
        if (id == 1) {
            return Optional.of("John Doe");
        }
        return Optional.empty();
    }

    // Method using Optional as a parameter
    public static void printName(Optional<String> nameOptional) {
        nameOptional.ifPresent(name -> System.out.println("Printed name: " + name));
    }
}

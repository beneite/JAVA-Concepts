<H1>Java8 Streams Notes</H1>

### Intermediate Operations:

| Operation            | Description                                                                                                      | Input Data Type | Example                                                     |
|----------------------|------------------------------------------------------------------------------------------------------------------|-----------------|-------------------------------------------------------------|
| `filter(Predicate)`  | Filters elements of the stream based on the given predicate                                                      | Predicate       | `stream.filter(x -> x > 5)`                                 |
| `map(Function)`      | Transforms each element in the stream using the provided function                                                | Function        | `stream.map(x -> x * 2)`                                    |
| `flatMap(Function)`  | Transforms each element in the stream into a stream of elements and then flattens them into a single stream      | Function        | `stream.flatMap(line -> Arrays.stream(line.split("\\s+")))` |
| `distinct()`         | Removes duplicate elements from the stream                                                                       | Any             | `stream.distinct()`                                         |
| `sorted()`           | Sorts the elements of the stream in natural order                                                                | Comparable      | `stream.sorted()`                                           |
| `sorted(Comparator)` | Sorts the elements of the stream using the provided comparator                                                   | Comparator      | `stream.sorted(Comparator.reverseOrder())`                  |
| `limit(long)`        | Truncates the stream to a maximum size of `n` elements                                                           | Any             | `stream.limit(10)`                                          |
| `skip(long)`         | Skips the first `n` elements of the stream                                                                       | Any             | `stream.skip(5)`                                            |
| `peek(Consumer)`     | Performs a side-effect for each element of the stream without changing its contents                              | Consumer        | `stream.peek(System.out::println)`                          |
| `parallel()`         | Indicates that subsequent operations should be executed in parallel                                              | Any             | `stream.parallel()`                                         |
| `sequential()`       | Indicates that subsequent operations should be executed sequentially, overriding parallel mode if set previously | Any             | `stream.sequential()`                                       |

### Terminal Operations:

| Operation                | Description                                                                            | Input Data Type | Example                                                         |
|--------------------------|----------------------------------------------------------------------------------------|-----------------|-----------------------------------------------------------------|
| `forEach(Consumer)`      | Performs an action for each element of the stream                                      | Consumer        | `stream.forEach(System.out::println)`                           |
| `collect(Collector)`     | Performs a mutable reduction operation on the elements of the stream using a collector | Collector       | `List<Integer> list = stream.collect(Collectors.toList())`      |
| `toArray()`              | Converts the elements of the stream into an array                                      | Any             | `Object[] arr = stream.toArray()`                               |
| `reduce(BinaryOperator)` | Performs a reduction on the elements of the stream using the provided binary operator  | BinaryOperator  | `Optional<Integer> sum = stream.reduce(Integer::sum)`           |
| `min(Comparator)`        | Finds the minimum element in the stream according to the provided comparator           | Comparator      | `Optional<Integer> min = stream.min(Comparator.naturalOrder())` |
| `max(Comparator)`        | Finds the maximum element in the stream according to the provided comparator           | Comparator      | `Optional<Integer> max = stream.max(Comparator.reverseOrder())` |
| `count()`                | Returns the count of elements in the stream as a `long`                                | Any             | `long count = stream.count()`                                   |
| `anyMatch(Predicate)`    | Checks if any element of the stream matches the given predicate                        | Predicate       | `boolean anyMatch = stream.anyMatch(x -> x > 5)`                |
| `allMatch(Predicate)`    | Checks if all elements of the stream match the given predicate                         | Predicate       | `boolean allMatch = stream.allMatch(x -> x > 5)`                |
| `noneMatch(Predicate)`   | Checks if none of the elements of the stream match the given predicate                 | Predicate       | `boolean noneMatch = stream.noneMatch(x -> x > 5)`              |
| `findAny()`              | Returns an arbitrary element of the stream (if present)                                | Any             | `Optional<Integer> any = stream.findAny()`                      |
| `findFirst()`            | Returns the first element of the stream (if any)                                       | Any             | `Optional<Integer> first = stream.findFirst()`                  |

> [!IMPORTANT] 
> Points To remember

## Java Streams - Key Points and Best Practices
## 1. Streams Are Not Reusable

- **Once Consumed, Cannot Be Reused**: Streams can be used only once. Once a terminal operation is performed, the stream is considered consumed and cannot be reused. Create a new stream for each sequence of operations.

    ```java
    List<String> myList = Arrays.asList("a", "b", "c");
    Stream<String> stream = myList.stream();
    stream.forEach(System.out::println); // Consumes the stream
    stream.collect(Collectors.toList()); // IllegalStateException
    ```

## 2. Lazy Evaluation

- **Intermediate Operations Are Lazy**: Intermediate operations (e.g., `map`, `filter`) are not executed until a terminal operation (e.g., `collect`, `forEach`) is invoked. This allows for optimized processing and the possibility of short-circuiting.

    ```java
    List<String> myList = Arrays.asList("a", "b", "c");
    myList.stream()
          .filter(s -> {
              System.out.println("filtering: " + s);
              return s.startsWith("a");
          })
          .map(s -> {
              System.out.println("mapping: " + s);
              return s.toUpperCase();
          });
    // No output because no terminal operation is invoked
    ```

## 3. Stateless and Stateful Intermediate Operations

- **Avoid Stateful Intermediate Operations**: Use stateless intermediate operations (e.g., `map`, `filter`) instead of stateful ones (e.g., `distinct`, `sorted`), especially in parallel streams, to avoid performance issues and unpredictable results.

    ```java
    Stream.of("a", "b", "c", "a").distinct(); // Stateful
    ```

## 4. Parallel Streams

- **Use Parallel Streams Judiciously**: Parallel streams can improve performance for CPU-intensive operations on large data sets, but they introduce overhead and potential thread-safety issues. Measure performance and ensure thread safety.

    ```java
    myList.parallelStream().forEach(System.out::println);
    ```

## 5. Side Effects

- **Avoid Side Effects in Stream Operations**: Stream operations should be free of side effects. Use `forEach` for actions with side effects and prefer immutable data structures or thread-safe mechanisms when dealing with shared state.

    ```java
    // Avoid modifying external state in intermediate operations
    List<String> results = new ArrayList<>();
    myList.stream().map(s -> {
        results.add(s); // Side effect, not recommended
        return s.toUpperCase();
    });
    ```

## 6. Order and Stability

- **Consider Order and Stability**: Streams have inherent ordering (e.g., lists, sorted sets). Ensure operations that depend on order (e.g., `forEachOrdered`, `sorted`) maintain the desired order.

    ```java
    Stream.of("a", "b", "c").forEachOrdered(System.out::println); // Ordered
    ```

## 7. Stream Pipeline Structure

- **Pipeline Structure Matters**: Structure the stream pipeline to optimize performance. Place operations that reduce the number of elements (e.g., `filter`) before operations that process each element (e.g., `map`).

    ```java
    myList.stream()
          .filter(s -> s.startsWith("a")) // Reduces elements
          .map(String::toUpperCase) // Processes remaining elements
          .collect(Collectors.toList());
    ```

## 8. Stream Sources

- **Choose Appropriate Stream Sources**: Streams can be created from various sources (collections, arrays, generators). Ensure the source is appropriate for the intended operations and performance requirements.

    ```java
    Stream<String> stream = Stream.of("a", "b", "c"); // Stream from values
    ```

## 9. Closing Streams

- **Close Resources**: Ensure that streams that wrap IO resources (e.g., files) are closed properly. Use try-with-resources to manage resources automatically.

    ```java
    try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
        lines.forEach(System.out::println);
    } catch (IOException e) {
        e.printStackTrace();
    }
    ```

## 10. Terminal Operations

- **Understand Terminal Operations**: Terminal operations trigger the processing of the stream and produce a result or side effect. Common terminal operations include `collect`, `forEach`, `reduce`, `count`, and `findAny`.

    ```java
    long count = myList.stream().filter(s -> s.startsWith("a")).count();
    ```

## Summary

By keeping these points in mind, you can effectively leverage the Stream API in Java 8 to write clean, efficient, and maintainable code. Properly structuring stream operations, being mindful of performance considerations, and avoiding common pitfalls will help you make the most out of this powerful feature.

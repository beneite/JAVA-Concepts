### Intermediate Operations:

| Operation                   | Description                                                                                       |
|-----------------------------|---------------------------------------------------------------------------------------------------|
| `filter(Predicate)`         | Filters the stream based on the given predicate.                                                  |
| `map(Function)`             | Transforms each element in the stream using the provided function.                                 |
| `flatMap(Function)`         | Transforms each element in the stream into a stream of elements and then flattens these streams into a single stream. |
| `distinct()`                | Removes duplicate elements from the stream.                                                        |
| `sorted()`                  | Sorts the elements of the stream in natural order.                                                 |
| `sorted(Comparator)`        | Sorts the elements of the stream using the provided comparator.                                    |
| `limit(long)`               | Truncates the stream to a maximum size of `n` elements.                                            |
| `skip(long)`                | Skips the first `n` elements of the stream.                                                        |
| `peek(Consumer)`            | Performs a side-effect for each element of the stream without changing its contents.                |
| `parallel()`                | Indicates that subsequent operations should be executed in parallel.                                |
| `sequential()`              | Indicates that subsequent operations should be executed sequentially, overriding parallel mode if set previously. |

### Terminal Operations:

| Operation                   | Description                                                                                       |
|-----------------------------|---------------------------------------------------------------------------------------------------|
| `forEach(Consumer)`         | Performs an action for each element of the stream.                                                 |
| `collect(Collector)`        | Performs a mutable reduction operation on the elements of the stream using a collector.            |
| `toArray()`                 | Converts the elements of the stream into an array.                                                 |
| `reduce(BinaryOperator)`    | Performs a reduction on the elements of the stream using the provided binary operator.              |
| `min(Comparator)`           | Finds the minimum element in the stream according to the provided comparator.                      |
| `max(Comparator)`           | Finds the maximum element in the stream according to the provided comparator.                      |
| `count()`                   | Returns the count of elements in the stream as a `long`.                                            |
| `anyMatch(Predicate)`       | Checks if any element of the stream matches the given predicate.                                   |
| `allMatch(Predicate)`       | Checks if all elements of the stream match the given predicate.                                     |
| `noneMatch(Predicate)`      | Checks if none of the elements of the stream match the given predicate.                             |
| `findAny()`                 | Returns an arbitrary element of the stream (if present).                                            |
| `findFirst()`               | Returns the first element of the stream (if any).                                                   |

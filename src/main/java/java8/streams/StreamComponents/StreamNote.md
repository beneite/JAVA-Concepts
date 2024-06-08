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

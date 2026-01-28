# 🧭 The `Map` Interface

`Map<K, V>` is part of the **Java Collections Framework** and represents a collection of **key-value pairs**, where:

* Keys are **unique**
* Each key maps to at most **one value**

All classes implementing `Map` have the same basic behavior, but they **differ in ordering, synchronization, performance, and null handling**.

---

## 🟩 1️⃣ **HashMap**

📦 `java.util.HashMap`

**Most commonly used Map implementation.**

* Stores entries in a **hash table**
* **No order** of keys or values
* **Allows one `null` key** and multiple `null` values
* **Not thread-safe**

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "A");
map.put(null, "B");
map.put(2, null);
```

✅ **Use when:**

* You just need fast lookups (`O(1)` average)
* Order doesn’t matter

---

## 🟦 2️⃣ **LinkedHashMap**

📦 `java.util.LinkedHashMap`

**Maintains insertion order.**

* Extends `HashMap`
* Keeps a **doubly linked list** of entries
* **Iteration order = insertion order**
* Allows **one null key**
* Slightly slower than `HashMap`

```java
Map<Integer, String> map = new LinkedHashMap<>();
map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map); // {3=C, 1=A, 2=B} → same order as inserted
```

✅ **Use when:**

* You need predictable iteration order (e.g., LRU cache)
* You want `HashMap` speed + ordering

---

## 🟨 3️⃣ **TreeMap**

📦 `java.util.TreeMap`

**Sorted map** (uses **Red-Black tree**).

* Keys are **sorted** (natural order or custom `Comparator`)
* **No null keys** allowed (throws `NullPointerException`)
* Values can be `null`
* Performance: `O(log n)` for most operations

```java
Map<Integer, String> map = new TreeMap<>();
map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map); // {1=A, 2=B, 3=C}
```

✅ **Use when:**

* You need **sorted keys**
* You want **range-based operations** (e.g., `headMap()`, `tailMap()`)

---

## 🟧 4️⃣ **Hashtable**

📦 `java.util.Hashtable`

**Legacy** (pre-Java 1.2).

* **Thread-safe** (synchronized)
* **No null keys or values**
* Slower than `HashMap`
* Generally replaced by `ConcurrentHashMap`

```java
Map<Integer, String> map = new Hashtable<>();
map.put(1, "A");
map.put(2, "B");
// map.put(null, "C"); // ❌ NullPointerException
```

✅ **Use when:**

* You’re maintaining legacy code
* (Otherwise, prefer `ConcurrentHashMap`)

---

## 🟪 5️⃣ **ConcurrentHashMap**

📦 `java.util.concurrent.ConcurrentHashMap`

**Thread-safe and fast.**

* Divides map into segments for **concurrent access**
* **No null keys or values**
* High performance in multi-threaded environments

```java
Map<Integer, String> map = new ConcurrentHashMap<>();
map.put(1, "A");
map.put(2, "B");
```

✅ **Use when:**

* You need thread-safe operations **without blocking**
* You’re working in **concurrent environments**

---

## ⚪ 6️⃣ **WeakHashMap**

📦 `java.util.WeakHashMap`

* Uses **weak references** for keys
* If a key is no longer referenced elsewhere, the entry is **garbage collected**
* Useful for **caching** where you don’t want to prevent GC

```java
Map<Object, String> map = new WeakHashMap<>();
Object key = new Object();
map.put(key, "value");
key = null; // eligible for GC → entry will be removed eventually
```

✅ **Use when:**

* You want entries to disappear automatically when keys are no longer in use

---

## ⚫ 7️⃣ **IdentityHashMap**

📦 `java.util.IdentityHashMap`

* Compares keys using **`==`** (reference equality), not `.equals()`
* Allows **null keys and values**
* Usually used in **frameworks** or **serialization**

```java
Map<String, String> map = new IdentityHashMap<>();
map.put(new String("A"), "1");
map.put(new String("A"), "2");

System.out.println(map.size()); // 2 because keys are different references
```

✅ **Use when:**

* You need reference-based equality (not logical equality)

---

## 🟫 8️⃣ **EnumMap**

📦 `java.util.EnumMap`

* Optimized `Map` for **enum keys**
* Internally uses an array (very fast)
* Keys must all come from a single enum type
* **No null keys**

```java
enum Day { MON, TUE, WED }

Map<Day, String> map = new EnumMap<>(Day.class);
map.put(Day.MON, "Work");
map.put(Day.TUE, "Study");

System.out.println(map); // {MON=Work, TUE=Study}
```

✅ **Use when:**

* Keys are enums — this is the **fastest possible Map**

---

## 🧠 Summary Table

| Class                 | Ordered                | Sorted | Thread-Safe | Null Keys | Typical Use Case                   |
| --------------------- | ---------------------- | ------ | ----------- | --------- | ---------------------------------- |
| **HashMap**           | ❌                      | ❌      | ❌           | ✅         | General-purpose map                |
| **LinkedHashMap**     | ✅ (insertion)          | ❌      | ❌           | ✅         | Predictable iteration order        |
| **TreeMap**           | ✅ (sorted)             | ✅      | ❌           | ❌         | Sorted keys                        |
| **Hashtable**         | ❌                      | ❌      | ✅           | ❌         | Legacy, synchronized map           |
| **ConcurrentHashMap** | ❌                      | ❌      | ✅           | ❌         | High-performance concurrent access |
| **WeakHashMap**       | ❌                      | ❌      | ❌           | ✅         | Auto-removing cache entries        |
| **IdentityHashMap**   | ❌                      | ❌      | ❌           | ✅         | Reference-based equality           |
| **EnumMap**           | ✅ (natural enum order) | ✅      | ❌           | ❌         | Enum keys (fastest map)            |

---
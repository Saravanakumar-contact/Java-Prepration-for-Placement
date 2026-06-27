# Stage 1 Day 8 — Time & Space Complexity Practice (Java)

## Overview

Today I learned Time Complexity and Space Complexity in Java.

Complexity helps measure:

* How fast an algorithm runs
* How much memory it uses
* Which solution is better for large input

---

# Time Complexity

Time complexity measures how the number of operations grows as input size (`n`) increases.

## Common Complexities

| Complexity | Meaning      |
| ---------- | ------------ |
| O(1)       | Constant     |
| O(log n)   | Logarithmic  |
| O(n)       | Linear       |
| O(n log n) | Linearithmic |
| O(n²)      | Quadratic    |
| O(n³)      | Cubic        |

---

# Space Complexity

Space complexity measures extra memory used by a program.

Example:

```java
int a = 5;
```

Space Complexity = O(1)

Example:

```java
int arr[] = new int[n];
```

Space Complexity = O(n)

---

# Important Rules

## Rule 1: Constant Loop

If loop limit is fixed:

```java
for(int i=0;i<10;i++)
```

Complexity:

```text
O(1)
```

---

## Rule 2: Single Loop

```java
for(int i=0;i<n;i++)
```

Complexity:

```text
O(n)
```

---

## Rule 3: Nested Loops

```java
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    }
}
```

Complexity:

```text
O(n²)
```

---

## Rule 4: Doubling / Halving

```java
for(int i=1;i<n;i*=2)
```

or

```java
for(int i=n;i>0;i/=2)
```

Complexity:

```text
O(log n)
```

---

## Rule 5: Separate Loops = Add

```java
for(int i=0;i<n;i++){}
for(int j=0;j<n*n;j++){}
```

Complexity:

```text
O(n + n²)
```

Final Answer:

```text
O(n²)
```

(Dominant term only)

---

## Rule 6: Nested Loops = Multiply

Example:

Outer loop = O(n)

Inner loop = O(log n)

Final:

```text
O(n log n)
```

---

# Practice Problems

---

## Problem 1

```java
for(int i=0;i<n;i++){
    System.out.println(i);
}
```

Answer:

```text
O(n)
```

---

## Problem 2

```java
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.println(i+j);
    }
}
```

Answer:

```text
O(n²)
```

---

## Problem 3

```java
for(int i=1;i<n;i*=2){
    System.out.println(i);
}
```

Answer:

```text
O(log n)
```

---

## Problem 4

```java
int x = arr[5];
```

Answer:

```text
O(1)
```

Array access is constant.

---

## Problem 5

```java
for(int i=0;i<n;i++){
    for(int j=0;j<5;j++){
        System.out.println(i+j);
    }
}
```

Answer:

```text
O(n)
```

Because 5 is constant.

---

## Problem 6

```java
for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
        System.out.println(j);
    }
}
```

Answer:

```text
O(n²)
```

---

## Problem 7

```java
for(int i=n;i>0;i/=2){
    System.out.println(i);
}
```

Answer:

```text
O(log n)
```

---

## Problem 8

```java
int sum = 0;
for(int i=0;i<n;i++){
    sum += arr[i];
}
```

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(1)
```

---

## Problem 9

```java
for(int i=0;i<n;i++){
    for(int j=1;j<n;j*=2){
        System.out.println(i+j);
    }
}
```

Answer:

```text
O(n log n)
```

---

## Problem 10

```java
for(int i=1;i<n;i*=2){
    for(int j=1;j<n;j*=2){
        System.out.println(i+j);
    }
}
```

Answer:

```text
O((log n)²)
```

---

## Advanced Problems

### Problem 11

```java
for(int i=0;i<n*n;i++){
    System.out.println(i);
}
```

Answer:

```text
O(n²)
```

---

### Problem 12

```java
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        for(int k=0;k<5;k++){
            System.out.println(k);
        }
    }
}
```

Answer:

```text
O(n²)
```

Because 5 is constant.

---

### Problem 13

```java
for(int i=1;i<n;i*=2){
    for(int j=0;j<n;j++){
        System.out.println(i+j);
    }
}
```

Answer:

```text
O(n log n)
```

---

### Problem 14

```java
for(int i=n;i>0;i/=2){
    for(int j=0;j<n;j++){
        System.out.println(j);
    }
}
```

Answer:

```text
O(n log n)
```

---

### Problem 15

```java
for(int i=0;i<n*n;i++){
    for(int j=1;j<n;j*=2){
        System.out.println(i+j);
    }
}
```

Answer:

```text
O(n² log n)
```

---

# Common Mistakes I Made Today

* Confused constant loop with O(n)
* Forgot separate loops should be added
* Missed dominant term
* Mistook n² loops as log n

---

# Final Shortcut Sheet

| Pattern        | Complexity |
| -------------- | ---------- |
| No loop        | O(1)       |
| One loop       | O(n)       |
| Nested loops   | Multiply   |
| Separate loops | Add        |
| i*=2           | O(log n)   |
| i/=2           | O(log n)   |
| n*n loop       | O(n²)      |

---

# Final Learning Summary

Today I understood:

* Big-O notation
* Time Complexity
* Space Complexity
* Constant vs linear vs logarithmic growth
* Nested vs separate loops
* Dominant term selection

Stage 1 Day 8 Completed.

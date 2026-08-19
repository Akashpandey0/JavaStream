# Java Stream API - Scenario Based Questions

---

## 🔢 Basics

### CountElements.java
**Scenario:** You have a list of integers `[1, 2, 3, 4, 5, 6, 7, 8, 9]`. Using Java Streams, find the total number of elements in the list.

**Key API:** `stream().count()`

---

### MaxAndMin.java
**Scenario:** Given a list of integers, find the maximum and minimum values using Java Streams without using any loops.

**Key API:** `stream().max(Integer::compare)`, `stream().min(Integer::compare)`

---

### SumOfNumbers.java
**Scenario:** You are given a list of integers from 1 to 10. Calculate the sum using two different stream approaches — one using `mapToInt().sum()` and another using `reduce()`.

**Key API:** `mapToInt().sum()`, `reduce(0, (a, b) -> a + b)`

---

### PrintNaturalNumber.java
**Scenario:** Generate and print the first 10 natural numbers using an infinite stream without manually creating a list.

**Key API:** `Stream.iterate()`, `limit()`, `forEach()`

---

### ProductOfNumbers.java
**Scenario:** Given a list `[1, 2, 3, 4]`, compute the product of all elements using `reduce()` in a stream.

**Key API:** `reduce(1, (a, b) -> a * b)`

---

## 📝 String Operations

### StringLength.java
**Scenario:** You have a list of fruit names. Group them by their character length and display which words share the same length.

**Key API:** `Collectors.groupingBy(String::length)`

---

### StringToUppercase.java
**Scenario:** Convert a given string `"hello world"` to uppercase using Java Streams by processing each character individually.

**Key API:** `str.chars()`, `mapToObj()`, `Character::toUpperCase`

---

### ReverseString.java
**Scenario:** Given a full name like `"Akash Pandey"`, reverse each word individually while keeping the word order intact, using streams.

**Key API:** `Arrays.stream()`, `map()`, `StringBuilder.reverse()`, `Collectors.joining()`

---

### FirstNonRepeating.java
**Scenario:** Given a string `"1122334455136"`, find the first character that appears only once, while preserving the original order of characters.

**Key API:** `Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())`, `findFirst()`

---

### NonRepeating.java
**Scenario:** Given a string `"akashpandey"`, find all characters that appear exactly once and return them as a list, maintaining insertion order.

**Key API:** `LinkedHashMap`, `Collectors.groupingBy()`, `filter(entry -> entry.getValue() == 1)`

---

### SecondNonRepeating.java
**Scenario:** From the string `"akashpandey"`, find the second character that appears only once (i.e., skip the first non-repeating character).

**Key API:** `skip(1)`, `findFirst()`

---

### CompressString.java
**Scenario:** Given a string `"aabcccccaaa"`, compress it by replacing consecutive repeated characters with the character followed by its count (e.g., `a2b1c5a3`). If the compressed string is not smaller, return the original.

**Key Concept:** Run-length encoding, character frequency counting

---

### PallindromeStream.java
**Scenario:** From a list of words `["Level", "noon", "racecar", "java", "hello", "madam"]`, filter out only the palindromes using streams (case-insensitive check).

**Key API:** `filter()`, `equalsIgnoreCase()`, `StringBuilder.reverse()`

---

### SmallestWord.java
**Scenario:** Given a sentence `"I am a good boy in a school"`, find the shortest word using streams.

**Key API:** `Arrays.stream(str.split(" "))`, `min(Comparator.comparingInt(String::length))`

---

### NameEndsWithE.java
**Scenario:** From an array of names `["Alice", "Bob", "Charlie"]`, print only the names that end with the letter `'e'` using streams.

**Key API:** `Arrays.stream()`, `filter(name -> name.endsWith("e"))`

---

### SecondHighestWord.java
**Scenario:** Given a string `"hello hello hello world world"`, find the word with the second highest frequency using streams.

**Key API:** `Collectors.groupingBy(Function.identity(), Collectors.counting())`, `sorted()`, `skip(1)`, `findFirst()`

---

## 🔢 Number Problems

### OddEven.java
**Scenario:** Given a list of numbers from 1 to 10, separate them into odd and even groups. Implement this using three approaches: `filter()`, `partitioningBy()`, and `groupingBy()`.

**Key API:** `Collectors.partitioningBy()`, `Collectors.groupingBy()`

---

### PrimeNonPrime.java
**Scenario:** Given a list of integers from 1 to 10, partition them into prime and non-prime numbers using streams.

**Key API:** `Collectors.partitioningBy()`, `IntStream.rangeClosed().allMatch()`

---

### SquaresOfEven.java
**Scenario:** From a list of numbers 1 to 10, filter out the even numbers and return a list of their squares using streams.

**Key API:** `filter(n -> n % 2 == 0)`, `map(n -> n * n)`

---

### UniquePairs.java
**Scenario:** Given a list of integers and a target sum of 10, find all unique pairs of numbers that add up to the target. Implement using at least two approaches: streams with `flatMap()` and the two-pointer technique.

**Key API:** `flatMap()`, `filter()`, `IntStream.range()`, Two-pointer, HashSet complement

---

### SecondMax.java
**Scenario:** Given a list `[10, 50, 40, 20, 50, 30]`, find the second largest number using streams. Handle duplicates by using `distinct()`.

**Key API:** `distinct()`, `sorted(Comparator.reverseOrder())`, `skip(1)`, `findFirst()`

---

### MissingElement.java
**Scenario:** You are given an array `[1, 2, 4, 3, 5]` that should contain consecutive integers starting from 1. Find the missing number using the sum formula and streams.

**Key API:** `Arrays.stream(arr).max()`, `Arrays.stream(arr).sum()`

---

### FindFirstMissingPositive.java
**Scenario:** Given an unsorted array containing both positive and negative integers `[2, 3, 1, -1, 4, -2]`, find the smallest missing positive integer. The solution should run in O(n) time.

**Key Concept:** Index-based placement (cyclic sort)

---

### SingleElement.java
**Scenario:** In an array where every element appears twice except one, find the element that appears only once. Use XOR via streams.

**Key API:** `Arrays.stream(arr).boxed().reduce(0, (a, b) -> a ^ b)`

---

### GCD.java
**Scenario:** Given two integers, compute their GCD (Greatest Common Divisor) using streams and the Euclidean algorithm via `reduce()`.

**Key API:** `Arrays.stream(new int[]{a, b}).reduce(GCD::gcd)`

---

### ProductExceptSelf.java
**Scenario:** Given an array `[1, 2, 3, 4]`, return a new array where each element is the product of all other elements except itself, without using division.

**Key Concept:** Left and right prefix product arrays

---

## 👥 Employee / Object Scenarios

### GroupAndPartitionOfEmployee.java
**Scenario:** You have a list of employees with name, department, and salary. 
1. Group employees by their department.
2. Partition employees into two groups: those earning more than 100,000 and those earning 100,000 or less.

**Key API:** `Collectors.groupingBy()`, `Collectors.partitioningBy()`

---

### IncreaseSalary.java
**Scenario:** You have a list of employees with their current salaries. Apply a 10% salary hike to all employees using streams and return a new list without modifying the original.

**Key API:** `map(e -> new Employee(e.getName(), e.getSalary() * 1.10))`

---

### SecondHighestSalary.java
**Scenario:** Given a list of employees, find the second highest salary. Handle cases where multiple employees may share the same salary using `distinct()`.

**Key API:** `map(Employee::getSalary)`, `distinct()`, `sorted(Comparator.reverseOrder())`, `skip(1)`, `findFirst()`

---

### TopHighestScore.java
**Scenario:** You have a list of students with their exam scores. Find the top 3 students by score using streams.

**Key API:** `sorted(Comparator.comparing(Student::getScore).reversed())`, `limit(3)`

---

### CustomerSorting.java
**Scenario:** You have a list of customers with id, name, and order value. Sort the customers by their ID in ascending order using streams.

**Key API:** `sorted(Comparator.comparingInt(Customer::getId))`

---

### EmployeeFilter.java
**Scenario:** Given a list of employee names (with duplicates and mixed cases like `["Raj", "Amit", "John", "Sam", "Michael", "raj", "Amit", "JOHN"]`), filter names longer than 3 characters, normalize to title case, remove duplicates, and report how many names were removed.

**Key API:** `filter()`, `map(String::toLowerCase)`, `distinct()`

---

## 🔍 Duplicate & Frequency

### FindDuplicatesUsingStream.java
**Scenario:** Given a list `[4, 1, 1, 2, 4, 5, 5, 6, 7, 6]`, find all duplicate elements using three approaches: `indexOf/lastIndexOf`, `groupingBy + counting`, and a `HashSet`.

**Key API:** `Collectors.groupingBy(Function.identity(), Collectors.counting())`, `filter(e -> e.getValue() > 1)`

---

### RemoveDuplicateElements.java
**Scenario:** From a list `[1, 2, 3, 4, 5, 1, 2, 3, 4, 6]`, remove all elements that appear more than once and keep only the truly unique elements.

**Key API:** `Collectors.groupingBy()`, `Collectors.counting()`, `filter(e -> e.getValue() == 1)`

---

### Frequency1.java
**Scenario:** Given an integer array `[1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1]`, count the frequency of each element using a frequency array. Use streams to find the max element.

**Key API:** `Arrays.stream(arr).max().getAsInt()`

---

### FrequencyUsingHashMap.java
**Scenario:** Count the frequency of each element in an integer array using a HashMap. Iterate over the results using both `forEach` and `entrySet()`.

**Key Concept:** `getOrDefault()`, `entrySet()` iteration

---

## 🔤 Anagram & Cipher

### Anagram.java
**Scenario:** Given two strings `"listen"` and `"silent"`, determine if they are anagrams of each other using a character frequency array approach.

**Key Concept:** Character frequency counting with `char - 97` indexing

---

### AnagramChecker.java
**Scenario:** Check if two user-input strings are anagrams using streams. Sort the characters of each string and compare.

**Key API:** `str.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining())`

---

### GroupAnagrams.java
**Scenario:** Given an array of strings `["eat", "tea", "tan", "ate", "nat", "bat", "plus", "tab"]`, group all anagrams together into sublists.

**Key Concept:** Sort each word's characters as a key in a HashMap

---

### CharacterShifting.java
**Scenario:** Given a string `"Hello World"`, shift each character in a word by `(word.length - 1 - index)` positions forward in the alphabet (wrapping around). Prepend the word length to each encoded word.

**Key Concept:** Caesar cipher variant with position-based shifting

---

### CharacterShiftingStream.java
**Scenario:** Implement the same character shifting logic as above but using Java Streams with `Arrays.stream()` and `map()`.

**Key API:** `Arrays.stream(str.split(" "))`, `map()`, `Collectors.joining(" ")`

---

### ReverseCascadeEncoder.java
**Scenario:** Given a multi-word string (letters only), reverse each word and then apply a cascade shift (shift each character by its index in the reversed word). Append the word length at the end of each encoded word. Validate that input contains only letters and spaces.

**Key Concept:** Input validation with regex, reverse + Caesar cipher

---

### ZigZagWordCipher.java
**Scenario:** Given a string like `"Alpha Bravo"`, encode it by shifting even-indexed characters forward by 1 and odd-indexed characters backward by 1 in the alphabet. Prepend a word counter to each word.

**Key Concept:** ZigZag positional cipher, modular arithmetic

---

## 🔄 Array Manipulation

### MoveZeroToTheEnd.java
**Scenario:** Given an array `[1, 0, 8, 0, 3, 0, 7, 0, 5]`, move all zeros to the end while maintaining the relative order of non-zero elements. Do this in-place.

**Key Concept:** Two-pointer / index tracking in-place rearrangement

---

### RemoveAdjacentDuplicates.java
**Scenario:** Given a string `"abbccddeeeedcba"`, repeatedly remove adjacent duplicate characters (like a stack-based approach) until no adjacent duplicates remain.

**Key Concept:** Stack simulation using `StringBuilder`

---

### RemoveAllCommon.java
**Scenario:** Given two strings `"programming"` and `"computer"`, remove all characters from the second string that appear in the first string. Implement using both a `HashSet` and brute force.

**Key Concept:** Set-based character filtering

---

### RotatedString.java
**Scenario:** Given two strings `"abcde"` and `"deabc"`, check if the second string is a rotation of the first by using string concatenation and `contains()`.

**Key Concept:** `str1 + str1` contains `str2` if rotated

---

## ⛵ Algorithm Challenges

### BoatEscape.java
**Scenario:** You have an array of people's weights and a boat with a weight limit. Each boat can carry at most 2 people. Find the minimum number of boats needed to rescue everyone.

**Key Concept:** Two-pointer on sorted array

---

## 🎨 Pattern Printing

### Pattern1.java
**Scenario:** Print a right-angle triangle of `*` with 5 rows using `IntStream`.
```
*
**
***
****
*****
```
**Key API:** `IntStream.rangeClosed(1, 5)`, `"*".repeat(i)`

---

### Pattern2.java
**Scenario:** Print a left-aligned right-angle triangle (mirrored) using `IntStream`.
```
    *
   **
  ***
 ****
*****
```
**Key API:** `" ".repeat(5 - i)`, `"*".repeat(i)`

---

### Pattern3.java
**Scenario:** Print a twin triangle (two triangles growing outward from center) using `IntStream`.
```
*         *
**       **
***     ***
****   ****
***** *****
```
**Key API:** `"*".repeat(i)`, `" ".repeat(2 * (5 - i) + 1)`

---

### Pattern4.java
**Scenario:** Print a butterfly pattern using two `IntStream` loops — one expanding and one contracting.

**Key API:** Two `IntStream.rangeClosed()` calls

---

### Pattern5.java
**Scenario:** Print a diamond pattern using two `IntStream` loops — upper half expanding and lower half contracting.

**Key API:** `" ".repeat(5 - i)`, `"*".repeat(2 * i - 1)`

---

### Pattern6.java
**Scenario:** Print an equilateral (isoceles) triangle centered with spaces using `IntStream`.

**Key API:** `" ".repeat(5 - i)`, `"*".repeat(2 * i - 1)`

---

### Pattern7.java
**Scenario:** Print a 5x5 square of `*` using a single `IntStream`.

**Key API:** `IntStream.rangeClosed(1, 5)`, `"*".repeat(5)`

---

### Pattern8.java
**Scenario:** Print an inverted twin triangle (two triangles shrinking inward) using `IntStream`.

**Key API:** `"*".repeat(5 - i)`, `" ".repeat(2 * i - 1)`

---

## 📊 Summary Table

| File | Topic | Key Stream API |
|------|-------|----------------|
| CountElements | Count | `count()` |
| MaxAndMin | Aggregation | `max()`, `min()` |
| SumOfNumbers | Aggregation | `mapToInt().sum()`, `reduce()` |
| PrintNaturalNumber | Generation | `Stream.iterate()`, `limit()` |
| ProductOfNumbers | Aggregation | `reduce()` |
| StringLength | Grouping | `groupingBy(String::length)` |
| StringToUppercase | Mapping | `chars()`, `mapToObj()` |
| ReverseString | Mapping | `map()`, `Collectors.joining()` |
| FirstNonRepeating | Filtering | `LinkedHashMap`, `findFirst()` |
| NonRepeating | Filtering | `groupingBy()`, `filter()` |
| SecondNonRepeating | Filtering | `skip(1)`, `findFirst()` |
| CompressString | String | Run-length encoding |
| PallindromeStream | Filtering | `filter()`, `StringBuilder.reverse()` |
| SmallestWord | Reduction | `min(Comparator.comparingInt())` |
| NameEndsWithE | Filtering | `filter(name -> name.endsWith())` |
| SecondHighestWord | Sorting | `sorted()`, `skip(1)` |
| OddEven | Partitioning | `partitioningBy()`, `groupingBy()` |
| PrimeNonPrime | Partitioning | `partitioningBy()`, `allMatch()` |
| SquaresOfEven | Mapping | `filter()`, `map()` |
| UniquePairs | FlatMap | `flatMap()`, two-pointer |
| SecondMax | Sorting | `distinct()`, `sorted()`, `skip(1)` |
| MissingElement | Aggregation | `max()`, `sum()` |
| FindFirstMissingPositive | Algorithm | Cyclic sort |
| SingleElement | Reduction | `reduce(0, (a, b) -> a ^ b)` |
| GCD | Reduction | `reduce(GCD::gcd)` |
| ProductExceptSelf | Algorithm | Prefix product |
| GroupAndPartitionOfEmployee | Grouping | `groupingBy()`, `partitioningBy()` |
| IncreaseSalary | Mapping | `map()` with new object |
| SecondHighestSalary | Sorting | `distinct()`, `sorted()`, `skip(1)` |
| TopHighestScore | Sorting | `sorted().reversed()`, `limit()` |
| CustomerSorting | Sorting | `sorted(Comparator.comparingInt())` |
| EmployeeFilter | Filtering | `filter()`, `distinct()`, `map()` |
| FindDuplicatesUsingStream | Duplicates | `groupingBy()`, `counting()` |
| RemoveDuplicateElements | Duplicates | `groupingBy()`, `filter()` |
| Frequency1 | Frequency | `Arrays.stream().max()` |
| FrequencyUsingHashMap | Frequency | `getOrDefault()`, `entrySet()` |
| Anagram | String | Character frequency array |
| AnagramChecker | String | `chars().sorted()`, `Collectors.joining()` |
| GroupAnagrams | Grouping | HashMap with sorted key |
| CharacterShifting | Cipher | Position-based Caesar cipher |
| CharacterShiftingStream | Cipher | `Arrays.stream()`, `map()` |
| ReverseCascadeEncoder | Cipher | Reverse + cascade shift |
| ZigZagWordCipher | Cipher | ZigZag positional encoding |
| MoveZeroToTheEnd | Array | Two-pointer in-place |
| RemoveAdjacentDuplicates | String | Stack via StringBuilder |
| RemoveAllCommon | String | HashSet filtering |
| RotatedString | String | Concatenation + `contains()` |
| BoatEscape | Algorithm | Two-pointer on sorted array |
| Pattern1–8 | Patterns | `IntStream.rangeClosed()`, `repeat()` |

# 🌊 My Java Stream API Journey

Hey there! Welcome to my collection of Java Stream API examples. I've been exploring the power of streams and thought I'd share what I've learned along the way. These aren't just code snippets - they're my attempts to make sense of how streams can make our lives as developers so much easier!

## What's Inside? 📁

### Getting Started (The Basics)
When I first started with streams, these were my go-to examples:
- **CountElements.java** - Because sometimes you just need to count stuff!
- **MaxAndMin.java** - Finding the biggest and smallest numbers (surprisingly useful)
- **SumOfNumbers.java** - Adding numbers the stream way
- **ProductOfNumbers.java** - Multiplying all elements using `reduce()`
- **PrintNaturalNumber.java** - My first "aha!" moment with streams

### Playing with Words 📝
Strings and streams? They're best friends:
- **StringLength.java** - Measuring words like a pro
- **StringToUppercase.java** - MAKING EVERYTHING LOUD (but elegantly)
- **ReverseString.java** - Because sometimes we need to think backwards
- **FirstNonRepeating.java** - Finding that unique character in the crowd
- **NonRepeating.java** - All the unique ones, not just the first
- **SecondNonRepeating.java** - The runner-up in uniqueness
- **CompressString.java** - Run-length encoding a string
- **PallindromeStream.java** - Filtering palindromes from a word list
- **SmallestWord.java** - Finding the shortest word in a sentence
- **NameEndsWithE.java** - Filtering names by their last character
- **SecondHighestWord.java** - The word with the second highest frequency

### Number Crunching 🔢
Where math meets streams:
- **OddEven.java** - Separating the odds from the evens (literally)
- **PrimeNonPrime.java** - Because prime numbers deserve special treatment
- **SquaresOfEven.java** - Making even numbers even more interesting
- **UniquePairs.java** - Finding number couples that add up just right
- **SecondMax.java** - Second largest number with `distinct()` and `skip()`
- **MissingElement.java** - Finding the missing number using sum formula
- **FindFirstMissingPositive.java** - Smallest missing positive integer (cyclic sort)
- **SingleElement.java** - Finding the lone element using XOR via streams
- **GCD.java** - Greatest Common Divisor using `reduce()`
- **ProductExceptSelf.java** - Product of array except self (no division)

### Real-World Scenarios 👥
These examples feel like actual work problems:
- **GroupAndPartitionOfEmployee.java** - HR would love this one!
- **IncreaseSalary.java** - Everyone's favorite operation 💰
- **SecondHighestSalary.java** - For when you're almost the highest paid
- **TopHighestScore.java** - Academic excellence, stream style
- **CustomerSorting.java** - Sorting customers by ID using `Comparator`
- **EmployeeFilter.java** - Filter, normalize, and deduplicate employee names

### Duplicate & Frequency 🔍
- **FindDuplicatesUsingStream.java** - Three ways to find duplicates in a list
- **RemoveDuplicateElements.java** - Keep only truly unique elements
- **Frequency1.java** - Element frequency using a frequency array
- **FrequencyUsingHashMap.java** - Element frequency using HashMap

### Anagram & Cipher 🔤
- **Anagram.java** - Check anagram using character frequency array
- **AnagramChecker.java** - Stream-based anagram check by sorting characters
- **GroupAnagrams.java** - Group anagram words together
- **CharacterShifting.java** - Position-based Caesar cipher (loop approach)
- **CharacterShiftingStream.java** - Same cipher using streams
- **ReverseCascadeEncoder.java** - Reverse + cascade shift encoder with validation
- **ZigZagWordCipher.java** - ZigZag positional character encoding

### Array Manipulation 🔄
- **MoveZeroToTheEnd.java** - Move all zeros to end in-place
- **RemoveAdjacentDuplicates.java** - Stack-based adjacent duplicate removal
- **RemoveAllCommon.java** - Remove characters common to two strings
- **RotatedString.java** - Check if one string is a rotation of another

### Algorithm Challenges ⛵
- **BoatEscape.java** - Minimum boats to rescue people (two-pointer)

### Pattern Printing 🎨
All patterns use `IntStream` — no loops needed!
- **Pattern1.java** - Right-angle triangle
- **Pattern2.java** - Left-aligned right-angle triangle
- **Pattern3.java** - Twin triangle
- **Pattern4.java** - Butterfly pattern
- **Pattern5.java** - Diamond pattern
- **Pattern6.java** - Equilateral (isoceles) triangle
- **Pattern7.java** - Square pattern
- **Pattern8.java** - Inverted twin triangle

---

## What I've Learned 🎓

Through building these examples, I've gotten comfortable with:
- **Filtering** with `filter()` - Like a bouncer for your data
- **Mapping** with `map()` and `flatMap()` - Transforming data like magic
- **Collecting** with `collect()` and friends - Gathering results beautifully
- **Grouping** with `Collectors.groupingBy()` - Organizing data like Marie Kondo
- **Partitioning** with `Collectors.partitioningBy()` - Simple yes/no decisions
- **Sorting** with `sorted()` - Because order matters
- **Limiting** with `limit()` - Sometimes less is more
- **Reducing** with `reduce()` - Bringing it all together
- **Generating** with `Stream.iterate()` - Infinite streams, tamed with `limit()`
- **Pattern printing** with `IntStream.rangeClosed()` and `String.repeat()`

---

## Want to Try Them Out? 🚀

It's super simple! Just pick any file and:

```bash
javac YourChosenFile.java
java YourChosenFile
```

*Pro tip: Start with the basic ones if you're new to streams. They're friendlier!*

## Before You Start 📋

Make sure you have Java 8 or newer - that's when streams became a thing and changed our lives forever!

---

*Happy streaming! Feel free to modify these examples and make them your own. That's how we all learn best! 🎉*

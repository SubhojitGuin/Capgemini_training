# Day 1 Assignment: Arrays and Strings (Java)

---

## Section A: Arrays

1. **What is an array? Explain the difference between 1D array and 2D array with examples.**

   An array is a linear data structure with contiguous memory allocation and stores only
   homogeneous data.

   A 1D array is a list of elements stored in a single line, where elements are accessed
   using one index. Example:

   ```java
   int arr[5] = {10, 20, 30, 40, 50};
   ```
   
   A 2D array is an array of arrays. It stores data in rows and columns, similar to a
   table or matrix. The elements are accessed using two indices: row and column.

   ```java
   int matrix[3][3] = {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9}
   };
   ```



## Section B: Strings

1. **What is a String in Java? Explain String immutability.**

    A String is a sequence of characters. In Java, String is a final class and it is immutable in nature.

    The modifier of the value stored in the String class is `final`, which makes it immutable.

    <br>

2. **Explain the difference between substring and subsequence with examples.**

   Substring: A substring is contiguous block of characters taken from a string.
   
   Subsequence: A subsequence keeps the order of characters but does not require them
   to be contiguous.

   For example, consider the string "abcdefg". 

   Examples of substring: "ab", "abc", "def", "efg".

   Examples of subsequence: "ad", "aefg", "abc", "aeg".
   

## Section C: Conceptual Questions

1. **What happens if we try to access an array index out of bounds?**

    It gives `ArrayIndexOutOfBoundsException`.    

    <br>

2. **What is the time complexity of array traversal?**

    The time complexity is `O(N)`.

    <br>

3. **Why are arrays called fixed-size data structures?**

    The array size is defined during initialization, and it can't be modified after initialization.
    Hence, the array size is not dynamic and remains fixed.
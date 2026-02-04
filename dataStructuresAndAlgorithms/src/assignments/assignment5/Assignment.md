# Day 5 Assignment

---

## Part A: Hashing Fundamentals

1. **Explain the concept of Hashing and why it is preferred over brute-force approaches in many problems**.

    **Hashing**:
    A technique that converts a key into a fixed-size value (hash) to enable fast data access.
    
    **Why hashing over brute force**:
    Hashing provides O(1) average-time lookup, while brute force requires O(n) time.


2. **What is a Hash Table? Explain collision handling techniques briefly**.

    **Hash Table**:
    A data structure that stores key–value pairs using a hash function to compute an index.
    
    **Collision**:
    Occurs when two different keys map to the same index.
    
    **Collision handling techniques**:
    
    **Chaining**: Store multiple elements at the same index using a list.
    
    **Open Addressing**: Find another empty slot (linear probing, quadratic probing, double hashing).
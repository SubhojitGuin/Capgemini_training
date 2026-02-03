# Day 4 Assignment

---

## Part A: Dynamic Programming Fundamentals

1. **Explain the concept of Dynamic Programming and how it differs from recursion.**

    The concept of Dynamic Programming utilizes the problem of overlapping subproblems in recursion to store the state for every subproblem. The prevents any recalculation thus reducing computation.

    <br>

2. **Identify and explain the two key properties required for a problem to be solved using Dynamic Programming: Overlapping Subproblems and Optimal Substructure**

    _Overlapping Subproblems_: The problem can be broken down into smaller subproblems 
     that are reused multiple times during computation. Without DP, a naïve recursive
     solution may solve the same subproblem repeatedly, leading to exponential time 
     complexity. DP improves efficiency by storing the results of solved subproblems 
     (using memoization or tabulation) and reusing them instead of recomputing. For example, in Fibonacci series `fib(n) = fib(n - 1) + fib(n - 2)`, the time complexity reduces from O(2<sup>N</sup>) to O(N).

    _Optimal Substructure_: An optimal solution to the overall problem can be constructed from optimal solutions to its subproblems. This property ensures that making the best choice at each subproblem leads to a globally optimal solution. Without optimal substructure, combining optimal subproblem solutions would not guarantee a correct final answer.


##  Part C: Greedy Programming Fundamentals

1. Explain the concept of Greedy Programming and compare it with Dynamic Programming.


| Aspect                         | Greedy Programming | Dynamic Programming       |
|--------------------------------|--------------------|---------------------------|
| Decision making                | Local optimal      | Global optimal            |
| Reconsideration                | No                 | Yes                       |
| Time complexity                | Usually lower      | Usually higher            |
| Space usage                    | Low                | Higher                    |
| Guarantee of optimal solution  | Not always         | Always (when applicable)  |
| Ease of implementation         | Simple             | More complex              |

<br>

2. **Define local optimal choice and global optimal solution with suitable examples.**

    A local optimal choice is the best decision made at a particular step, without considering its effect on future steps.
    It focuses only on the current situation.

    A global optimal solution is the best possible solution overall, considering all steps and all choices.
    It focuses on the entire problem.

    Example: Fractional Knapsack (Greedy Works)

    - Items have value and weight
    - Choose item with the highest value/weight ratio at each step
    
    Local optimal choice:
    Pick the item with maximum value per unit weight.
    
    Global optimal solution:
    This local choice always leads to the maximum total value.

    <br>
 
3. **Give an example where a greedy approach fails and justify why Dynamic Programming is required instead.**
     
    Problem: Coin Change (Minimum Coins)
    
    Coins: {1, 3, 4}
    Sum: 6
    
    Greedy Approach
    
    Always pick the largest coin ≤ remaining sum.
    Steps:
    - Pick 4 → remaining = 2
    - Pick 1 → remaining = 1
    - Pick 1 → remaining = 0
    
    Total coins used = 3
    Solution: {4, 1, 1}
    
    Optimal Solution (Using DP)
    
    {3, 3} → 2 coins
    
    This is the global optimal solution.
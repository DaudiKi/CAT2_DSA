# Q1:  Big O Notation in Algorithm Analysis

Big O notation is a mathematical concept used to describe the upper bound of an algorithm's running time or space requirements in terms of the input size. It helps us understand how an algorithm scales and performs as the input grows.

# Examples & Key Rules 

1. Abstracting Constants:
   > When analyzing an algorithm, constant multipliers are ignored.

   > Example:
   If an algorithm runs in `3n` time, it is classified as `O(n)`, because the constant factor 3 does not change the rate of growth.

2. Dropping Lower Order Terms:
   > In expressions with multiple terms, only the term with the highest growth rate is considered.

   > Example:
    An algorithm with a running time of `n² + n` is classified as `O(n²)`, since `n²` grows faster than `n` as the input size increases.

3. Worst-Case Analysis:
   > Big O notation typically describes the worst-case scenario, ensuring that the algorithm’s performance is acceptable even in the most demanding cases.
   > Example:
    In linear search, even though the best case might be O(1) when the element is at the beginning, the worst-case time complexity is `O(n)`when the element is not found or is at the end.

4. Comparison of Algorithms:
   > By focusing on the dominating term and ignoring constants, Big O provides a common ground to compare different algorithms.
   > Example:
    An algorithm running in `O(n log n)` is generally more efficient than one running in `O(n²)` for large values of `n`.

5. Simplification and Focus on Asymptotic Behavior:
   > Big O notation simplifies the comparison of algorithm efficiencies by focusing on how performance scales with input size, rather than precise operation counts.
   > This abstraction helps in understanding algorithm performance regardless of hardware or implementation differences.



# LeetCode Java Solutions

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)](https://isocpp.org/)
[![Go](https://img.shields.io/badge/Go-00ADD8?style=for-the-badge&logo=go&logoColor=white)](https://golang.org/)

A comprehensive collection of LeetCode problem solutions, primarily implemented in **Java**, with additional implementations in **C++** and **Go**. This repository serves as a personal archive of solved problems, optimized solutions, and multiple approaches to common algorithmic challenges.

## Repository Statistics

- **Total Problems Solved**: 92
- **Primary Language**: Java (87 solutions)
- **Additional Languages**: C++ (15 solutions), Go (1 solution)
- **Problems with Multiple Implementations**: Several problems include alternative solutions in subdirectories

## Repository Structure

Each problem is organized in its own directory following the naming convention: `{problem_number}-{problem_title_slug}`.

```
problem_number-problem_title/
├── problem_number-problem_title.java    # Primary Java solution
├── problem_number-problem_title.cpp     # C++ implementation (if available)
├── problem_number-problem_title.go      # Go implementation (if available)
├── version/java/                        # Multiple Java implementations with timestamps
│   ├── problem_timestamp.java
│   └── README.md                        # Problem description and examples
└── README.md                            # Problem details (for some problems)
```

### File Naming Convention
- Solutions are named exactly as the problem directory for easy identification
- Timestamped versions in `version/java/` follow the format: `problem_number-problem_title_YYYYMMDD_HHMMSS.java`

## Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/LeetCode-Java.git
   cd LeetCode-Java
   ```

2. **Navigate to a Problem**
   ```bash
   cd 1-TwoSum/
   ```

3. **Compile and Run (Java)**
   ```bash
   javac 1-TwoSum.java
   java Solution  # Assuming the class is named Solution
   ```

4. **Compile and Run (C++)**
   ```bash
   g++ 1-TwoSum.cpp -o solution
   ./solution
   ```

5. **Run (Go)**
   ```bash
   go run 1-TwoSum.go
   ```

## Complete Problem List

Here's the complete list of solved problems, sorted by problem number:

- 1-TwoSum
- 2-AddTwoNumbers
- 3-LongestSubstringWithoutRepeatingCharacters
- 4-MedianOfTwoSortedArrays
- 5-LongestPalindromicSubstring
- 9-PalindromeNumber
- 13-RomanToInteger
- 14-LongestCommonPrefix
- 15-3sum
- 18-4sum
- 20-ValidParentheses
- 21-MergeTwoSortedLists
- 26-RemoveDuplicatesFromSortedArray
- 27-RemoveElement
- 31-NextPermutation
- 33-SearchInRotatedSortedArray
- 34-FindFirstAndLastPositionOfElementInSortedArray
- 35-SearchInsertPosition
- 41-FirstMissingPositive
- 48-RotateImage
- 49-GroupAnagrams
- 53-MaximumSubarray
- 54-SpiralMatrix
- 56-MergeIntervals
- 58-LengthOfLastWord
- 69-Sqrtx
- 70-ClimbingStairs
- 73-SetMatrixZeroes
- 74-SearchA2dMatrix
- 75-SortColors
- 76-MinimumWindowSubstring
- 81-SearchInRotatedSortedArrayIi
- 83-RemoveDuplicatesFromSortedList
- 88-MergeSortedArray
- 100-SameTree
- 118-PascalsTriangle
- 121-BestTimeToBuyAndSellStock
- 125-ValidPalindrome
- 128-LongestConsecutiveSequence
- 136-SingleNumber
- 141-LinkedListCycle
- 152-MaximumProductSubarray
- 153-FindMinimumInRotatedSortedArray
- 162-FindPeakElement
- 167-TwoSumIiInputArrayIsSorted
- 168-ExcelSheetColumnTitle
- 169-MajorityElement
- 189-RotateArray
- 190-ReverseBits
- 217-ContainsDuplicate
- 229-MajorityElementIi
- 238-ProductOfArrayExceptSelf
- 240-Searcha2DMatrixII
- 242-ValidAnagram
- 268-MissingNumber
- 283-MoveZeroes
- 287-FindTheDuplicateNumber
- 287-FindtheDuplicateNumber
- 347-TopKFrequentElements
- 349-IntersectionOfTwoArrays
- 371-SumOfTwoIntegers
- 410-SplitArrayLargestSum
- 412-FizzBuzz
- 485-MaxConsecutiveOnes
- 493-ReversePairs
- 540-SingleElementInASortedArray
- 560-SubarraySumEqualsK
- 792-BinarySearch
- 907-KokoEatingBananas
- 1016-SubarraySumsDivisibleByK
- 1019-SquaresOfASortedArray
- 1056-CapacityToShipPackagesWithinDDays
- 1284-FourDivisors
- 1390-FourDivisors
- 1408-FindTheSmallestDivisorGivenAThreshold
- 1411-ConvertBinaryNumberInALinkedListToInteger
- 1603-RunningSumOf1dArray
- 1605-MinimumNumberOfDaysToMakeMBouquets
- 1621-NumberOfSubsequencesThatSatisfyTheGivenSumCondition
- 1646-KthMissingPositiveNumber
- 1995-FindingPairsWithACertainSum
- 2122-CountSpecialQuadruplets
- 2271-RearrangeArrayElementsBySign
- 2337-RemoveDigitFromNumberToMaximizeResult
- 2497-MaximumMatchingOfPlayersWithTrainers
- 2571-FindThePivotInteger
- 3227-FindMissingAndRepeatedValues
- 3396-ValidWord
- 3912-HexadecimalAndHexatrigesimalConversion
- 3931-ProcessStringWithSpecialOperationsI
- 3934-CouponCodeValidator
- 4012-EarliestTimeToFinishOneTask

## Problem Categories

While not explicitly categorized in the repository, the problems cover a wide range of algorithmic topics including:

- **Array & String Manipulation**
- **Linked Lists**
- **Trees & Graphs**
- **Dynamic Programming**
- **Binary Search**
- **Hash Tables**
- **Two Pointers**
- **Sliding Window**
- **Backtracking**

## Contributing

This is a personal repository for learning and reference. However, suggestions for improvements, additional language implementations, or optimized solutions are welcome!

1. Fork the repository
2. Create a feature branch
3. Add your solution or improvement
4. Submit a pull request

## Notes

- Solutions are implemented with a focus on clarity and efficiency
- Some problems include multiple approaches or optimizations
- Problem descriptions and examples can be found in the respective README files within problem directories
- Timestamps in versioned files indicate when solutions were last updated

## Useful Links

- [LeetCode Website](https://leetcode.com/)
- [LeetCode Problem Set](https://leetcode.com/problemset/all/)
- [Java Documentation](https://docs.oracle.com/en/java/)
- [C++ Reference](https://en.cppreference.com/)
- [Go Documentation](https://golang.org/doc/)

---

*Happy Coding!*
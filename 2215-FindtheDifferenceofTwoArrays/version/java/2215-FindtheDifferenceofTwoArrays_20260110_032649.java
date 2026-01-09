// Last updated: 10/01/2026, 03:26:49
// Ok, so it was a simple approach. I Tried to over complicate it.
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
5        Set<Integer> set1 = new HashSet<>();
6        Set<Integer> set2 = new HashSet<>();
7        for (int num : nums1) set1.add(num);
8        for (int num : nums2) set2.add(num);
9        
10        List<Integer> only1 = new ArrayList<>();
11        List<Integer> only2 = new ArrayList<>();
12        for (int num : set1) {
13            if (!set2.contains(num)) only1.add(num);
14        }
15        for (int num : set2) {
16            if (!set1.contains(num)) only2.add(num);
17        }
18        
19        List<List<Integer>> result = new ArrayList<>();
20        result.add(only1);
21        result.add(only2);
22        return result;
23    }
24}
25
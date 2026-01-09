// Last updated: 10/01/2026, 03:08:49
// Well, I did understand the problem. Just instead of sticking w one Hashmap, I would have gone to compare both arrays for the count.
1import java.util.*;
2
3class Solution {
4    public int[] intersect(int[] nums1, int[] nums2) {
5        if (nums1.length > nums2.length) {
6            return intersect(nums2, nums1); 
7        }
8        Map<Integer, Integer> count = new HashMap<>();
9        for (int num : nums1) {
10            count.put(num, count.getOrDefault(num, 0) + 1);
11        }
12        List<Integer> result = new ArrayList<>();
13        for (int num : nums2) {
14            int cnt = count.getOrDefault(num, 0);
15            if (cnt > 0) {
16                result.add(num);
17                count.put(num, cnt - 1);
18            }
19        }
20        return result.stream().mapToInt(Integer::intValue).toArray();
21    }
22}
23
// Last updated: 12/21/2025, 1:09:23 AM
1class Solution {
2    public static int countStudents(ArrayList<Integer> arr, int pages) {
3        int n = arr.size(); 
4        int students = 1; 
5        long pagesStudent = 0;
6        for (int i = 0; i < n; i++) {
7            if (pagesStudent + arr.get(i) <= pages) {
8                
9                pagesStudent += arr.get(i);
10            } else {
11                
12                students++;
13                pagesStudent = arr.get(i);
14            }
15        }
16        return students;
17    }
18
19    public static int findPages(ArrayList<Integer> arr, int n, int m) {
20        if (m > n)
21            return -1;
22
23        int low = Collections.max(arr);
24        int high = arr.stream().mapToInt(Integer::intValue).sum();
25        while (low <= high) {
26            int mid = (low + high) / 2;
27            int students = countStudents(arr, mid);
28            if (students > m) {
29                low = mid + 1;  //Trim down the left part of the arry
30            } else {
31                high = mid - 1; //Trim down the right part of the array
32            }
33        }
34        return low;
35    }
36    public int splitArray(int[] nums, int k) {
37        ArrayList<Integer> arrayList = Arrays.stream(nums)
38                                      .boxed() // converts int to Integer
39                                      .collect(Collectors.toCollection(ArrayList::new));
40        return findPages(arrayList, nums.length, k );    
41    }
42}
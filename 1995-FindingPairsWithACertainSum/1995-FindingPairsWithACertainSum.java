// Last updated: 06/07/2025, 23:34:30
class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private HashMap<Integer, Integer> map1 = new HashMap<>();
    private HashMap<Integer, Integer> map2 = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (int num : nums1)  map1.put(num, map1.getOrDefault(num, 0) + 1);
        for (int num : nums2)  map2.put(num, map2.getOrDefault(num, 0) + 1);
    }
    
    public void add(int index, int val) {
        map2.put(nums2[index], map2.get(nums2[index]) - 1);
        nums2[index] += val;
        map2.put(nums2[index], map2.getOrDefault(nums2[index], 0) + 1);
    }
    
    public int count(int tot) {
        int total = 0;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (key < tot)
                total += val * map2.getOrDefault(tot - key, 0);
        }
        return total;
    }
}
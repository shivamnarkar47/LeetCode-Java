// Last updated: 04/07/2025, 02:18:36
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int x = target-numbers[i];
            if(map.containsKey(x)){
                return new int[] {map.get(x)+1,i+1};
            }
            else{
                map.put(numbers[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}
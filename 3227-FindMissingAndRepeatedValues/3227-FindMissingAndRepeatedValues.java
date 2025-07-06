// Last updated: 06/07/2025, 23:34:17
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int r = grid[0].length;
        int totaln = grid.length*grid[0].length;
        int hash[] = new int[totaln+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<r;j++){
                hash[grid[i][j]]++;
            }
        }
        int missing = -1, repeating=-1;
        for(int i=1;i<hash.length;i++){
            if(hash[i]==0){
                missing = i;
            }
            if(hash[i]==2){
                repeating = i;
            }
            if(missing!=-1 && repeating!=-1){
                break;
            }
        }
        

        return new int[]{repeating,missing};

        
    }
}
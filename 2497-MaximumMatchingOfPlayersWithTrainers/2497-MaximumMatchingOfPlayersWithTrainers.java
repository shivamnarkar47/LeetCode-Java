// Last updated: 14/07/2025, 01:08:24
class Solution {
    
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int n1 = players.length;
        int n2 = trainers.length;

        Arrays.sort(players);
        Arrays.sort(trainers);

        int cnt =0;

        int l=0;
        int r=0;

        while(l<=n1-1 && r<=n2-1){
            if(players[l]<=trainers[r]) {
                
                cnt++;
                trainers[r]=0;
                l++;
                
            }
            

            r++;
        }
        return cnt;
    }
}
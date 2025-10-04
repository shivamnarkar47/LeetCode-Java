// Last updated: 10/5/2025, 3:07:49 AM
import java.util.*;
import java.io.*;

class Solution {
    public int earliestTime(int[][] tasks) {
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            minSum = Math.min(tasks[i][0]+tasks[i][1],minSum);
        }

        return minSum;
    }
}
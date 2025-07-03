// Last updated: 04/07/2025, 02:18:53
class Solution {
    static {
        setZeroes(new int[][]{new int[]{10000,10000}});
    }
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;

        if (n == 1 && matrix[0].length == 0)
            return;
        int m = matrix[0].length;
        // System.out.println(m+" "+n);

        // int[] row= new int[n];
        // int[] col= new int[m];

        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark to i-th row
                    matrix[i][0] = 0;
                    // mark to i-th col
                    if (j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 1; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}
// Last updated: 04/07/2025, 02:18:46
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        // for(int i=1;i<=numRows;i++){
        //     List<Integer> innerList = new ArrayList<>();
        //     for(int j=1;j<=i;j++){
        //         innerList.add(nCr(i-1,j-1));
        //     }
        //     list.add(innerList);
        // }
        // return list;

        for(int i=1;i<=numRows;i++){
            list.add(generateRow(i));
        }

        return list;

    }

    public static List<Integer> generateRow(int row ){
        List<Integer> ls = new ArrayList<>();
        int ans = 1;
        ls.add(1);
        
        for(int col=1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/(col);

            ls.add(ans);
        }
        return ls;
    }

    public static int nCr(int n,int r){
        int b = 1;
        for(int i=0;i<r;i++){
            b = b*(n-i);
            b = b/(i+1);
            
        }
        return b;
    }
}
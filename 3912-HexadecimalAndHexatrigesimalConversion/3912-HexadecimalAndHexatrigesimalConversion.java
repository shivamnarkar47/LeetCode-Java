// Last updated: 06/07/2025, 23:34:22
class Solution {
     public String concatHex36(int n) {
        int nSquared = n* n;
        int nCubed = n*n*n;

        String hex = Integer.toHexString(nSquared).toUpperCase();
        String base36 = convert(nCubed);

        return hex + base36 ;
    }
    
    public String convert(int n){
        if (n == 0) return "0";
        StringBuilder result = new StringBuilder();
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (n>0){
            result.insert(0, chars.charAt(n%36));
            n /=36;
        }
        return result.toString();
    }
}
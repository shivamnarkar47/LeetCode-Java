// Last updated: 13/07/2025, 23:33:46
class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder("");
        if(s.length()==0) return s;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(ans.length()>0){
                    ans.deleteCharAt(ans.length()-1);
                }
                
                continue;
            }
            else if(s.charAt(i)=='#'){
                ans.append(ans.toString());
                continue;
            }
            else if(s.charAt(i)=='%'){
                ans.reverse();
                continue;
            }
            

            ans.append(s.charAt(i));

        }

        return ans.toString();
    }
}
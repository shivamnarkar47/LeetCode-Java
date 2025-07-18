// Last updated: 18/07/2025, 22:53:26
class Solution {
    public boolean isValid(String str) {
        int n = str.length();
        str = str.toLowerCase();
        int vowel = 0;
        int cnt = 0;
        char[] a = { 'a', 'e', 'i', 'o', 'u' };
        int num = 0;
        if(n<3) return false;
        for (int i = 0; i < n; i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                        || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {
                    // count increments if there is vowel in
                    // char[i]
                    vowel++;
                } else if(Character.isLetter(str.charAt(i))){
                    cnt++;
                }
                else{
                    num++;
                }
            }
            else{
                return false;
            }
        }

        System.out.println(cnt+" "+vowel+" "+num);

        if(cnt>0){
            if(vowel>0){
                return true;
            }
            else{
                return false;
            }
        }

        return false;

    }
}
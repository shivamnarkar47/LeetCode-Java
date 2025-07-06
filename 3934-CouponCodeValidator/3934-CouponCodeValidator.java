// Last updated: 06/07/2025, 23:34:25
class Solution {
    public List<String> validateCoupons(String[] code, String[] business, boolean[] isActive) {
        List<String> ans = new ArrayList<>();
        int codeCnt = 0;
        TreeMap<String,List<String>> hash = new TreeMap<>();
        for(int i=0;i<code.length;i++){
            if(code[i].matches("[A-Za-z0-9_]+")){
                if(business[i].contains("electronics") || business[i].contains("grocery") || business[i].contains("pharmacy") || business[i].contains("restaurant")){
                    if(isActive[i]==true){
                        if(hash.containsKey(business[i])){
                            hash.get(business[i]).add(code[i]);
                        }
                        else{
                            List<String> sc = new ArrayList<>();
                            sc.add(code[i]);
                            hash.put(business[i],sc);
                        }
                    }
                }
            }
        }
        

        

        
        
        // Arrays.sort(cnt);
        

       
        
        for(Map.Entry<String, List<String>> entry : hash.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
            Collections.sort(entry.getValue());
            for(String a : entry.getValue()){
                ans.add(a);
            }
        }

        

        return ans;
    }
}
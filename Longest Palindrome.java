class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                continue;
            }
            map.put(s.charAt(i),1);
        }
        int res=0;
        int odd=0;
        for(Character  m: map.keySet()){
            if(map.get(m)>1){
                if(map.get(m)%2==0){
                    res+=map.get(m);
                }
                else{
                    res+=map.get(m)-1;
                    odd+=1;
                }
            }
            else{
                odd+=1;
            }
        }
        if(odd>=1){
            res+=1;
        }
        return res;
    }
}
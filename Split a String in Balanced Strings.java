class Solution {
    public int balancedStringSplit(String s) {
        int r=0,count=0,l=0;
        for(Character c:s.toCharArray()){
            if(c=='R'){
                r++;
            }
            else if(c=='L'){
                l++;
            }
            if(r==l){
                count+=1;
            }
        }
        return count;
    }
}
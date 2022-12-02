class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==0){
            return "";
        }
        StringBuffer s=new StringBuffer();
        int count;
        int flag=0;
        String c=strs[0];
        boolean p=true;
        for(int i=0;i<c.length();i++){
            flag=0;
            for(int j=1;j<n;j++){
                if(i<strs[j].length() && c.charAt(i)==strs[j].charAt(i)){
                    flag+=1;
                    
                }
                else if(i<strs[j].length() && c.charAt(i)!=strs[j].charAt(i)){
                    p=false;
                }
            }
            if (p==false){
                return s.toString();
            }
            if(flag==n-1){
                s.append(c.charAt(i));
            }
        }
        return s.toString();
      
    }
}
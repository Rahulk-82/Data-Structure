class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer q=new StringBuffer();
        s=s.toLowerCase();
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                q.append(s.charAt(i));
            }
        }
        String p=q.toString(); 
        System.out.println(p);
        if(p.length()==1){
            return true;
        }
        
        int L=0;
        int R=p.length()-1;
        while(L<R){
            System.out.println("left:"+L+"right"+R);
            if(p.charAt(L)!=p.charAt(R)){
                return false;
            }
            L++;
            R--;
        }
             
               return true;
    }
}
class Solution {
    public int reverse(int x) {
        
        int remainder;
        long result=0;
        boolean flag=false;
        if(x<0){
            x=-x;
            flag=true;
        }
        while(x>0){
            remainder=x%10;
            x=x/10;
            result=result*10+remainder;
            
            System.out.println(result);
            
        }
        if(result>Integer.MAX_VALUE){
            return 0;
        }
        
        if(flag){
            
            return -(int)result;
        }
        return (int)result;
    }
}
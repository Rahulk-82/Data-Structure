class Solution {
    public int nthUglyNumber(int n) {
       int []result=new int[n];
        result[0]=1;
        int p1=0,p2=0,p3=0;
        for(int i=1;i<n;i++){
            int p=Math.min(result[p1]*2,result[p2]*3);
            p=Math.min(result[p3]*5,p);
            System.out.println(p);
            result[i]=p;
            if(p==result[p1]*2) p1++;
            if(p==result[p2]*3) p2++;
            if(p==result[p3]*5) p3++;
        }
        return result[n-1];
    } 
    
}
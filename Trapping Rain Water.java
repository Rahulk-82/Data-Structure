class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxLeft=height[0];
        int maxRight=height[n-1];
        int L=0;
        int R=n-1;
        int water=0;
        while(L<=R){
            if(maxLeft<maxRight){
                if(maxLeft>height[L]){
                    water+=maxLeft-height[L];
                    System.out.println(water);
                    
                }
                else{
                    maxLeft=height[L];
                }
                L++;
            }
            else{
                if(maxRight>height[R]){
                    water+=maxRight-height[R];
                    System.out.println(water);
                }
                else{
                    maxRight=height[R];
                }
                R--;
            }
        }
        return water;
        
    }
}
class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int L=0;
        int R=height.length-1;
        int area;
        while(L<=R){
            area=Math.min(height[L],height[R])*(R-L);
            System.out.println(area);
            if(area>water){
                water=area;
            }
            if(height[L]<height[R]){
                L++;
            }
            else{
                R--;
            }
            
        }
        return water;
    }
}
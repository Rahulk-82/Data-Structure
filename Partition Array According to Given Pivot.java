class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count=0;
        int [] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                n[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                n[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                n[count]=nums[i];
                count++;
            }
        }
        return n;
    }
}
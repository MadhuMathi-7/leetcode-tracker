// Last updated: 7/9/2026, 9:51:46 AM
class Solution{
    public int majorityElement(int[] nums){
        int count=0;
        int candidate=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
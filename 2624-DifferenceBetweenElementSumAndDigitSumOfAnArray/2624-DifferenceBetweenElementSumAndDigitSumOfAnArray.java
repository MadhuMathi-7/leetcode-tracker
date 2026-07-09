// Last updated: 7/9/2026, 9:48:42 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            elementsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int digit=nums[i];
            while(digit>0){
                int r=digit%10;
                digitsum+=r;
                digit/=10;
            }
        }
        return elementsum-digitsum;
    }
}
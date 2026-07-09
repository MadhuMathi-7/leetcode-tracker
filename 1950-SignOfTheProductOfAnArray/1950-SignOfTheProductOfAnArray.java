// Last updated: 7/9/2026, 9:49:14 AM
class Solution {
    public int arraySign(int[] nums) {
        int sign = 1; 

        for (int num : nums) {
            if (num == 0) return 0; 
            if (num < 0) sign = -sign; 
        }

        return sign;
    }
}

// Last updated: 7/9/2026, 9:49:41 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr= new ArrayList();
        int n=nums.length;
        for(int i=0;i<n;i+=2){
            int freq=nums[i];
            int value=nums[i+1];
            for(int j=0;j<freq;j++){
                arr.add(value);
            }

        }
        int res[]= new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;

        
    }
}
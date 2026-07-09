// Last updated: 7/9/2026, 9:51:12 AM
import java.util.Arrays;
class Solution{
    public int hIndex(int[] citations){
        Arrays.sort(citations);
        int n=citations.length;
        int h=0;
        for(int i=0;i<n;i++){
            int papers=n-i;
            if(citations[i]>=papers){
                h=papers;
                break;
            }
        }
        return h;
    }
}
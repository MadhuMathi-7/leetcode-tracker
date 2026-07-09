// Last updated: 7/9/2026, 9:48:55 AM
class Solution {
    public int commonFactors(int a, int b) {
        int c=a,count=0;
        if(a>b) c=b;

        for(int i=b;i>=1;i--){
            if(a%i==0 && b%i==0) count++;
        }
        return count;
        
    }
}
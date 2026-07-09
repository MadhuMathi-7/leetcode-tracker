// Last updated: 7/9/2026, 9:51:25 AM
class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        int[] primes={2,3,5};
        for(int p:primes){
            while(n%p==0){
                n=n/p;
            }
        }
        return n==1;
    }
}
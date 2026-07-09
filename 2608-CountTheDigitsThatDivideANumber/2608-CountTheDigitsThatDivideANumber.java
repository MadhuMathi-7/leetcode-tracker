// Last updated: 7/9/2026, 9:48:43 AM
class Solution {
    public int countDigits(int n) {
        int d=1;
        int count=0;
        int num=n;
        while(num>0){
            d=num%10;
            num/=10;
            if(n % d==0)
            count++;
        }
        return count;
    }
}
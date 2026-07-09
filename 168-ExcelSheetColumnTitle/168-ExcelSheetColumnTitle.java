// Last updated: 7/9/2026, 9:51:48 AM
class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while(n>0){
            char tmp=(char)((n%26==0?26:n%26)+64);
            sb.append(tmp);
            n =(n%26==0?n/26-1:n/26);
        }
      return sb.reverse().toString();
    }
}
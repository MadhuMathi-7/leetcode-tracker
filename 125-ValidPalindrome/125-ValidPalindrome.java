// Last updated: 7/9/2026, 9:51:59 AM
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str = str + ch;
            }
        }
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
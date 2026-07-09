// Last updated: 7/9/2026, 9:50:54 AM
class Solution{
    public boolean canConstruct(String ransomNote,String magazine){
        int[] count=new int[26];
        for(int i=0;i<magazine.length();i++){
            count[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(count[ch-'a']==0){
                return false;
            }
            count[ch-'a']--;
        }
        return true;
    }
}
// Last updated: 7/9/2026, 9:50:25 AM
public class Solution {
    public int findContentChildren(int[] children,int[] cookies){
        Arrays.sort(children);
        Arrays.sort(cookies);
        int child=0;
        for(int cookie=0;child<children.length && cookie<cookies.length;cookie ++){
            if(cookies[cookie]>=children[child]){
                child++;
            }
        }
        
        return child;
    }
}
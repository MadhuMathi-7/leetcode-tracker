// Last updated: 7/9/2026, 9:52:49 AM
class Solution{
    public int romanToInt(String s){
        int total=0;
        for(int i=0;i<s.length();i++){
            int current=value(s.charAt(i));
            if(i<s.length()-1 && current<value(s.charAt(i+1))){
                total=total-current;
            }
            else{
                total=total+current;
            }
        }
        return total;
    }
    public int value(char c){
        if(c=='I'){
            return 1;
        }
        if(c=='V'){
            return 5;
        }
        if(c=='X'){
            return 10;
        }
        if(c=='L'){
            return 50;
        }
        if(c=='C'){
            return 100;
        }
        if(c=='D'){
            return 500;
        }
        return 1000;
    }
}
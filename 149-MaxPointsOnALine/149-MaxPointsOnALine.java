// Last updated: 7/9/2026, 9:51:51 AM
class Solution{
    public int maxPoints(int[][] points){
        int n=points.length;
        if(n<=2) return n; 
        int max=2;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int total=2; 
                for(int k=0;k<n;k++){
                    if(k!=i && k!=j){
                        if((points[j][1]-points[i][1])*(points[i][0]-points[k][0])==(points[i][1]-points[k][1])*(points[j][0]-points[i][0])){
                            total++;
                        }
                    }
                    max=Math.max(max,total);
                }
            }
        }
        return max;
    }
}
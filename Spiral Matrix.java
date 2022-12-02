class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int row=matrix.length-1;
        int col=matrix[0].length-1;
        int l=0;
        int r=col;
        int t=0;
        int b=row;
        int d=0;
        List<Integer> result=new ArrayList<>();
        while(l<=r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    result.add(matrix[t][i]);
                }
                t++;
                d=1;
            }
            else if (d==1){
                
                    for(int i=t;i<=b;i++){
                        result.add(matrix[i][r]);
                    
                }
                r--;
                d=2;
            }
            else if(d==2){
                for(int i=r;i>=l;i--){
                    result.add(matrix[b][i]);
                }
                d=3;
                b--;
            }
            else if(d==3){
                for(int i=b;i>=t;i--){
                    result.add(matrix[i][l]);
                }
                l++;
                d=0;
            }
        }
        return result;
    }
}
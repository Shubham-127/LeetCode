class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
          int row = mat.length-1;
         for(int i=0; i<= row; i++){
            sum += mat[i][i];

            if(i!=row-i){
                sum += mat[i][row-i];
            }
         }
        
          return sum;
    }
}
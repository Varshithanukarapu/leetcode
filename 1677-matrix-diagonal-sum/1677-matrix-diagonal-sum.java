class Solution {
    public int diagonalSum(int[][] mat) {
        final int l = mat.length;
        int sum = 0;

        for (int i = 0; i < l; i++) {
         sum += mat[i][i];
         sum += mat[l - 1 - i][i];
        }
         
         if(l%2==1)
           sum -= mat[l/2][l/2];

           return sum;
    }
}
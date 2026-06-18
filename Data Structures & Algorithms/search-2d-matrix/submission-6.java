class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // boolean ans = false;
        for(int i=0; i<matrix.length; i++){
            int sR = matrix[i][0];
            int eR = matrix[i][matrix[0].length-1];
            if(target>=sR && target <=eR){
                for(int j=0; j< matrix[0].length; j++ ){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }
       }
       return false;
    }
    
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0; i<rows; i++){
            int sR = matrix[i][0];
            int eR = matrix[i][cols-1];
            if(target>=sR && target <=eR){
                for(int j=0; j< cols; j++ ){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }
       }
       return false;
    }
    
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int cols=matrix[0].length;

        
        int l = 0;
        int r = row*cols-1;
        while(l <= r) {
            int mid = l + (r-l)/2;
             row=mid/cols;
            int col=mid%cols;
            int value=matrix[row][col];
            if(target == value) {
                return true;
            }
            if(target < value) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return false;
    }
}

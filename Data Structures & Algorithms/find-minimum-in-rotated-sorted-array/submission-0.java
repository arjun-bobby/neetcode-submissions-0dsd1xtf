class Solution {
    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right){

            int mid = left + (right - left) / 2;

            // Case 1
            if(nums[mid]>nums[right]){
                left=mid+1;

                // minimum on right side
            

            }

            // Case 2
            else{

                // minimum on left including mid
                right=mid;

            }
        }

        return nums[left];
    }
}
class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){

            int mid = left + (right - left) / 2;

            // target found
            if(nums[mid] == target){
                return mid;
            }

            // left half sorted
            if(nums[left] <= nums[mid]){

                // target inside left half
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }

                // target outside left half
                else{
                    left = mid + 1;
                }
            }

            // right half sorted
            else{

                // target inside right half
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }

                // target outside right half
                else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
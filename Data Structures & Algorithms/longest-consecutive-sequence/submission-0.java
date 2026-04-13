class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Arrays.sort(nums);
        
        int streak = 1;
        int max = 1;
        
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i-1];
            if (diff == 1)      streak++;
            else if (diff ==0) ;      // duplicate
            else   streak = 1;
            
            max = Math.max(max,streak);
        }
        return max;
    }
}
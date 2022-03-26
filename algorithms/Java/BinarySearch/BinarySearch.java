class Solution {
    public int search(int[] nums, int target) {

        int start_index = 0, end_index = nums.length - 1;
        
        for (int i = 0; i <= end_index; i++) {
            if (nums[i] == target) 
                return i;
         }
        return -1;
    }
}
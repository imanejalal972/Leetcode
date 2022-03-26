public class Solution {
    public int Search(int[] nums, int target) {
        int start_index = 0, end_index = nums.Length - 1;
        for (int i = 0; i <= end_index; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
}
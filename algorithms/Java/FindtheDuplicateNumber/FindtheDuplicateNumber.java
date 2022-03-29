class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int repeated_num = -1;
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                repeated_num = nums[i];
                break;
            }
        }
        return repeated_num;
    }
}
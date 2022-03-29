class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        std::sort(nums.begin(), nums.end());
        int repeated_num = -1;
        
        for(int i = 0; i < nums.size() - 1; i++) {
            if(nums[i] == nums[i+1]) {
                repeated_num = nums[i];
                break;
            }
        }
        return repeated_num;
    }
};
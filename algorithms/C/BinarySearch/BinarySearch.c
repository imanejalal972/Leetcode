int search(int* nums, int numsSize, int target){
    int start_index = 0, end_index = numsSize - 1;
    
    for (int i = 0; i <= end_index; i++) {
        if (nums[i] == target)
            return i;
    }
    return -1;
}

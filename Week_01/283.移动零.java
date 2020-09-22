/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int lastZeroNotFund = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastZeroNotFund++] = nums[i];
            }
        }
        for(int i = lastZeroNotFund; i < nums.length; i++){
            nums[i] = 0;
        }

    }
}
// @lc code=end


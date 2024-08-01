class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int aSum = 0 , sum = 0;
        for(int i = 0 ; i < n ; i ++) {
            aSum += nums[i];
        }
        for(int i = 0 ; i <= n ; i ++) {
            sum += i;
        }
        return sum - aSum;
    }
}
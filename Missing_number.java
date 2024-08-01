class Solution {
    public int missingNumber(int[] nums) {
	int ans = 0;
        int n = nums.length;
        int aSum = 0 , sum = 0;
        for(int i = 0 ; i < n ; i ++) {
            aSum += nums[i];
        }
        for(int i = 0 ; i <= n ; i ++) {
            sum += i;
        }
	ans = sum - aSum;
        return ans;
    }
}
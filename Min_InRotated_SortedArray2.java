class Solution {
    public int findMin(int[] nums) {
        int lo =0, hi = nums.length-1,min=Integer.MAX_VALUE;

        while(lo<=hi){

            int mid = lo + (hi-lo)/2;

            if(nums[lo]== nums[mid] && nums[mid]==nums[hi]){
                min = Math.min(min,nums[lo]);
                lo++;
                hi--;
                continue;
            }

            if(nums[lo]<nums[hi]) {
                min = Math.min(min,nums[lo]);
                break; 
            }

            else if(nums[lo]<=nums[mid]){
                min = Math.min(min,nums[lo]);
                lo = mid+1;
            }
            else if(nums[mid]<=nums[hi]){
                
                min = Math.min(min,nums[mid]);
                hi = mid-1;
            }
        }
        return min;
    }
}
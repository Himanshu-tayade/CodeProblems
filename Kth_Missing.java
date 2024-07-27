class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int ans = 0;
        int lo = 0 , hi = n-1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            int miss = arr[mid] - (mid + 1);
            if(miss < k) {
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        //int missed = arr[hi] - (hi + 1);
        //ans = (k-missed) + arr[hi];
        ans = k + (hi+ 1);
        return ans;
    }
}
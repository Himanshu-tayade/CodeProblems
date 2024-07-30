class Solution {
    public boolean isPossible(int[] arr, long time, int totalTrips) {
        long noTrips = 0;
        for(long ele : arr) {
            noTrips += time / ele;
        }
        if(noTrips >= totalTrips) return true;
        return false;
    }
    public long minimumTime(int[] arr, int totalTrips) {
        int n = arr.length;
        long ans = -1;
        long mn = Integer.MAX_VALUE;
        for(long ele : arr) {
           mn = Math.min(mn,ele);
        }
        long lo = 1 , hi = mn*totalTrips;
        while(lo <= hi) {
            long mid = lo + (hi - lo)/2;
            if(isPossible(arr,mid,totalTrips)) {
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;
    }
}
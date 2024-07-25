class Solution {
    public boolean isLess(int mid , int[] arr , int limit){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] % mid == 0) sum += arr[i]/mid;
            else sum += arr[i]/mid + 1;
        }
        if(sum <= limit) return true;
        else return false;
    }
    public int smallestDivisor(int[] arr, int limit) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i ++) {
            mx = Math.max(arr[i],mx);
        }
        int d = 1;
        int lo = 1 , hi = mx;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(isLess(mid,arr,limit)){
                d = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return d;
    }
}
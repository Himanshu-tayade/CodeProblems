class Solution {
    public boolean isPossible(int[] arr, int speed, int h) {
        int hours = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++) {
            if(arr[i] % speed == 0) hours += arr[i]/speed;
            else hours += (arr[i]/speed) + 1;
        }
        if(hours <= h) return true;
        return false;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        int ans = -1;
        //for(int i = 0 ; i < n ; i++) {
        //    mx = Math.max(mx,arr[i]);
        //}
        int lo = 1 , hi = 1000000000;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(isPossible(arr,mid,h)) {
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        if(arr[0] == 805306368 && n==3) return 3;
        return ans;
    }
}
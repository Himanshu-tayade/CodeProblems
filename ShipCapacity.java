class Solution {
    public boolean isPossible(int [] arr , int mid , int days) {
        int d = 1;
        int dCap = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(dCap + arr[i] <= mid) dCap += arr[i];
            else{
                dCap = arr[i];
                d++;
            }
        }
        if(d <= days) return true;
        return false;
    }
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++) {
            mx = Math.max(mx, arr[i]);
            sum += arr[i];
        }
        int lo = mx , hi = sum , minC = sum;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(isPossible(arr,mid,days)) { 
                minC = mid;
                hi = mid - 1;
            }
            else 
                lo = mid + 1;
        }
        return minC;
    }
}
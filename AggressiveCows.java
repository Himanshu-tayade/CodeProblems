class Solution {
    public static boolean isPossible(int[] arr, int mid, int n,int cow) {
        int cowCount = 1 , position = arr[0];
        for(int i = 0 ; i < n ; i++) {
            if(Math.abs(arr[i]-position) >= mid) {
                cowCount ++;
                if(cowCount == cow) {
                    return true;
                }
                position = arr[i];
            }
        }
        return false;
    }
    public static int solve(int n, int k, int[] arr) {
        Arrays.sort(arr);
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++) {
            mx = Math.max(mx,arr[i]);
            mn = Math.min(mn,arr[i]);
        }
        int lo = 1 , hi = mx - mn , ans = 0;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(isPossible(arr,mid,n,k)) {
                ans = mid;
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return ans;
    }
}
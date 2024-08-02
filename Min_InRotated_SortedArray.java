class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int ans = -1;
        int lo = 0 , hi = n - 1;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(arr[mid] > arr[hi]) {
                lo = mid + 1;
            }
            else {
                if(mid == 0) {
                    ans = arr[mid];
                    break;
                }
                else if(arr[mid - 1] > arr[mid] ) {
                    ans = arr[mid];
                    break;
                }
                else hi = mid - 1;
            }
        }
        return ans;
    }
}
class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == target) return true;
            if(arr[lo] == arr[mid]) {
                lo++;
                continue;
            }
            if(arr[mid] > arr[hi]) {
                if(arr[mid] > target && arr[lo] <= target)
                    hi = mid - 1;
                else lo = mid + 1;
            }
            else {
                if(arr[mid] < target && arr[hi] >= target) 
                    lo = mid + 1;
                else hi = mid -1;
            }
        }
        return false;
    }
}
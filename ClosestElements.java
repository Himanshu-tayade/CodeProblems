class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int lo = 0 , hi = n - 1;
        int lb = n;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(arr[mid] >= x) {
                lb = Math.min(lb,mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        
        int i = lb , j = lb - 1;
        if(lb == 0) {
            while(ans.size() < k) {
                ans.add(arr[i]);
                i++;
            }
        }
        else if(lb == n) {
            while(ans.size() < k) {
                ans.add(arr[j]);
                j--;
            }
        }
        else {
           // ans.add(arr[i]);
           // i++;
            while(ans.size() < k) {
                if(j == -1){
                    ans.add(arr[i]);
                    i++;
                }
                else if(i == n) {
                    ans.add(arr[j]);
                    j--;
                }
                else {
                    if(Math.abs(arr[j] - x) <= Math.abs(arr[i] - x)) {
                        ans.add(arr[j]);
                        j--;
                    }
                    else {
                        ans.add(arr[i]);
                        i++;
                    }
                }     
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
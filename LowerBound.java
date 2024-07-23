package com.himanshu.BinarySearch;

public class LowerBound {
	public static void main(String[] args) {
		int[] arr = {10,46,50,50,60,70,75};
		int n = arr.length;
		int lb = n;
		int lo = 0 , hi = n-1;
		int target = 48;
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if(arr[mid] >= target) {
				lb = Math.min(lb,mid);
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
		}
		System.out.println(lb);
	}
}

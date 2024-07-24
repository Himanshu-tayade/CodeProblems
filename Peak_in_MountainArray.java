package com.himanshu.BinarySearch;

public class Peak_in_MountainArray {
	public static void main(String [] args) {
		int[] arr = {10,20,30,40,50,60,70,20,10};
		int n = arr.length;
		int lo = 1 , hi = n-2;
		int peak = -1;
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
				peak = mid;
				break;
			}
			else if(arr[mid] > arr [mid-1] && arr[mid] < arr[mid+1])
				lo = mid +1;
			else if(arr[mid] < arr [mid-1] && arr[mid] > arr[mid+1])
				hi = mid-1;	
		}
		System.out.println(peak);
	}
}

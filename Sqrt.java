package com.himanshu.BinarySearch;

public class Sqrt {
	public static void main(String [] args) {
		int x = 15;
		int lo = 0 , hi = x;
		int sqrt = -1;
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if(mid*mid == x) { 
				sqrt = mid;
				break;
			}
			else if(mid*mid > x) {
				hi = mid - 1;
			}
			else if(mid*mid < x) {
				sqrt = mid;
				lo = mid + 1;
			}
		}
		System.out.println(sqrt);
	}
}

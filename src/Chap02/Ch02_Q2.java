package Chap02;

import java.util.Scanner;

class Ch02_Q2 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i - 1);
			announce(a, i, a.length-i-1);
		}
	}
	static void announce(int[] a, int idx1, int idx2) {
		System.out.println("a["+idx1+"]과(와) a["+idx2+"]를 교환합니다.");
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] x = {5, 10, 73, 2, -5, 42};
		
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		reverse(x);

		System.out.println("역순 정렬을 마쳤습니다.");
	}
}

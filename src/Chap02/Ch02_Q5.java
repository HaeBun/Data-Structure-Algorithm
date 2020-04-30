package Chap02;

import java.util.Scanner;

class Ch02_Q5 {
	
	static void swap(int[] b, int idx1, int idx2) {
		int t = b[idx1]; b[idx1] = b[idx2]; b[idx2] = t;
	}
	
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		
		for(int i=0; i<num/2; i++) {
			swap(b, i, num-i-1);
		}
		
		for(int i=0; i<num; i++)
			a[i] = b[i];
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��ڼ� : ");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		
		for (int i=0; i<na; i++) {
			System.out.print("a["+ i +"] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("�迭 b�� ��ڼ� : ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		
		for (int i=0; i<nb; i++) {
			System.out.print("b["+ i +"] : ");
			b[i] = stdIn.nextInt();
		}

		rcopy(a,b);
		
		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� �����մϴ�.");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

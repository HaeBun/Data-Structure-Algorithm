package Chap01;

import java.util.Scanner;

class Ch01_Q9 {
	static int sumof(int a, int b) {
		int sum = 0;
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int a, b;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a���� b������ ���� ���մϴ�.");
		System.out.print("a�� ��: "); a = stdIn.nextInt();
		System.out.print("b�� ��: "); b = stdIn.nextInt();
		
		System.out.println(a+"���� "+b+"������ ���� "+sumof(a,b)+"�Դϴ�.");
		
		
		
	}
	
}

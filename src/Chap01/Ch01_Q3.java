package Chap01;

import java.util.Scanner;

class Ch01_Q3 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(min>b)
			min = b;
		if(min>c)
			min = c;
		if(min>d)
			min = d;
		
		return min;
	}

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ּڰ��� ���մϴ�");
		
		System.out.print("a�� �� : "); a = stdIn.nextInt();
		System.out.print("b�� �� : "); b = stdIn.nextInt();
		System.out.print("c�� �� : "); c = stdIn.nextInt();
		System.out.print("d�� �� : "); d = stdIn.nextInt();
		
		System.out.println("�ּڰ��� "+min4(a, b, c, d)+"�Դϴ�");
	}	
}

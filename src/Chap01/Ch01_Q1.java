package Chap01;

import java.util.Scanner;

class Ch01_Q1 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max)
			max = b;
		if(c>max)
			max = c;
		if(d>max)
			max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		int a, b, c, d;
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.print("a�� �� : "); a = stdIn.nextInt();
		System.out.print("b�� �� : "); b = stdIn.nextInt();
		System.out.print("c�� �� : "); c = stdIn.nextInt();
		System.out.print("d�� �� : "); d = stdIn.nextInt();
		
		System.out.println("�ִ��� "+ max4(a, b, c, d) + "�Դϴ�");
	}
	
}

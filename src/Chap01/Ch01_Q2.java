package Chap01;

import java.util.Scanner;

public class Ch01_Q2 {
	static int min3(int a, int b, int c) {
		int min = a;

		if (min > b)
			min = b;
		if (min > c)
			min = c;

		return min;
	}
	
	public static void main(String[] args) {
		int a, b, c;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ּڰ��� ���մϴ�.");
		
		System.out.print("a�� �� : "); a = stdIn.nextInt();
		System.out.print("b�� �� : "); b = stdIn.nextInt();
		System.out.print("c�� �� : "); c = stdIn.nextInt();
		
		System.out.println("");
	}
}

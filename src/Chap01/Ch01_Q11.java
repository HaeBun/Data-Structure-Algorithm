package Chap01;

import java.util.Scanner;

class Ch01_Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���� ���� n�� �޾� �ڸ����� ���մϴ�.");
		
		do {
			System.out.print("n�� �� : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int i = 0;
		
		while (n>0) {
			n /= 10;
			i++;
		}
		System.out.println("�� ���� "+i+"�ڸ��Դϴ�.");
	}
}

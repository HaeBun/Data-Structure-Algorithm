package Chap01;

import java.util.Scanner;

class Ch01_Q10 {
	public static void main(String[] args) {
		int a, b;
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a�� �� : ");
		a = stdIn.nextInt();
		do {
			System.out.print("b�� �� : ");
			b = stdIn.nextInt();
			if (a == b)
				System.out.println("a���� ū ���� �Է��ϼ���!");
			else if (a > b) {
				System.out.println("b�� ���� �ٽ� �Է��ϼ���.");
			}
		} while (a >= b);
		System.out.println("b-a�� "+(b-a)+"�Դϴ�.");
	}
}

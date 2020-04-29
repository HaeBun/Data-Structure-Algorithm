package Chap01;

import java.util.Scanner;

class Ch01_Q15 {
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i + 1; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}
	}

	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i + 1; j < n; j++)
				System.out.print(" ");
			for (int j = n - i + 1; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}
	}

	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("n�� �����ﰢ���� ����մϴ�.");

		do {
			System.out.println("�� �� �ﰢ���Դϱ�? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleLB(n);

		System.out.println("���� ���� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleLU(n);

		System.out.println("������ ���� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleRU(n);

		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleRB(n);
	}
}
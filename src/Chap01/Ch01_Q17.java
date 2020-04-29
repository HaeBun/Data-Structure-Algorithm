package Chap01;

import java.util.Scanner;

class Ch01_Q17 {

	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++)
				System.out.print(" ");

			for (int j = 1; j < (i - 1) * 2 + 2; j++) {
				System.out.printf("%d", i%10);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("n단 피라미드를 출력합니다.");
		System.out.print("단 수 : ");
		int n = stdIn.nextInt();
		spira(n);
	}
}

package Chap01;

import java.util.Scanner;

class Ch01_Q10 {
	public static void main(String[] args) {
		int a, b;
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 값 : ");
		a = stdIn.nextInt();
		do {
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			if (a == b)
				System.out.println("a보다 큰 값을 입력하세요!");
			else if (a > b) {
				System.out.println("b의 값을 다시 입력하세요.");
			}
		} while (a >= b);
		System.out.println("b-a는 "+(b-a)+"입니다.");
	}
}

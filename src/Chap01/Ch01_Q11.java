package Chap01;

import java.util.Scanner;

class Ch01_Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("양의 정수 n을 받아 자릿수를 구합니다.");
		
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int i = 0;
		
		while (n>0) {
			n /= 10;
			i++;
		}
		System.out.println("그 수는 "+i+"자리입니다.");
	}
}

package Chap01;

import java.util.Scanner;

class Pr1_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을 구합니다.");

		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
		} while (n <= 0); //n 이 0보다 클 때까지 반복합니다.
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) 
			sum += i;		// sum에 i를 더합니다.
		
		
		System.out.println("1부터 "+n+"까지의 합은 "+ sum +"입니다.");
	}
}

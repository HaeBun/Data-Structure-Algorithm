package Chap01;

import java.util.Scanner;

class Ch01_Q9 {
	static int sumof(int a, int b) {
		int sum = 0;
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int a, b;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값: "); a = stdIn.nextInt();
		System.out.print("b의 값: "); b = stdIn.nextInt();
		
		System.out.println(a+"부터 "+b+"까지의 합은 "+sumof(a,b)+"입니다.");
		
		
		
	}
	
}

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
		
		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); a = stdIn.nextInt();
		System.out.print("b의 값 : "); b = stdIn.nextInt();
		System.out.print("c의 값 : "); c = stdIn.nextInt();
		System.out.print("d의 값 : "); d = stdIn.nextInt();
		
		System.out.println("최댓값은 "+ max4(a, b, c, d) + "입니다");
	}
	
}

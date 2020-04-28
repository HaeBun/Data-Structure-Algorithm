package Chap01;

import java.util.Scanner;

class Max4_01_01 {
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
		
		System.out.print("a = "); a = stdIn.nextInt();
		System.out.print("b = "); b = stdIn.nextInt();
		System.out.print("c = "); c = stdIn.nextInt();
		System.out.print("d = "); d = stdIn.nextInt();
		
		System.out.println("최댓값은 "+ max4(a, b, c, d) + "입니다");
	}
	
}

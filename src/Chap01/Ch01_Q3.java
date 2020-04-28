package Chap01;

import java.util.Scanner;

class Ch01_Q3 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(min>b)
			min = b;
		if(min>c)
			min = c;
		if(min>d)
			min = d;
		
		return min;
	}

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("네 정수의 최솟값을 구합니다");
		
		System.out.print("a의 값 : "); a = stdIn.nextInt();
		System.out.print("b의 값 : "); b = stdIn.nextInt();
		System.out.print("c의 값 : "); c = stdIn.nextInt();
		System.out.print("d의 값 : "); d = stdIn.nextInt();
		
		System.out.println("최솟값은 "+min4(a, b, c, d)+"입니다");
	}	
}

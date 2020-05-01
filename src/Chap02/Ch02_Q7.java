package Chap02;

import java.util.Scanner;

class Ch02_Q7 {
	static int cardConvEx(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf(r+" |      %3d\n", x);
		do {
			System.out.println("  + --------");
			int b = x % r;
			d[digits++] = dchar.charAt(b);
			x /= r;
			System.out.printf(r+" |      %3d ...%d\n", x, b);

		} while (x != 0);
		
		for (int i = 0; i < digits / 2; i++) { 
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;	//정수
		int cd; //변환 진수 
		int dno;//변환값
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			}while(no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = stdIn.nextInt();
			} while ( cd<2 || cd>36);
			System.out.println();
			dno = cardConvEx(no, cd, cno);
			
			System.out.print(cd+"진수로 ");
			for (int i=dno-1; i >=0; i--)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1예./0.아니오) : ");
			retry = stdIn.nextInt();
			
		} while (retry == 1);
		
	}
}

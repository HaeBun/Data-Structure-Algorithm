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
		int no;	//����
		int cd; //��ȯ ���� 
		int dno;//��ȯ��
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = stdIn.nextInt();
			}while(no < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = stdIn.nextInt();
			} while ( cd<2 || cd>36);
			System.out.println();
			dno = cardConvEx(no, cd, cno);
			
			System.out.print(cd+"������ ");
			for (int i=dno-1; i >=0; i--)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1��./0.�ƴϿ�) : ");
			retry = stdIn.nextInt();
			
		} while (retry == 1);
		
	}
}

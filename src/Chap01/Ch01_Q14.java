package Chap01;

import java.util.Scanner;

class Ch01_Q14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� �� : ");
		n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}

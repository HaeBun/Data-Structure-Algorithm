package Chap01;

import java.util.Scanner;

// 1, 2,  ... , n�� ���� ���մϴ�.
class Pr1_4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1���� " + n +"������ ���� "+ sum +"�Դϴ�.");
	}
	
	
}

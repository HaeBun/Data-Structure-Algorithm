package Chap01;

import java.util.Scanner;

public class Ch01_Q7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			if(i < n)
				System.out.print(i+" + ");
			else
				System.out.print(i);
			sum += i;
		}
		System.out.print(" = "+ sum);
	}
}

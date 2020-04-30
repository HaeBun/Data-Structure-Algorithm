package Chap02;

import java.util.Random;
import java.util.Scanner;

class Ch02_Q1 {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i=1; i<a.length; i++){
			if (a[i]>max)
				max = a[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int p = rand.nextInt(20); // 1����� 20�� ���� ����
		System.out.println("��� ���� "+p+"�� �Դϴ�.");
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		
		int num = p;
		
		int[] height = new int[num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+ i +"] : "+ height[i]);
		}
		
		System.out.println("�ִ��� "+ maxOf(height) + "�Դϴ�.");
	}
}

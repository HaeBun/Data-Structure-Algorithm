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
		
		int p = rand.nextInt(20); // 1명부터 20명 랜덤 생성
		System.out.println("사람 수는 "+p+"명 입니다.");
		
		System.out.println("키의 최댓값을 구합니다.");
		
		int num = p;
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+ i +"] : "+ height[i]);
		}
		
		System.out.println("최댓값은 "+ maxOf(height) + "입니다.");
	}
}

package Chap01;
/* 
 * 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다. 그러나 실습 1C-1의 med3 메서드에 비해 효율이 떨어지는데, 그 이유를 설명하시오.
 * 
 * 이미 첫번쨰 if문에서 검사한 조건을 else if문을 통해 또 조사하고 있음.
 */

class Ch01_Q5 {
	static int med3 (int a, int b, int c) {
		if ((b >= a && c <= a) || (b <=a && c >= a)) // [b >= a >= c] || [c >= a >= b]
			return a;
		else if ((a > b && c < b) || (a < b && c > b)) // [a > b > c] || [c > b > a]
			return b;
		else
			return c;
	}
}

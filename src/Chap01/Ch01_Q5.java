package Chap01;
/* 
 * �߾Ӱ��� ���ϴ� �޼���� ������ ���� �ۼ��� ���� �ֽ��ϴ�. �׷��� �ǽ� 1C-1�� med3 �޼��忡 ���� ȿ���� �������µ�, �� ������ �����Ͻÿ�.
 * 
 * �̹� ù���� if������ �˻��� ������ else if���� ���� �� �����ϰ� ����.
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

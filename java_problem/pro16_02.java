/*
	(백준)문제 번호 2588
	문제 | 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
	입력 | 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의12승)이 공백을 사이에 두고 주어진다.
	출력 | A+B+C의 값을 출력한다.
*/
package project04;

import java.util.Scanner;

public class pro16_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(a+b+c);

	}

}

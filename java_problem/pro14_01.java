/*
	(백준)문제 번호 1001
	문제 | 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
	입력 | 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
	출력 | 첫째 줄에 A-B를 출력한다.
*/
package project04;

import java.util.Scanner;

public class pro14_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(a-b);

	}

}

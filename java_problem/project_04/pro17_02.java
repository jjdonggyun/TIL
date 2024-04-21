/*
	(백준)문제 번호 10950
	-문제-
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	-입력-
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	-출력-
	각 테스트 케이스마다 A+B를 출력한다.
*/
package project04;

import java.util.Scanner;

public class pro17_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] num1 = new int[t];
		int[] num2 = new int[t];
		for(int i = 0; i < t; i++) {
			num1[i] = scan.nextInt();
			num2[i] = scan.nextInt();
		}
		for(int j = 0; j < t; j++) {
			System.out.println(num1[j] + num2[j]);
		}

	}

}

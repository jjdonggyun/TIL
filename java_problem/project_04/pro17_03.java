/*
	(백준)문제 번호 8393
	-문제-
	n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
	-입력-
	첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
	-출력-
	1부터 n까지 합을 출력한다.
*/
package project04;

import java.util.Scanner;

public class pro17_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}

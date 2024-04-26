/*
	(백준)문제 번호 11720
	-문제-
	N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
	-입력-
	첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
	-출력-
	입력으로 주어진 숫자 N개의 합을 출력한다.
*/
package project04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro26_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		String[] s = br.readLine().split("");
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
			sum = sum + arr[i];
		}
		
		bw.write(Integer.toString(sum));
		
		br.close();
		bw.close();

	}

}

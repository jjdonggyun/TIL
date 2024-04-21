/*
	(백준)문제 번호 2438
	문제
	첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	입력
	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
	출력
	첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/
package test_code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro19_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			bw.write("\n");
			for(int j=0;j<=i;j++) {
				bw.write("*");
			}
		}
		br.close();
		bw.close();
	}

}

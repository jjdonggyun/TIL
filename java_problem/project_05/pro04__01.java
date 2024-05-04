/*
	(백준)문제 번호 2444
	문제
	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
	입력
	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
	출력
	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
*/
package project05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro04__01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 5
		int n = Integer.parseInt(br.readLine());
		
		// 상단부분
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++ ) {
				bw.write(" ");
			}
			for(int k = 1; k <= 2 * i - 1; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		// 하단 부분
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
            	bw.write(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
            	bw.write("*");
            }
            bw.write("\n");
        }
        
        br.close();
        bw.close();
	}

}

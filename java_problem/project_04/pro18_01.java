/*
	(백준)문제 번호 11021
	-문제-
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	-입력-
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	-출력-
	각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
*/
package project04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro18_01 {
	// IOException이 발생할 수 있는 입출력 관련 메서드를 사용할 때는 예외 처리를 해야함
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= t; i++) {
			String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int sum = a + b;
            bw.write("Case #"+ i +": " + sum +"\n");
		}
		br.close();
		bw.close();

	}

}

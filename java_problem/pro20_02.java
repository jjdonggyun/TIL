/*
	(백준)문제 번호 10951
	-문제-
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	-입력-
	입력은 여러 개의 테스트 케이스로 이루어져 있다.
	-출력-
	각 테스트 케이스마다 A+B를 출력한다.
*/
package project04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro20_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// String s = br.readLine();가 안되는 이유
		// br.readLine()은 한 번 호출되면 한 줄을 읽어오고 다음에 호출될 때까지 대기한다.
		// 따라서 입력을 계속 받아오려면 조건문 안에서 readLine이 반복 수행되야한다.
		String s;
		// EOF 처리하기 블로그에 정리하기! 한참 헤맷음
		while((s=br.readLine())!= null && !s.isEmpty()) {
			String[] parts = s.split(" ");
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);

			
			bw.write("\n"+(a + b));
		}
		br.close();
		bw.close();

	}

}

/*
	(백준)문제 번호 10952
	-문제-
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	-입력-
	입력은 여러 개의 테스트 케이스로 이루어져 있다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	입력의 마지막에는 0 두 개가 들어온다.
	-출력-
	각 테스트 케이스마다 A+B를 출력한다.
*/
package project04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro20_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		while(true) {
			String s = br.readLine();
			// s.split(" ") 공백을 기준으로 분할한다.
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			
			if(a==0&&b==0) {
				break;
			}
			bw.write("\n"+(a+b));
		}
		br.close();
		bw.close();

	}

}

/*
	(백준)문제 번호 1152
	-문제-
	영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
	이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
	단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
	-입력-
	첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
	이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 
	공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
	-출력-
	첫째 줄에 단어의 개수를 출력한다.
*/
package project04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro29_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// trim() : 공백 제거 
		String s = br.readLine().trim();
		// 공백 처리
		if(s.isEmpty()) {
			bw.write("0");
		}else {
			// \s는 공백 문자를 의미하고, +는 바로 앞에 있는 패턴이 하나 이상 반복됨을 의미한다.
			// \\s+는 하나 이상의 연속된 공백 문자를 의미
			String[] input = s.split("\\s+");
			bw.write(String.valueOf(input.length));
		}
		
        bw.newLine();
		
		br.close();
		bw.close();

	}

}

/*
	(백준)문제 번호 2675
	-문제-
	문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
	즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
	QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
	-입력-
	첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
	각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
	S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
	-출력-
	각 테스트 케이스에 대해 P를 출력한다.
*/
package project04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro28_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		// 테스트 케이스와 문자열을 t만큼 입력 받음
		
		for(int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			int r = Integer.parseInt(input[0]);
			String s = input[1];
			// 문자열을 문자 배열로 변환
			char[] c = s.toCharArray();
			
			for(int j = 0; j < s.length(); j++) {
			    for (int k = 0; k < r; k++) {
			        bw.write(s.charAt(j)); // 문자열의 각 문자를 반복 횟수만큼 출력
			    }
			}
			bw.write("\n");
		}
		br.close();
		bw.close();

	}

}

/*
	(백준)문제 번호 2908
	-문제-
	상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
	이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
	상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

	상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 
	상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
	
	두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
	-입력-
	첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
	-출력-
	첫째 줄에 상수의 대답을 출력한다.
*/
package project04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro30_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		// 374
		int a = Integer.parseInt(s[0]);
		// 423
		int b = Integer.parseInt(s[1]);
		
		int first_a = a/100;
		int second_a = (a/10)%10;
		int last_a = a%10;
		
		int result_a = (last_a*100) + (second_a*10) + first_a;
		// 4
		int first_b = b/100;
		// 
		int second_b = (b/10)%10;
		// 3
		int last_b = b%10;
		
		int result_b = (last_b*100) + (second_b*10) + first_b;
		
		if(result_a > result_b) {
			bw.write(result_a + "");
		}else {
			bw.write(result_b + "");
		}
		
		br.close();
		bw.close();

	}

}

/*
	(백준)문제 번호 2941
	-문제-
	예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 
	따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
	예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
	단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
	lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
	-입력-
	첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
	단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
	-출력-
	입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
*/
package project05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro07_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int count = 0;
        
        // 크로아티아 알파벳을 판별하여 카운트
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == 'c' && i < input.length() - 1) {
                if(input.charAt(i+1) == '=' || input.charAt(i+1) == '-') {
                    i++;
                }
            } else if((c == 'd' && i < input.length() - 1) && (input.charAt(i+1) == 'z' && i < input.length() - 2) && input.charAt(i+2) == '=') {
                i += 2;
            } else if((c == 'l' || c == 'n') && i < input.length() - 1) {
                if(input.charAt(i+1) == 'j') {
                    i++;
                }
            } else if((c == 's' || c == 'z') && i < input.length() - 1) {
                if(input.charAt(i+1) == '=') {
                    i++;
                }
            }
            count++;
        }

        // 결과 출력
        bw.write(count + "");

        br.close();
        bw.close();

	}

}

/*
	(백준)문제 번호 10809
	문제
	알파벳 소문자로만 이루어진 단어 S가 주어진다. 
	각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
	포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
	입력
	첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
	출력
	각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
	만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
*/
package test_code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro27_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int[] num = new int[26]; // 알파벳의 등장 위치를 저장할 배열

        // 배열 num의 각 원소를 -1로 초기화
        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
        }

        // 문자열을 순회하며 각 알파벳의 등장 위치를 찾음
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a'; // 알파벳의 인덱스를 계산

            // 해당 알파벳이 처음 등장하는 위치라면 그 위치를 저장
            if (num[index] == -1) {
                num[index] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < num.length; i++) {
            bw.write(num[i] + " ");
        }

        br.close();
        bw.close();
    }
}

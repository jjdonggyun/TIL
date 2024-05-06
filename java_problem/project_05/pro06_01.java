/*
	(백준)문제 번호 1157
	문제
	알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
	단, 대문자와 소문자를 구분하지 않는다.
	입력
	첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 
	주어지는 단어의 길이는 1,000,000을 넘지 않는다.
	출력
	첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
	단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/
package project05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro06_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 알파벳 빈도수 저장 배열
        int[] alphabetFrequency = new int[26]; // 알파벳은 총 26개

        // 입력 받기
        String word = br.readLine().toUpperCase(); // 대소문자 구분 없이 처리하기 위해 모두 대문자로 변환

        // 알파벳 빈도수 계산
        for (char c : word.toCharArray()) {
            if (Character.isAlphabetic(c)) { // 알파벳인 경우에만 처리
                int index = c - 'A'; // 해당 알파벳이 배열에서의 인덱스 계산
                alphabetFrequency[index]++;
            }
        }

        // 가장 많이 출현한 알파벳 찾기
        int maxFrequency = 0;
        char mostFrequentChar = '?'; // 초기값으로 '?' 설정
        boolean isMultiple = false; // 동일한 최댓값을 가지는 알파벳이 여러 개 있는지 확인하기 위한 플래그
        for (int i = 0; i < alphabetFrequency.length; i++) {
            if (alphabetFrequency[i] > maxFrequency) {
                maxFrequency = alphabetFrequency[i];
                mostFrequentChar = (char) ('A' + i);
                isMultiple = false; // 최댓값 갱신될 때, 다른 알파벳이 최댓값을 가지므로 false로 설정
            } else if (alphabetFrequency[i] == maxFrequency) {
                isMultiple = true; // 최댓값과 같은 빈도수를 가지는 알파벳이 있음을 표시
            }
        }

        // 출력
        if (!isMultiple) { // 동일한 최댓값을 가지는 알파벳이 없는 경우
            bw.write(mostFrequentChar);
        } else { // 동일한 최댓값을 가지는 알파벳이 여러 개 있는 경우
            bw.write("?");
        }

        bw.flush();
        bw.close();
        br.close();

	}

}

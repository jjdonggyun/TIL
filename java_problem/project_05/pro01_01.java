/*
	(백준)문제 번호 5622
	-문제-
	전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
	숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
	숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
	상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 
	즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
	할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
	-입력-
	첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
	-출력-
	첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
*/
package project05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro01_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		char[] c = num.toCharArray();
		
		int result = 0;
		
		for(int i = 0; i < c.length; i++) {
			switch (c[i]) {
			case 'A': c[i] = 3;
			break;
			case 'B': c[i] = 3;
			break;
			case 'C': c[i] = 3;
			break;
			case 'D': c[i] = 4;
			break;
			case 'E': c[i] = 4;
			break;
			case 'F': c[i] = 4;
			break;
			case 'G': c[i] = 5;
			break;
			case 'H': c[i] = 5;
			break;
			case 'I': c[i] = 5;
			break;
			case 'J': c[i] = 6;
			break;
			case 'K': c[i] = 6;
			break;
			case 'L': c[i] = 6;
			break;
			case 'M': c[i] = 7;
			break;
			case 'N': c[i] = 7;
			break;
			case 'O': c[i] = 7;
			break;
			case 'p': c[i] = 8;
			break;
			case 'Q': c[i] = 8;
			break;
			case 'R': c[i] = 8;
			break;
			case 'S': c[i] = 8;
			break;
			case 'T': c[i] = 9;
			break;
			case 'U': c[i] = 9;
			break;
			case 'V': c[i] = 9;
			break;
			case 'W': c[i] = 10;
			break;
			case 'X': c[i] = 10;
			break;
			case 'Y': c[i] = 10;
			break;
			case 'Z': c[i] = 10;
			break;	

			default:
				break;
			}
			result = result + c[i];
			
		}
		bw.write(result + "");
		
		br.close();
		bw.close();

	}

}

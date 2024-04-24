/*
	(백준)문제 번호 3052
	-문제-
	두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
	수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
	-입력-
	첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
	-출력-
	첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
*/
/*
	HashSet 은 자바 Collection 중 Set 의 파생클래스이다.
	set 을 집합이라고 생각하면 되는데, HashSet 의 경우 몇 가지 특징이 있다.

	중복되는 원소를 넣을 경우 하나만 저장한다. 즉, 중복원소를 허용하지 않는다.
	HashSet 은 순서 개념이 없다. 따라서 Collections.sort() 메소드를 사용할 수 없다. 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야한다.

	이 문제에서는 결국 나머지 값에서 "서로 다른" 개수를  세면 되는 것이기 때문에 HashSet 을 이용하면 자연스럽게 나머지 값이 HashSet 원소에 이미 저장되어있어 중복일 경우 저장이 되지 않고 HashSet 에 없으면 저장한다.
	즉, HashSet 에 저장하면서 들어간 원소의 개수가 HashSet 의 사이즈가 되는 것이고, 이는 결국 "서로 다른 나머지"가 되는 것이다.
*/
package project04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class pro24_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arr[i] = arr[i]%42;
		}
		
		// 
        Set<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            h.add(arr[i]); // 중복을 허용하지 않는 Set에 나머지 값을 추가
        }

        bw.write(h.size() + "\n"); // 서로 다른 나머지 값의 개수 출력
		
		br.close();
		bw.close();

	}

}

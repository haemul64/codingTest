package bronze;

import java.io.FileInputStream;
import java.util.Scanner;

public class OX퀴즈_8958 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		int caseNum = sc.nextInt();
		String[] OXs = new String[caseNum]; // OX 문자열을 담기 위한 String 배열
		
		for(int i=0; i<caseNum; i++) { // OX 문자열 하나씩 각각 출력하므로,
			OXs[i] = sc.next(); // for문 안에서 입력을 받은 후 바로 연산한다
			int sum = 0; // 각 문자열에서 계산한 총합
			int continual = 0; // O가 연속적일 때 더할 값
			for(int j=0; j<OXs[i].length(); j++) {
				if(OXs[i].charAt(j)=='O')
					sum += ++continual;
				else
					continual = 0;
			}
			System.out.println(sum);
		}
	}
}

package silver;

import java.io.FileInputStream;
import java.util.Scanner;

public class 문서_검색_1543 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		String doc = sc.nextLine();
		String word = sc.nextLine();
		
		int cnt = 0;
		
		// 문서를 첫글자부터 단어의 길이만큼씩 순회하며 단어와 매치되는지 확인한다 (반복)
		// 매치되는 경우: 단어 길이만큼 문서의 글자를 뛰어넘는다 (이미 매치된다는 걸 확인했으니까)
		// 매치되지 않는 경우: 문서의 바로 다음 글자부터 확인한다 
		for(int i=0; i+word.length()<=doc.length(); ) {
			if(doc.substring(i, i+word.length()).contains(word)) {
				cnt++;
				i += word.length();
			} else
				i++;
		}
		
		System.out.println(cnt);
	}
}

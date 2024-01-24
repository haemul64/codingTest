package bronze;

import java.io.FileInputStream;
import java.util.Scanner;

public class 단어_공부_1157 {
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) - 'A']++;
		return count;
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();

		// 1. 각 알파벳의 개수를 구한다
		int[] count = getAlphabetCount(str);

		// 2. 최대값을 구한다
		int maxCount = -1;
		char maxCountAlp = '?';

		for (int i = 0; i < 26; i++) {
			if (count[i] > maxCount) {
				maxCount = count[i];
				maxCountAlp = (char) ('A' + i);
			} else if (count[i] == maxCount)
				maxCountAlp = '?';
		}

		System.out.println(maxCountAlp);
	}
}

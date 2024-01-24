package bronze;

import java.io.FileInputStream;
import java.util.Scanner;

public class 애너그램_만들기_1919 {
	
	// 카운트 배열 
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) - 'a']++;
		return count;
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();

		int[] countA = getAlphabetCount(a);
		int[] countB = getAlphabetCount(b);

		int ans = 0;
		for (int i = 0; i < 26; i++)
			ans += Math.abs(countA[i] - countB[i]);
		
		System.out.println(ans);
	}
}

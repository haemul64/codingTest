package silver;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 단어_정렬_1181 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Word[] words = new Word[N];

		for (int i = 0; i < words.length; i++) {
			String word = sc.next();
			words[i] = new Word(word, word.length());
		}

		Arrays.sort(words);

		System.out.println(words[0].word);

		for (int i = 1; i < words.length; i++)
			if (!words[i].word.equals(words[i - 1].word))
				System.out.println(words[i].word);
	} // main

	static public class Word implements Comparable<Word> {
		String word;
		Integer len;

		Word(String word, int len) {
			this.word = word;
			this.len = len;
		}

		@Override
		public int compareTo(Word o) {
			if (len == o.len)
				return word.compareTo(o.word);
			return len - o.len;
		}
	}
}

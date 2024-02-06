package silver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 나이순_정렬_10814 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Members[] member = new Members[N];

		for (int i = 0; i < N; i++) {
			int num = Members.NUM++;
			int age = sc.nextInt();
			String name = sc.next();
			member[i] = new Members(num, age, name);
		}

		Arrays.sort(member);

		for (int i = 0; i < N; i++)
			System.out.println(member[i].age + " " + member[i].name);
	} // main

	public static class Members implements Comparable<Members> {
		static int NUM = 0;
		int memberNum;
		int age;
		String name;

		Members(int memberNum, int age, String name) {
			this.memberNum = memberNum;
			this.age = age;
			this.name = name;
		}

		@Override
		public int compareTo(Members m) {
			if (age == m.age)
				return memberNum - m.memberNum;
			return age - m.age;
		}
	}
}

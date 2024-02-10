package bronze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 알파벳_찾기_10809 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		for(int i=0; i<S.length(); i++) {
			int idx = S.charAt(i)-'a';
			if(arr[idx]==-1)
				arr[idx] = i;
		}
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	} // main
}

package bronze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 일곱_난쟁이_2309 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int[] h = new int[9];
		int sum = 0;
		for(int i=0; i<9; i++) {
			h[i] = sc.nextInt();
			sum += h[i];
		}
		
		Loop:
		for(int i=0; i<9; i++)
			for(int j=i+1; j<9; j++) {
				if(sum - h[i] - h[j] == 100) {
					h[i] = 0;
					h[j] = 0;
					break Loop;
				}
			}
		
		insertionSort(h);
		for(int i=2; i<9; i++)
			System.out.println(h[i]);
	}
	
	public static void insertionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j] > arr[i]) {
					int cur = arr[i];
					for(int k=i; k>j; k--)
						arr[k] = arr[k-1];
					arr[j] = cur;
					break;
				}
			}
		}
	}
}

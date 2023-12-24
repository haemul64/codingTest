package lv0;
import java.util.Scanner;

public class 문자열_반복해서_출력하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181950

	public class Solution {
	    public void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        int n = sc.nextInt();
	        
	        for(int i=0; i<n; i++)
	            System.out.print(str);
	    }
	}
}

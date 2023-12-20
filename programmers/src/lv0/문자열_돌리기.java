package lv0;
import java.util.Scanner;

public class 문자열_돌리기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181945

	public class Solution {
	    public void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        
	        for(int i=0; i<a.length(); i++)
	            System.out.println(a.charAt(i));
	    }
	}
}

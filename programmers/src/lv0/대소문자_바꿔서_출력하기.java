package lv0;
import java.util.Scanner;

public class 대소문자_바꿔서_출력하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181949
	
	public class Solution {
	    public void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        String ans = "";
	        
	        for(int i=0; i<a.length(); i++) {
	            if(Character.isLowerCase(a.charAt(i)))
	                ans += Character.toUpperCase(a.charAt(i));
	            else
	                ans += Character.toLowerCase(a.charAt(i));
	        }
	        
	        System.out.print(ans);
	    }
	}
}

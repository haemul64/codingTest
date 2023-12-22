package lv0;

public class 문자_리스트를_문자열로_변환하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181941

	class Solution {
	    public String solution(String[] arr) {
	        String answer = "";
	        
	        for(int i=0; i<arr.length; i++) answer+=arr[i];
	        
	        return answer;
	    }
	}
}

// 다른 풀이
//String.join("", arr);
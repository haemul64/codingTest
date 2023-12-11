package lv0;

public class 문자열_바꿔서_찾기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/181864
	}

	class Solution {
	    public int solution(String myString, String pat) {
	        
	        String changed = "";
	        
	        for(int i=0; i<myString.length(); i++) { // 다른 풀이: char[] toCharArray() 메소드 + 확장for문 활용
	            if(myString.charAt(i) == 'A') {
	                changed += "B";
	            } else {
	                changed += "A";
	            }
	        }
	        
	        int answer = changed.contains(pat) ? 1 : 0;
	        return answer;
	    }
	}
	
	// 다른 풀이: String replace(char oldChar, char newChar) 메소드 활용
	// myString.replace("A", "a").replace("B", "A").replace("a", "B");
}

package lv0;

public class 특정한_문자를_대문자로_바꾸기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181873
}

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char alpch = alp.charAt(0);
        
        for(char ch : my_string.toCharArray()) {
            if(ch==alpch) {
                answer += Character.toUpperCase(ch);
            } else {
                answer += ch;
            }
        }
        
        return answer;
    }
}
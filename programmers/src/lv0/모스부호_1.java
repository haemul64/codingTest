package lv0;

public class 모스부호_1 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120838

	class Solution {
	    public String solution(String letter) {
	        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....",
	                          "..",".---","-.-",".-..","--","-.","---",".--.","--.-",
	                          ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	        String[] str = letter.split(" ");
	        String result = "";
	        
	        for(int i=0; i<str.length; i++) {
	            for(int j=0; j<morse.length; j++) {
	                if(str[i].equals(morse[j])) result += (char)(j + 'a');
	            }
	        }
	        
	        return result;
	    }
	}
}

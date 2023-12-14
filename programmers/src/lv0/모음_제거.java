package lv0;

public class 모음_제거 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120849
	}

	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	            
	        for(char ch : my_string.toCharArray()) {
	            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	                continue;
	            answer += ch;
	        }
	        
	        return answer;
	    }
	}
}

// 다른 풀이
// String[] vowels = {"a", "e", "i", "o", "u"};
// for(String vowel : vowels) {
// 	if(my_string.contains(vowel)) {
// 		my_string = my_string.replace(vowel, "");
// 	}
// }

// 다른 풀이 2
// my_string.replaceAll("[aeiou]", "");
package lv0;

public class 간단한_식_계산하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181865

	class Solution {
	    public int solution(String binomial) {
	        String str_a = "";
	        String str_b = "";
	        binomial = binomial.replaceAll(" ", "");
	        char op = binomial.replaceAll("[0-9]", "").charAt(0);
	        
	        int idx = 0;
	        for(int i=0; i<binomial.length(); i++) {
	            if(binomial.charAt(i)==op) {
	                idx++;
	                continue;
	            }
	            if(idx == 0)
	                str_a += binomial.charAt(i);
	            else
	                str_b += binomial.charAt(i);
	        }
	        
	        int a = Integer.parseInt(str_a);
	        int b = Integer.parseInt(str_b);
	        
	        switch(op) {
	            case '+':
	                idx = a + b;
	                break;
	            case '-':
	                idx = a - b;
	                break;
	            case '*':
	                idx = a * b;
	        }
	        
	        return idx;
	    }
	}
}

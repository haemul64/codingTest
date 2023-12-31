package lv0;

public class 코드_처리하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181932
	// +4
	
	class Solution {
	    public String solution(String code) {
	        String ret = "";
	        boolean mode = false;
	        char[] ch = code.toCharArray();
	        
	        for(int i=0; i<ch.length; i++) {
	            if(!mode) {
	                if(i%2==0 && ch[i]!='1') ret += ch[i];
	                else if(ch[i]=='1') mode = !mode;
	            } else {
	                if(i%2==1 && ch[i]!='1') ret += ch[i];
	                else if(ch[i]=='1') mode = !mode;
	            }
	        }
	        
	        if(ret.isEmpty()) return "EMPTY";
	        return ret;
	    }
	}
}

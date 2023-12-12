package lv0;

public class 배열_원소의_길이 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120854
	}

	class Solution {
	    public int[] solution(String[] strlist) {
	        int[] strLen = new int[strlist.length];
	        
	        for(int i=0; i<strlist.length; i++) {
	            strLen[i] = strlist[i].length();
	        }
	        
	        return strLen;
	    }
	}
}

package lv0;

public class 개미_군단 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120837

	class Solution {
	    public int solution(int hp) {
	        int general = hp/5;
	        int soldier = (hp-general*5)/3;
	        int worker = hp-(general*5+soldier*3);
	        return general+soldier+worker;
	    }
	}
}

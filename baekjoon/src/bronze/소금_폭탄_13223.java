package bronze;

import java.io.FileInputStream;
import java.util.Scanner;

public class 소금_폭탄_13223 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		String time1 = sc.nextLine();
		String time2 = sc.nextLine();
		
		Time t1 = new Time(time1.split(":"));
		Time t2 = new Time(time2.split(":"));
		
		Time t = Time.diff(t1, t2);
		
		System.out.printf("%02d:%02d:%02d", t.hour, t.minute, t.second);
	}
}

class Time {
	int hour;
	int minute;
	int second;
	
	Time() {}
	
	Time(String[] time) {
		this.hour = Integer.parseInt(time[0]);
		this.minute = Integer.parseInt(time[1]);
		this.second = Integer.parseInt(time[2]);		
	}
	
	boolean equals(Time t) {
		if(this.hour==t.hour && this.minute==t.minute && this.second==t.second)
			return true;
		return false;
	}
	
	static Time diff(Time t1, Time t2) {
		// t2 - t1
		Time t = new Time();
		
		if(t1.equals(t2)) return new Time(new String[]{"24", "0", "0"});
		
		// second
		if(t1.second <= t2.second) {
			t.second = t2.second - t1.second;
		} else {
			t2.minute--;
			t.second = t2.second + 60 - t1.second;
		}
		
		// minute
		if(t1.minute <= t2.minute) {
			t.minute = t2.minute - t1.minute;
		} else {
			t2.hour--;
			t.minute = t2.minute + 60 - t1.minute;
		}
		
		// hour
		if(t1.hour <= t2.hour) {
			t.hour = t2.hour - t1.hour;
		} else {
			t.hour = t2.hour + 24 - t1.hour;
		}
		
		return t;
	}
}
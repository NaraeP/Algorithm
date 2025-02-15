package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		
		// 아래 방법 외에 한번에 min으로 통일해서 계산하는 것도 빠르겠다!!(다른 분 해답에서 hint)
		hour = hour + (time / 60);
		min = min + (time % 60);
		
		if (min > 59) {
			hour = hour + min / 60;
			min = min % 60;
		}
		
		if (hour > 23) {
			hour = hour % 24;
 		}
		
		System.out.println(hour + " " + min);
	}
}

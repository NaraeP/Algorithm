package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		if (hour < 0 || hour > 24 || min < 0 || min > 59) {
			System.out.println("0 <= H <= 23, 0 <= M <= 59");
			return;
		}

		if (min >= 45) {
			min = min - 45;
		} else {
			hour = (hour == 0) ? 23 : hour - 1;
			min = min + 15;
		}
		
		System.out.println(hour + " " + min);
		
	}
}

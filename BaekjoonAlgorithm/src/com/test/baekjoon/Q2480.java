package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2480 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int param1 = Integer.parseInt(st.nextToken());
		int param2 = Integer.parseInt(st.nextToken());
		int param3 = Integer.parseInt(st.nextToken());
		int result = 0;
		
		if (param1 == param2 && param1 == param3 && param2 == param3) {
			result = 10000 + param1 * 1000;
		} else if (param1 != param2 && param1 != param3 && param2 != param3) {
			if (param1 > param2) {
				result = param1;
			} else {
				result = param2;
			}
			
			if (result < param3) {
				result = param3;
			}
			result = result * 100;
		} else {
			if (param1 == param2 || param1 == param3) {
				result = 1000 + param1 * 100;
			} else if (param2 == param3) {
				result = 1000 + param2 * 100;
			}
		}
		
		System.out.println(result);
	}
	
	
}

package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int result;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			if (result == 0)
				break;
			
			sb.append(result).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}

package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2741 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=n; i++) {
			sb.append(i).append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb.toString());
	}
}

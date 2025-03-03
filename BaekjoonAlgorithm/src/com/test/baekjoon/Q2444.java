package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2444 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 규칙 찾는데 시간 오래 걸림
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++) {
				sb.append(" ");
			}
			for (int k=1; k<=2*i-1; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		for (int i=1; i<=n-1; i++) {
			for (int j=1; j<=i; j++) {
				sb.append(" ");
			}
			for (int k=1; k<=2*(n-i)-1; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}

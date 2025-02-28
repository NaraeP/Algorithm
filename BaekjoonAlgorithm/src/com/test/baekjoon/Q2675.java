package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int r = 0;
		String s = "";
		
		for (int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			r = Integer.parseInt(st.nextToken());
			s = st.nextToken();
			
			for (int j=0; j<s.length(); j++) {
				for (int k=0; k<r; k++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb.toString());
	}
}

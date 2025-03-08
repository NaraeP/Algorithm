package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int result = 1;
		int[] arr = new int[10];
		
		for (int i=0; i<3; i++) {
			result *= Integer.parseInt(br.readLine());
		}
		
		String s = String.valueOf(result);
		
		for (int i=0; i<s.length(); i++) {
//			System.out.println("s: " + s);
//			System.out.println(s.charAt(i) - '0');
			arr[s.charAt(i) - '0'] += 1;
		}
		
		for (int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb.toString());
		
	}
}

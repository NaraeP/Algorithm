package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9086 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			input = br.readLine();
			sb.append(input.charAt(0)).append(input.charAt(input.length() - 1)).append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb.toString());
	}
}

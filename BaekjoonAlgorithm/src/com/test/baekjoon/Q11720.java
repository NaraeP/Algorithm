package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			sum += (int) input.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}

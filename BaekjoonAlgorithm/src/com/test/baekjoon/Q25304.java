package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25304 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		StringTokenizer st;
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		}
		
		if (x == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}

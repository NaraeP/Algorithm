package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {

	public static void main(String[] args) throws IOException {
		/*
		 * 팰린드롬: 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어
		 */
		// Try 2: StringBuilder reverse() method 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		String reverse = sb.append(input).reverse().toString();
		
		if (input.equals(reverse))
			System.out.println(1);
		else
			System.out.println(0);
		
		/*// Try 1: for문 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String reverse = "";
		
		for (int i=input.length()-1; i>=0; i--) {
			reverse += input.charAt(i);
		}
		
		if (input.equals(reverse))
			System.out.println(1);
		else
			System.out.println(0);
		*/
	}
}

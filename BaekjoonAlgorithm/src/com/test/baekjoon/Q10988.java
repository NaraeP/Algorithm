package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {

	public static void main(String[] args) throws IOException {
		/*
		 * 팰린드롬: 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어
		 */
		
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
	}
}

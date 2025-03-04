package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {

	public static void main(String[] args) throws IOException {
		/*
		 * 다시 풀기! > 접근방법 다시 생각!!
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		int[] arr = new int[26]; // 65 ~ 90
		int max = arr[0];
		char ch = ' ';
		
		for (int i=0; i<input.length(); i++) {
			arr[input.charAt(i) - 65] += 1;
		}
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				max = arr[i];
				ch = '?';
			}
		}
		
		System.out.println(ch);
	}
}

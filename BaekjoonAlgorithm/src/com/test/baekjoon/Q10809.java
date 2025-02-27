package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] alphaArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		String s = br.readLine();
		
		for (int i=0; i<alphaArr.length; i++) {
			sb.append(s.indexOf(alphaArr[i])).append(" ");
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb.toString());
	}
}

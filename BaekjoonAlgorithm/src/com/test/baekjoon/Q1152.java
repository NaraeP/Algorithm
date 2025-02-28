package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1152 {

	public static void main(String[] args) throws IOException {
		// Try 2: StringTokenizer의 method 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		System.out.println(st.countTokens());
		
		
		/*// Try 1: 공백이나 엔터쳤을 때 예외 처리 적용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		System.out.println(input.trim().split(" ")[0].length() == 0 ? 0 : input.trim().split(" ").length);
		*/
		
		/* // 아래는 틀린 코드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		System.out.println(input.trim().split(" ").length);
		*/
	}
}

package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] < x) {
				sb.append(arr[i]).append(" ");
			}
		}
		
		// Q. StringBuilder 마지막 문자를 제거하는 방법은?
		// A. deleteCharAt() 메서드: 특정 문자의 위치를 제거 -> StringBuilder 객체의 길이(sb.length() -1)
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb.toString());
		
	}
}

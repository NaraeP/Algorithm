package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10810 {
	public static void main(String[] args) throws IOException {
		/*
		 * 주의! array의 idx가 0이 아닌 1부터("1번 바구니") 시작
		 * 바구니 >> 배열 의미
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken()); // arr.length
		int m = Integer.parseInt(st.nextToken()); // 대입 횟수
		int[] arr = new int[n];
		
		for (int x=0; x<m; x++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int i = Integer.parseInt(st.nextToken()); // arr[i] ~
			int j = Integer.parseInt(st.nextToken()); // ~ arr[j]
			int k = Integer.parseInt(st.nextToken()); // arr[i] = k;
			
			for (;i<=j; i++) { // 1번 바구니 부터
				arr[i-1] = k;
//				System.out.println("arr[" + (i-1) + "]: " + arr[i-1]);
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb.toString());
		
	}
}

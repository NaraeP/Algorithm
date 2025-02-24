package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10813 {

	public static void main(String[] args) throws IOException {
		/*
		 * 바구니: n개 >> arr.length
		 * 바구니는 1 ~ N까지 >> idx는 0이 아닌 1부터 > arr[i-1]
		 * 초기화: arr[1] = 1; arr[2] = 2; >> arr[i-1] = i
		 * 특정 idx의 값들을 바꿔줘야 하니 temp 필요
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int temp = 0;
		
		for (int i=0; i<arr.length; i++) { // 1. 초기화
			arr[i] = i + 1;
		}
		
		for (int x=0; x<m; x++) { // 2. 배열 값 변경
			st = new StringTokenizer(br.readLine(), " ");
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
		}
		
		for (int i=0; i<arr.length; i++) { // 3. 배열 출력
			sb.append(arr[i]).append(" ");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb.toString());
		
	}
}

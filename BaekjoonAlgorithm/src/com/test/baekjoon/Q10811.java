package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10811 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int temp = 0;
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int x=0; x<m; x++) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			for (; i<=j; i++, j--) {
				temp = arr[i-1];
				arr[i-1] = arr[j-1];
				arr[j-1] = temp; 
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
			
			if (i != arr.length - 1)
				sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}
}

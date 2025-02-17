package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// String to int 형변환에 '0' char 아스키코드 사용 >> n이 10 이상일경우 사용 불가! 하지않나?
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int idx = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 다음번에는 아래 로직은 for문안에 같이 사용해서 써보자!
		while (st.hasMoreTokens()) {
			arr[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			max = (arr[i] > max) ? arr[i] : max;
			min = (arr[i] < min) ? arr[i] : min;
		}
		
		System.out.println(min + " " + max);
		
	}
}

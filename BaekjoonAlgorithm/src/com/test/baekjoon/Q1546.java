package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 필요한 것: 최대값, 점수들
		 * 상대 오차
		 * 	- float: 오차범위 10⁻⁷ 까지 가능
		 * 	- double: 오차범위 10⁻¹⁵ 까지 가능
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double max = 0;
		double[] arr = new double[n];
		double sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i=0; i<arr.length; i++) {
			if (i == 0)
				max = arr[i];
			
			arr[i] = Integer.parseInt(st.nextToken());
			
			if (arr[i] > max)
				max = arr[i];
		}
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = arr[i] / max * 100;
		}
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum / n);
		
	}
}

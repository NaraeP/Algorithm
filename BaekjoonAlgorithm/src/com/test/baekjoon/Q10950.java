package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int a, b;
		int[] resultArr = new int[num];
		
		for (int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			resultArr[i] = a + b;
		}
		
		for (int i=0; i<resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
		
	}
}

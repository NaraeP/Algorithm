package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10807 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());
		int idx = 0;
		int cnt = 0;
		
		while (st.hasMoreTokens()) {
			arr[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == v)
				cnt++;
		}
		
		System.out.println(cnt);
	}
}

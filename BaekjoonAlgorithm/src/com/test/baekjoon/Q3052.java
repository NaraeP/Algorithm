package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int cnt = 1;
		
		for (int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		
		for (int i=0; i<10; i++) {
			for (int j=i+1; j<10; j++) {
				if (arr[i] != arr[j])
						cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}

package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max, n;
		
		for (int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		max = arr[0];
		n = 1;
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
				n = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(n);
		
		
		
		/*
		// 틀린 코드 > 바보!! 처음 n 초기화할 때는 idx + 1 안해줘서 틀리다니!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max, n;
		
		for (int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		max = arr[0];
		n = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				n = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(n);
		*/
	}
}

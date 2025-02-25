package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[30]; // default initial value: false
		int n = 0;
		int flag = 1;
		
		for (int i=0; i<28; i++) {
			n = Integer.parseInt(br.readLine());
			arr[n - 1] = true; // 1 ~ 30 > 0 ~ 29 (-1)
		}
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == false && flag < 3) {
				System.out.println(i + 1);
				flag++;
			}
		}
	}
}

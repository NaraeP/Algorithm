package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
//			System.lineSeparator();
			System.out.println();
//			System.out.print("\n");
			
		}
	}
}

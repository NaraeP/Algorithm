package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25314 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String result = "";
		
		for (int i=0; i<n; i=i+4) {
			result += "long ";
		}
		
		System.out.println(result + "int");
	}
}

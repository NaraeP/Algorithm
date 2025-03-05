package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27323 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 직사각형의 넓이 = 가로 X 세로
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a * b);
	}

}

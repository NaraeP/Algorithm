package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Baekjoon Q2588
		// import 단축키: Ctrl + Shift + O
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int param1 = Integer.parseInt(br.readLine());
		int param2 = Integer.parseInt(br.readLine());
		
		int quotient = param2;
		int remainder = 0;
		
		for (int i=0; i<3; i++)
		{
			remainder = quotient % 10;
			quotient = quotient/ 10;
			System.out.println(param1 * remainder);
		}
		
		System.out.println(param1 * param2);
	}
}
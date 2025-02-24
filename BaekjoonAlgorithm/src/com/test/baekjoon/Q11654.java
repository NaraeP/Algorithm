package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11654 {

	public static void main(String[] args) throws IOException {
		// Get the ASCII Value of a Character in Java
		// (int) charValue <-> (char) intValue
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		System.out.println((int) input.charAt(0));
	}
}

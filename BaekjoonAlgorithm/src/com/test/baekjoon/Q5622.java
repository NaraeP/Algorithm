package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {

	public static void main(String[] args) throws IOException {
		
		// Try 2: ASCII CODE 사용(A: 65 ~ Z: 90)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int c;
		int sum = 0;
		
		for (int i=0; i<input.length(); i++) {
			c = input.charAt(i);
			
			if (c < 68) sum += 3;
			else if (c < 71) sum += 4;
			else if (c < 74) sum += 5;
			else if (c < 77) sum += 6;
			else if (c < 80) sum += 7;
			else if (c < 84) sum += 8;
			else if (c < 87) sum += 9;
			else sum += 10;
			
		}
		
		System.out.println(sum);
		
		// Try 1: switch로 알파벳 조건 걸기
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int sec = 0;
		int sum = 0;
		
		for (int i=0; i<input.length(); i++) {
			
			switch(input.charAt(i)) {
				case 'A':
				case 'B':
				case 'C':
					sec = 3;
				break;
				
				case 'D':
				case 'E':
				case 'F':
					sec = 4;
				break;
				
				case 'G':
				case 'H':
				case 'I':
					sec = 5;
				break;
					
				case 'J':
				case 'K':
				case 'L':
					sec = 6;
				break;
				
				case 'M':
				case 'N':
				case 'O':
					sec = 7;
				break;
				
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
					sec = 8;
				break;
				
				case 'T':
				case 'U':
				case 'V':
					sec = 9;
				break;
				
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					sec = 10;
				break;
			}
			
			sum += sec;
//			System.out.println("sum: " + sum + ", sec: " + sec);
			
		}
		
		System.out.println(sum);
		*/
	}
}

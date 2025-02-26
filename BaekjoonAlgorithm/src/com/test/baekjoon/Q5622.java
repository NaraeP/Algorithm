package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {

	public static void main(String[] args) throws IOException {
		/*
		 *  1 2 3 4 5 6 7 8 9 0
		 *  >> +1초씩 추가
		 *  배열의 idx에 초를 넣고 입력문자를 if절로 구분해서 계산해보자
		 */
		
		// Try 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// Try 1
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

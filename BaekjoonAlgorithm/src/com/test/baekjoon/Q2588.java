package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q2588 {

	public static void main(String[] args) throws IOException {
		//Baekjoon Q2588
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		for (int i=a.length()-1; i>0; i--) {
			
			int c = Integer.parseInt(a.substring(i, i+1));
			
			for (int j=b.length()-1; j>0; j--) {
				
				int d = Integer.parseInt(b.substring(i, i+1));
				
				System.out.println(c * d);
			}
		}
		
		System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
		
	}
}

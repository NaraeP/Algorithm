package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2908 {

	public static void main(String[] args) throws IOException {
		/*
		 * 앗! 나머지를 활용하면 int형으로 바로 처리 가능하다! > reverse 만드는 function을 이용해도 됨.
		 * 혹은 StringBuilder의 reverse를 활용해도 된다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String temp = "";
		String x = st.nextToken();
		String y = st.nextToken();
		
		for (int i=x.length()-1; i>=0; i--) {
			temp += x.charAt(i);
		}
		
		x = temp;
		temp = "";
		
		for (int i=y.length()-1; i>=0; i--) {
			temp += y.charAt(i);
		}
		y = temp;
		
		System.out.println(Integer.parseInt(x) > Integer.parseInt(y) ? x : y);
		
	}
}

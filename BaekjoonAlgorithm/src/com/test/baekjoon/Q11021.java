package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// ver.2 StringBuilder 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			
			sb.append("Case #").append(i + 1).append(": ").append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
		}
		
		System.out.println(sb.toString());
		
		/*// ver.2 참고 소스
			import java.io.BufferedReader;
			import java.io.InputStreamReader;
			import java.io.IOException;
			import java.util.StringTokenizer;
			
			
			public class Main { 
			    public static void main(String args[]) throws IOException {
			        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			        int n = Integer.parseInt(br.readLine());
			        
			        StringTokenizer st;
			        StringBuilder sb = new StringBuilder();
			        for (int i = 0; i < n; i++) {
			            st = new StringTokenizer(br.readLine(), " ");
			            sb.append("Case #" + (i + 1) + ": ");
			            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			            sb.append('\n');
			        }
			        br.close();
			        
			        System.out.println(sb);
			    }
			}
		 */
		
		
		/* // ver.1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int a, b;
		int[] resultArr = new int[t];
		
		for (int i=0; i<t; i++) {
			
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			resultArr[i] = a + b;
		}
		
		for (int i=0; i<resultArr.length; i++) {
			System.out.println("Case #" + (i + 1) + ": " + resultArr[i]);
		}
		*/
		
	}
}

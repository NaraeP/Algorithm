package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10951 {

	public static void main(String[] args) throws IOException {
		// EOF 란?
		// - End of File
		// - 더이상 읽을 수 있는 데이터가 없음
		// 무한 루프를 도는 것이 아니라, 파일의 끝이면 프로그램을 종료시키는 것.
		// * 백준은 입력 자체가 파일로 들어오기 때문에 != null로 EOF 정상 처리 가능. 단, IDE에서는 입력의 끝을 알 수 없으므로 프로그램 종료 불가.
		// * IDE 에서 종료도 처리하고 싶다면 != null && isEmpty()로 체크한다.
		
		// 읽을 라인이 없다면(null 이라면) 끝나는 코드 (charAt 사용)
		// - 한자리수 정수만 입력 받음
		// - charAt()의 return값: 해당 문자의 아스키코드 값 반환
		// - 따라서 정수 형태로 변경하려면 -48 또는 -'0'(48)을 해줘야 함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while ((input = br.readLine()) != null) {
			int a = input.charAt(0) - '0';
			int b = input.charAt(2) - '0';
			sb.append(a + b).append("\n");
		}
		
		System.out.println(sb.toString());
		
		/*
		// 읽을 라인이 없다면(null 이라면) 끝나는 코드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while ((input = br.readLine()) != null) {
			st = new StringTokenizer(input, " "); // 아! String을 StringTOkenizer에 인자로 넣을 수 있으니까 바로 br.readLine()이 아니라 String 넣어도되지!
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
		}
		
		System.out.println(sb.toString());
		*/
		
		// 아래는 런타임 에러(NullPointer) 코드
//		while ((st = new StringTokenizer(br.readLine())) != null) {
//			System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
//		}
		
		// 아래는 무한 루프 코드
//		while (true) {
//			st = new StringTokenizer(br.readLine());
//			
//			System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
//		}
		
	}
}

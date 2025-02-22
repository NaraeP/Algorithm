package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3052 {

	public static void main(String[] args) throws IOException {
		// 접근 방법 시도 1
		// array를 돌며 arr[0]이 자기 자신을 제외한 arr[1] ~ arr[length-1]까지 하나하나 비교하며 같으면 +1 추가
		// arr.length - 같은 수 cnt 한 것을 뺀다.
		// >> 잘못됨: arr[2]와 arr[8]의 값이 같은 경우 체크 못함
		
		// 접근 방법 시도 2
		// array를 돌며 arr[i]가 arr[i+1] ~ arr[length-1]까지 하나하나 값을 비교하며 동일한 값이면 +1
		// arr.length - 같은수 cnt 한 것을 뺀다.
		
		// 접근 방법 시도 3
		// 일단 중복 불가한 자료구조에 담고 배열로 푸는 방법을 찾아보자. ㅠㅠ
		/*// HashSet 활용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for (int i=0; i<10; i++) {
			hash.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(hash.size());
		*/
		
		// 접근 방법 시도 4
		// 42로 나눈 나머지는 0~41 총 42개 > 배열의 length를 42로 생성해서
		// 나머지가 해당 값이면 해당 칸에 값을 true로 지정
		// 마지막에 총 true 개수 세기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		boolean[] temp = new boolean[42]; // boolean array의 초기값: false
		int cnt = 0;
		
		for (int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			temp[arr[i] % 42] = true;
		}
		
		for (int i=0; i<temp.length; i++) {
			if (temp[i] == true)
				cnt++;
		}
		
		System.out.println(cnt);
		
		/*// 틀린 코드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int cnt = 0;
		
		for (int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) { // 마지막 idx는 실행조건에 들어오지 않아서 실행 X
				if (arr[i] == arr[j])
					cnt++;
			}
		}
		
		System.out.println(arr.length - cnt);
		*/
	}
}

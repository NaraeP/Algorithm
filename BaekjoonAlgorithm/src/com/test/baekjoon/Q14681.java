package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14681 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		if (x < -1000 || x > 1000 || x == 0) {
			System.out.println("-1000 <= x <= 1000; x != 0");
			return;
		}
		
		int y = Integer.parseInt(br.readLine());
		
		if (y < -1000 || y > 1000 || y == 0) {
			System.out.println("-1000 <= y <= 1000; y != 0");
			return;
		}
		
		int quadrant;
		
		if (x > 0 && y > 0) {
			quadrant = 1;
		} else if (x > 0 && y < 0) {
			quadrant = 4;
		} else if (x < 0 && y > 0) {
			quadrant = 2;
		} else { // 여기 x < 0 &&& y < 0 다 들어오겠징?
			quadrant = 3;
		}
		
		System.out.println(quadrant);
		
	}
}

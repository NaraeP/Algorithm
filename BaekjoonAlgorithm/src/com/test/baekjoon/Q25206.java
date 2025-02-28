package com.test.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25206 {

	public static void main(String[] args) throws IOException {
		/*
		 * 전공평점 = 전공과목별 (학점 X 과목평점)의 합 / 학점의 총합
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String subject = "";
		double score = 0;
		String grade = "";
		double subjectSum = 0;
		double scoreSum = 0;
		double gradeAvg = 0;
		
		for (int i=0; i<20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			subject = st.nextToken();
			score = Double.parseDouble(st.nextToken());
			grade = st.nextToken();
			
			if (grade.equals("A+")) gradeAvg = 4.5;
			else if (grade.equals("A0")) gradeAvg = 4.0;
			else if (grade.equals("B+")) gradeAvg = 3.5;
			else if (grade.equals("B0")) gradeAvg = 3.0;
			else if (grade.equals("C+")) gradeAvg = 2.5;
			else if (grade.equals("C0")) gradeAvg = 2.0;
			else if (grade.equals("D+")) gradeAvg = 1.5;
			else if (grade.equals("D0")) gradeAvg = 1.0;
			else if (grade.equals("F")) gradeAvg = 0.0;
			else if (grade.equals("P")) continue;
			
			subjectSum += score * gradeAvg;
			scoreSum += score;
		}
		
		System.out.println(subjectSum / scoreSum);
		
	}
}

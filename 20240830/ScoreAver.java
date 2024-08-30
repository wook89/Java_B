package javaB0830;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScoreAver {
	
	public static void main(String[] args) {
		int numStudent = getNumberKeyboard("학생 수 : ");
		int[] scores = getScoresLine(numStudent);
		printSumAverage(scores);
	}
	public static void printSumAverage(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println(">>합계 : "+sum);
		System.out.println(">>평균 : "+sum/scores.length);
	}
	private static int[] getScoresLine(int numStudent) {
		Scanner sc = new Scanner(System.in);
		System.out.print(numStudent+"명의 성적 : ");
		StringTokenizer str = new StringTokenizer(sc.nextLine()," ");
		int[] studentArr = new int[numStudent];
		for(int i=0;i<numStudent;i++) {
			studentArr[i] = Integer.parseInt(str.nextToken());
		}
		return studentArr;
	}
	public static int getNumberKeyboard(String message) {
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		return result;
	}
	public static int getNumberKeyboard() {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		return result;
	}
}

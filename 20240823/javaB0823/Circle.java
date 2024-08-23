package javaB0823;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		final double pi = 3.14; 
		double r = inputNumber("원의 반지름을 입력하세요(cm) : ");
		System.out.printf("원의 넓이는 %.2fcm입니다.",pi*r*r);
	}
	private static double inputNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		double n=0;
		try {
			return n = sc.nextDouble();
		} catch (Exception e) {
			
			return inputNumber(message);
		}
	}
}

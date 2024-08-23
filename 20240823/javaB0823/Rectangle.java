package javaB0823;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		double width = inputNumber("직사각형의 가로 길이 : ");
		double height = inputNumber("직사각형의 세로 길이 : ");
		double result = width*height;
		System.out.printf("직사각형의 넓이는 %.1fcm입니다.",result);
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

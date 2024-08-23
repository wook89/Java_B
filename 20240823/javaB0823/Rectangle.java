package javaB0823;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("직사각형의 가로 길이 : ");
		double width = sc.nextDouble();
		System.out.println("직사각형의 세로 길이 : ");
		double height = sc.nextDouble();
		double result = width*height;
		System.out.printf("직사각형의 넓이는 %.1fcm입니다.",result);
	}
}

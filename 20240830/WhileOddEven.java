package javaB0830;

import java.util.Scanner;

public class WhileOddEven {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		do {
		int num = inputNum("숫자를 입력하세요 : ");
		oddEven(num);
		System.out.print("계속 하시겠습니까?(0-멈춤 / 1-계속) : ");
		
		}while(sc.nextInt() == 1);
	}

	public static void oddEven(int num) {
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	public static int inputNum(String message) {
		System.out.println(message);
		int result = sc.nextInt();
		return result;
	}
}

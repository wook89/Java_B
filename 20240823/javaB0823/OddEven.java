package javaB0823;

import java.io.IOException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) throws IOException {
		int r = inputNumber("정수를 입력하세요.");
		if(r%2 ==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	
	private static int inputNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		int n=0;
		try {
			return n = sc.nextInt();
		} catch (Exception e) {
			
			return inputNumber(message);
		}
	}
}



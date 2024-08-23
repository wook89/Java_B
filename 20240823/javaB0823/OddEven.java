package javaB0823;

import java.io.IOException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) throws IOException {
		OddOrEven();
	}

	private static void OddOrEven() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		try {
			int n = sc.nextInt();
			if(n%2 ==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		} catch (Exception e) {
			System.out.println("정수값만 입력하세요.");
			OddOrEven();
		}
	}
}



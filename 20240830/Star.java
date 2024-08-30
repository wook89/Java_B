package javaB0830;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		star01(n);
		star02(n);
		star03(n);
		star04(n);
		star05(n);
		star06(n);
	}

	public static void star01(int n) {
		System.out.println("star01");

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void star02(int n) {
		System.out.println("star02");

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void star03(int n) {
		System.out.println("star03");

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void star04(int n) {
		System.out.println("star04");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void star05(int n) {
		System.out.println("star05");

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void star06(int n) {
		System.out.println("star06");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = n*2-1; j >= i*2-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

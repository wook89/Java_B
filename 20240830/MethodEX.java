package example;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iArr = {1,34,12,5,12,1,32,2};
		System.out.println("배열에 저장된 요소들의 합 : "+getSum01(iArr));
		System.out.println("숫자 입력 : ");
		int n = sc.nextInt();
		System.out.println("입력된 값보다 큰 요소의 갯수 : "+getSum02(iArr,n));
		System.out.println("배열의 요소 역순으로 출력 :"+Arrays.toString(getSum03(iArr)));
		System.out.println("배열의 요소중 가장 큰 숫자 출력 : "+getMax(iArr));
	}

	private static int getSum01(int[] iArr) {
		int result =0;
		for(int i : iArr) {
			result += i;
		}
		return result;
	}
	private static int getSum02(int[] iArr,int n) {
		int cnt = 0;
		for(int i : iArr) {
			if(i > n) cnt++;
		}
		return cnt;
	}
	private static int[] getSum03(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return arr;
	}
	private static int getMax(int[] arr) {
		int max = 0;
		for(int i : arr) {
			if(max < i) max = i; 
		}
		return max;
	}

}

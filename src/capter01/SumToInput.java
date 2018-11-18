package capter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input munber: ");
		int count = scanner.nextInt(); // 엔터치면 키보드 입력 int 반환

		int j = 0;
		for (int i = 1; i <= count; i++) {
			j += i;
		}
		System.out.println("sum:" + j);
		scanner.close();

	}

}

package capter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("loop count: ");
		int count = scanner.nextInt(); // 엔터치면 키보드 입력 int 반환

		for (int i = 0; i < count; i++) {
			System.out.println("hello world");
		}

		scanner.close();

	}

}

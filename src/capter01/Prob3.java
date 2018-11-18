package capter01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요:");
			int number = scanner.nextInt();
			int sum = 0;
			/* 코드를 완성합니다. */
			if (number==0)
				break;
			if (number % 2 == 0) { // 짝수이면
				for (int i = 0; i <= number; i += 2) {
					sum += i;
				}

			}
			else
				for (int i = 1; i <= number; i += 2) {
					sum += i;
				}
			System.out.println("결과 값 : "+ sum);

		}

	}
}

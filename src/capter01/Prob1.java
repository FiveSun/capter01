package capter01;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("수를 입력하시오:");
		int number = scanner.nextInt();

		/* 코드를 완성합니다. */
		if (number % 3 == 0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");

		scanner.close();

	}

}

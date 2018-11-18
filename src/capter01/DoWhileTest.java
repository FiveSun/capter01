package capter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int value = 0;
		
		do {
			System.out.println("숫자를 입력[0=quit]:");
			
			Scanner scanner = new Scanner(System.in);
			value = scanner.nextInt();
			sum = sum + value;
		}while (value != 0);
			
		System.out.println("sum="+ sum);

	}

}

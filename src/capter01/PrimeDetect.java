package capter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner(System.in);
		
		System.out.print("판별할 수 입력:");		//pinrt 는 개행문자('\n') 미포함
		int number = scanner.nextInt();	//엔터치면 키보드 입력 int 반환
		
		boolean isPrime = true;
		// 2의 power승을 해서 출력
		int i=2;
		while( i < number) {
			System.out.println(i);
			if( number % i == 0)
				isPrime = false;
			
			
			i++;
		}
		
		if(isPrime)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
		scanner.close();
	}

}

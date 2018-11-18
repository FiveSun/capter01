package capter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("승수입력:");		//pinrt 는 개행문자('\n') 미포함
		int power = scanner.nextInt();	//엔터치면 키보드 입력 int 반환
		
		
		// 2의 power승을 해서 출력
		int i=0;
		long result = 1;
		while(i<power) {
			result = result * 2;
			
			i++;
		}
		System.out.println(result);
		scanner.close();
	}

}

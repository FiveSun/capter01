package capter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		// 사용자 입력 받아 출력
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();	//엔터치면 키보드 입력 int 반환
		
		int i=0;
		while(i<count) {
			System.out.println("hello world");
			i++;
		}
		
		scanner.close();
	}

}

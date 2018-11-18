package capter01;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("==369게임==");

		for (int i = 1; i < 100; i++) {
			String number = String.valueOf(i);
			int size = number.length();

			boolean in369of10 = false;
			boolean in369of1 = false;
			for (int j = 0; j < size; j++) {

				char c = number.charAt(j);
				if (c == '3' || c == '6' || c == '9') {
					if(j==1)
						in369of10 = true;
					if(j==0)
						in369of1 = true;	
				}
			}
			if (in369of10 || in369of1) {
				System.out.print(i + " ");
				if(in369of10)
					System.out.print("짝");
				if(in369of1)
					System.out.print("짝");
				System.out.print("\n");
			}

		}

	}
}

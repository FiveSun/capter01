package capter01;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println("윤년입니다");
		else
			System.out.println("안윤년입니다");

	}

}

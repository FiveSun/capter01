package capter01;

public class SswitchTest {

	public static void main(String[] args) {
		int month = 1;
		int days = 0;
		
		switch (month) {
		case 1:
			days = 31;
			break;

		default:
			days = 28;
			break;
		}
		System.out.println(month +"월은 days = "+days);

	}

}

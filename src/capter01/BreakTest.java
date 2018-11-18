package capter01;

public class BreakTest {

	public static void main(String[] args) {
		// Break test
		int sum = 0;
		int num = 0;
		while(true) {
			sum += num;
			if(sum > 5000)
				break;
			num++;
		}
		System.out.println("num:" + num + "sum:" + sum);

	}

}

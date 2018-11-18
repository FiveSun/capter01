package capter01;

public class ContinieTest {

	public static void main(String[] args) {
		// 2의 배수이거나 3의 배수를 빼고 출력하기
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			System.out.println(i);
		}

	}

}

package capter01;

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pnum = 1;
		for (int i = 1; i <= 9; i++) {
			pnum = i - 1;
			for (int j = 1; j <= 10; j++) {
				System.out.print(++pnum + " ");
			}
			System.out.println("");
		}

	}

}

package capter01;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 20;
		int a2 = 40;
		int a3 = 80;
		
		int imax=0;
		
		if (a1 >=a2)
			imax = a1;
		else
			imax = a2;
		
		if(imax >= a3)
			System.out.println("Max val = " + imax);
		else
			System.out.println("Max val = " + a3);
	}

}

package capter01;

public class Swap {

	public static void main(String[] args) {
		// swap
		int a = 15;
		int b = 20;
		
		int ibuf = 0;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		ibuf = a;
		a = b;
		b = ibuf;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}

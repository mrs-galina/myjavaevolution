package ifdemo;
/* This is me learning how to use operator if
 good luck for me 
 */
public class ifdemo {
	public static void main(String[] args) {
		int a,b,c;
		a = 2;
		b = 3;
		if(a < b) System.out.println("a is less than b");
		if(a == b) System.out.println("lala");
		// this is something that won't be shown
		System.out.println();
		c = a - b;
		System.out.println("c is -1");
		if(c >= 0) System.out.println("the result of c is negative");
		if(c < 0) System.out.println("the result of c is positive");
		System.out.println();
		c = a - b;
		System.out.println("c is 1");
		if(c >= 0) System.out.println("the result of c is negative");
		if(c < 0) System.out.println("the result of c is negative");
	}

}
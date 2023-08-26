package third;
/* show difference between int and double
 */
public class third {
public static void main(String[] args) {
	int v;
	double x;
	v = 10;
	x = 10.0;
	System.out.println("First v is:" + v);
	System.out.println("First x is:" + x);
	System.out.println();
	v = v / 4;
	x = x / 4;
	System.out.println("v after been divided:" + v);
	System.out.println("x after been divided:" + x);
}
}
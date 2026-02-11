package PST;

public class Poly{

	public static void main(String[] args) {
		int a=10,b=15;
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		System.out.println(modulo(a,b));

			}
public static int sub(int c,int d) {
	return c-d;
}
public static int mul(int c,int d) {
	return c*d;
}
public static int div(int c,int d) {
	return c/d;
}
public static int modulo(int c,int d) {
	return c%d;
}
}

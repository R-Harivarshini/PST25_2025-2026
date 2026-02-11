package PST;

public class Samemethod {

	public static void main(String[] args) {
		int a=5,b=10,c=15;
		
		System.out.println(add(a,b));
		System.out.println(add(a,b,c));

	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
}

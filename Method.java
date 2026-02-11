package PST;

public class Method {

	public static void main(String[] args) {
		ClassA obj1=new ClassA();
		
		ClassB obj2=new ClassB();
		obj2.CSE();

	}

}class ClassA{
	static void  CSE() {
		System.out.println("Hello");
	}
}class ClassB extends ClassA{
	static void CSE() {
		System.out.println("World");
	}

}

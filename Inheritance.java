package PST;

public class Inheritance {

	public static void main(String[] args) {
		ClassE obj3=new ClassE();
		ClassF obj4=new ClassF();
		ClassG obj5=new ClassG();
		obj3.Multilevel();
	}

}
class ClassE{
	static void Multilevel() {
	System.out.println("single");
}
}
class ClassF extends ClassE{
	static void Multilevel() {
	System.out.println("multiple");
	
	}
}
class ClassG extends ClassF{
	static void Multilevel() {
	System.out.println("multilevel");

}
}

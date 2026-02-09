package PST;


public class Dummy {

 public static void main(String[] args) {
     Dummy obj1 = new Dummy();
     obj1.hari();
     obj1.kaviya();

     Cse obj2 = new Cse();
     obj2.devi();
     obj2.arthi();
 }

 public void hari() {
     System.out.println("good girl");
 }


 public void kaviya() {
     System.out.println("bad girl");
 }
}

class Cse {

 
 public void devi() {
     System.out.println("innocent girl");
 }

 
 public void arthi() {
     System.out.println("tealkative girl");
 }
}
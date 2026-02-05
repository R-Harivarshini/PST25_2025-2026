package PST;
import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a P value:");
		int P=sc.nextInt();
		
		System.out.println("Enter a R value:");
		int R=sc.nextInt();
		 
		 System.out.println("Enter a T value:");
		 int T=sc.nextInt();
	   
	    sc.close();
		int SI=(P*R*T)/100;
		System.out.println("SI:"+SI);
	} 

}

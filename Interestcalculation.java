package PST;
import java.util.Scanner;
public class Interestcalculation {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int P=obj.nextInt();
		System.out.println("Enter a number:");
		int R=obj.nextInt();
		System.out.println("Enter a number:");
		 int T=obj.nextInt();
		 System.out.println("Enter a number:");
		
		int SI=(P*R*T)/100;
		System.out.println("SI:"+SI);
	} 
}

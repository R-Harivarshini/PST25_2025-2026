package PST;
import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a number:");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		
		for(int i=1;i<=num/2;i++);
		if(num%num==0) {
		sum+=num;
		}
			
		

if(sum==num && num>0) {
	System.out.println(num+"is a perfect number");
}else {
	System.out.println(num+"is not a perfect number");

}
}
}

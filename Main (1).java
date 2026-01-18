import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int left = 5;

        
        int right = 9;

        if (left > right) {
            System.out.println("Left value is greater than right value");
        } else {
            System.out.println("Left value is not greater than right value");
        }

        sc.close();
    }
}

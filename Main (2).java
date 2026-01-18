import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int left = 5;

        
        int right = 7;

        if (left < right) {
            System.out.println("right value is greater than left value");
        } else {
            System.out.println("right value is not greater than left value");
        }

        sc.close();
    }
}

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // Input numners
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // Print bigger number
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("b > a");
        }

        // Print arithmetic operations
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        
    }
}
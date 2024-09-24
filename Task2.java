import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        // Input strings
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        // Print result
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}

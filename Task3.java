public class Task3 {
    public static void main(String[] args) {
        // Input list
        int[] inputList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Print even numbers
        for (int i : inputList) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

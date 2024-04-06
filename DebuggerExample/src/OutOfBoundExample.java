import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutOfBoundExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum size of the array: ");
        int maxSize = scanner.nextInt();
        
        List<Object> list = new ArrayList<>(maxSize);

        try {
            // Adding elements to the list until the maximum size is reached
            for (int i = 0; i < maxSize; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                list.add(scanner.next());
            }

            // Attempt to add an element when the list is already full
            System.out.print("Enter one more item: ");
            list.add(scanner.next());
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error occurred. Cannot add more elements.");
            e.printStackTrace();
        }
    }
}


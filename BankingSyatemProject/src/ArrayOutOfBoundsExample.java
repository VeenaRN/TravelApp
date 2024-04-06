public class ArrayOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // An array with 5 elements

        // Attempt to access an element outside the array's bounds
        try {
            System.out.println(numbers[30]); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

public class ComplexArrayOutOfBoundsExample {

    public static void main(String[] args) {
        int[] numbers = new int[10]; // An array with 10 elements

        try {
            fillArray(numbers, 0); // Start filling the array from index 0
            System.out.println(numbers[0]); // Attempt to access an index outside the array's bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    private static void fillArray(int[] array, int index) {
        if (index < array.length) {
            array[index] = index * 10; // Fill the array with multiples of 10
            fillArray(array, index + 1); // Recursively fill the next index
        } else {
            // Attempt to access an index outside the array's bounds
            System.out.println(array[index]); // This will cause an ArrayIndexOutOfBoundsException
        }
    }
}

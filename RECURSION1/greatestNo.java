public class greatestNo {

    // Recursive method to find the greatest number in an array
    public static int findGreatest(int[] array, int index, int currentMax) {
        if (index == array.length) {
            return currentMax;
        }

        // Compare the current element with the current maximum
        if (array[index] > currentMax) {
            currentMax = array[index];
        }

        // Recursive call with the next index and updated current maximum
        return findGreatest(array, index + 1, currentMax);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};

        // Start the recursion from the first index (0) and initialize currentMax with the first element
        int result = findGreatest(numbers, 0, numbers[0]);

        System.out.println("The greatest number in the array is: " + result);
    }
}

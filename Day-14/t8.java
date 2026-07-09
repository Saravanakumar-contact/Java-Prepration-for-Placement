public class t8 {
    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 40, 20};

        // Selection Sort (Ascending)
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap after finding the minimum element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Second Largest = " + arr[arr.length - 2]);
    }
}
public class DecendingSquare {
    public static void main(String[] args) {

        int[] arr = {-4, -1, 0, 3, 10};

        int left = 0;
        int right = arr.length - 1;

        int[] result = new int[arr.length];
        int pos = result.length - 1;

        while (left <= right) {

            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }

            pos--;
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
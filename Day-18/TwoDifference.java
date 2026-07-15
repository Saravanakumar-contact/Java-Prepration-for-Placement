public class TwoDifference {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 12};
        int target = 7;

        int left = 0;
        int right = 1;

        while (right < arr.length) {

            int difference = arr[right] - arr[left];

            if (difference == target) {
                System.out.println(arr[left] + " " + arr[right]);
                break;
            } 
            else if (difference < target) {
                right++;
            } 
            else {
                left++;
            }

            // Prevent both pointers from pointing to the same element
            if (left == right) {
                right++;
            }
        }
    }
}
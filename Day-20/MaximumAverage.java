class MaximumAverage {

    public static double maxAverage(int[] arr, int k) {

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxWindow = windowSum;

        // Sliding window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxWindow = Math.max(maxWindow, windowSum);
        }

        return (double) maxWindow / k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(maxAverage(arr, k));
    }
}
class threshold {

    public static int thresholdValue(int[] arr, int k, int thresholdNo) {

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int target = thresholdNo * k;
        int count = 0;

        if (windowSum >= target) {
            count++;
        }

        // Sliding window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];

            if (windowSum >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int thresholdNo = 4;

        System.out.println(thresholdValue(arr, k, thresholdNo));
    }
}
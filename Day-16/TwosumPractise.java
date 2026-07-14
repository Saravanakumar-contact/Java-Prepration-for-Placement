import java.util.Scanner;

public class TwosumPractise {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int[] arr = new int[a];

        // Read array elements
        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;
        int target = 9;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(left + " " + right);
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        s.close();
    }
}
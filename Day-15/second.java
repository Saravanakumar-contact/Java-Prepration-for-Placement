import java.util.ArrayList;
import java.util.Arrays;

public class second {
    public static void main(String[] args) {

        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < s.size(); i++) {

            if (s.get(i) > largest) {
                secondLargest = largest;
                largest = s.get(i);
            }
            else if (s.get(i) > secondLargest && s.get(i) != largest) {
                secondLargest = s.get(i);
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
import java.util.ArrayList;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,4,1));

        for (int i = 0; i < list.size() - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }

        System.out.println(list);
    }
}
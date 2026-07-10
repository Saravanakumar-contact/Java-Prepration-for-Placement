import java.util.ArrayList;
import java.util.Arrays;
public class get {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int last = s.get(s.size() - 1);
        s.remove(s.size() - 1);
        s.add(0, last);
        System.out.println(s);
    }
}
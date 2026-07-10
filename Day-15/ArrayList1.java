import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        for(int i=0;i<s.size();i++){
             System.out.println(s.get(i));

        }    }
}
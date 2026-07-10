import java.util.ArrayList;
import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int total=0;
        for(int i=0;i<s.size()-1;i++){
            total+=s.get(i);
        }
        System.out.println(total);

    }
}

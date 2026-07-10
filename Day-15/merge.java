import java.util.ArrayList;
import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        ArrayList<Integer> s= new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(4,5,6));
        for(int num:a){
            s.add(num);
        }
        System.out.println(s);
    }
}

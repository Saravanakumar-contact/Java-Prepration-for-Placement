import java.util.ArrayList;

public class replaceSet {
    public static void main(String[] args) {
        ArrayList<Integer> s= new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.set(1,5);
        System.out.println(s.get(1));
    }    
}

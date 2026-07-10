import java.util.ArrayList;

public class Remove {
 public static void main(String[] args) {
    ArrayList<Integer> s=new ArrayList<>();
    s.add(10);
    s.add(20);
    s.add(30);
    for (Integer integ : s) {
      System.out.println(integ);   
    }
    s.remove(2);
    System.out.println(s.get(1));
 }   
}

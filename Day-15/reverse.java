import java.util.ArrayList;
import java.util.Arrays;

public class reverse {
   public static void main(String[] args) {
    ArrayList<Integer> s=new ArrayList<>(Arrays.asList(1,2,3,4,5));
    for(int i=s.size()-1;i>=0;i--){
        System.out.println(s.get(i));
    }
     
   } 
}

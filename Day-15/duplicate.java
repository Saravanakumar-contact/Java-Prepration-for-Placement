import java.util.ArrayList;
import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<>(Arrays.asList(1,2,2,3,4,5,5,5,6));
        for(int i=0;i<s.size()-1;i++){
            if(s.get(i)!=s.get(i+1)){
                System.out.print(s.get(i)+ " ");
            }
        }
        System.out.println(s.get(s.size()-1));
    }
}

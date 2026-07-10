import java.util.ArrayList;
import java.util.Arrays;

public class even {
    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        for(int i=0;i<s.size()-1;i++){
            if(s.get(i)%2!=0){
                System.out.println(s.get(i));
            }
        }
    }
}

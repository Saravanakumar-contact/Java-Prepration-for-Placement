import java.util.HashSet;
public class Duplicate {
    public static void main(String[] args) {
        int[] arr={11,1,1,2,3,4,4,5};
        HashSet<Integer> a=new HashSet<>();
        for(int num: arr)
        {
            if(a.contains(num)){
                System.out.print(num+" ");
            }
            a.add(num);
        }
    }
    
}

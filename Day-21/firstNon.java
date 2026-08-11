import java.util.HashMap;
public class firstNon {
    public static void main(String[] args) {
        int[] arr={1,1,1,23,3,4};
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int num:arr){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(a.get(num)==1){
                System.out.println(num);
                return;
            }
        }
        

    }
}

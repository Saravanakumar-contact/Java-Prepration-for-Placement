public class lastoccurance {
 public static void main(String[] args) {
    int[] array={0,1,2,3,4};
    int last=array.length-1;
    for(int i=0;i<array.length;i++){
        if(array[i]==last){
            System.out.println(array[i]);
        }
    }
 }
}
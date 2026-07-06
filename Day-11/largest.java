public class largest {
   public static void main(String[] args) {
    int[] array={1,2,3,4,516,9};
    int max=array[0];
    for(int i=0;i<array.length;i++){
        if (array[i]>max) {
            max=array[i];
        }
    }
    System.out.print(max);
   } 
}

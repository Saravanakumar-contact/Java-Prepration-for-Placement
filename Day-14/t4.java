public class t4 {
   public static void main(String[] args) {
    int[] arr={510,20,30,40,50};
    int average=0;
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    int result=sum/arr.length;
    System.out.println(result);
   } 
}

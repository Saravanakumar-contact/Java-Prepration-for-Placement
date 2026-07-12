public class ZeroEnd {
   public static void main(String[] args) {
    int[] arr={1,0,0,5,10};
    int write=0;
    for(int i=0;i<arr.length;i++){
        if (arr[i]!=0) {
           int temp=arr[i];//1
           arr[i]=arr[write];//0
           arr[write]=temp;//1
           write++; 
        }
    }
    for(int sum:arr){
        System.out.print(sum+" ");
    }
   } 
}

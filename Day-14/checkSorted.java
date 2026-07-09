public class checkSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        boolean result=true;

        for(int i=0;i<arr.length-1;i++){
          if(arr[i]<arr[i+1]){
            result=true;
          }
          else{
            result=false;
            break;
          }
        }
        if(result){
    System.out.println("Sorted");
}
else{
    System.out.println("Not Sorted");
}
    }
    
    
}

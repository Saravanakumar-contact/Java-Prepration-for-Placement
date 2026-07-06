public class maxElementbySelection {
    public static void main(String[] args){
        int arr[]={1,2,4,3,5};
        for(int i=0;i<arr.length-1;i++){
            int MaxIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[MaxIndex]){
                    MaxIndex=j;
                }
                int temp=arr[MaxIndex];
                arr[MaxIndex]=arr[i];
                arr[i]=temp;
            }
         }
        for(int sum:arr){
          System.out.println(sum + " ");
        }
    }
}


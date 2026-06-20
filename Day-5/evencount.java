public class evencount {
    public static void count(int arr[]){
        int counteven=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                counteven+=1;
            }
        }
        System.out.println(counteven);
    }
    public static void main(String[] args) {
        int arr[]={10,20,15,25};
      count(arr);  
    }
    
}

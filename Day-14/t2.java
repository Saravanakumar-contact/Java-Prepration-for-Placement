public class t2 {
    public static void main(String[] args) {
        int[] arr={510,25,8,40,15};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}

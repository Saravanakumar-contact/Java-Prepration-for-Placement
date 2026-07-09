public class t1 {
    public static void main(String[] args) {
        int[] arr={510,25,8,40,15};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

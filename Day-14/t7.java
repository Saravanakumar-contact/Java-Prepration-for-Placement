public class t7 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 7, 8, 13};
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even+=1;
            }
            else{
                odd+=1; 
            }

        }
        System.out.print("Even = "+even+" odd = "+odd);
    }
}

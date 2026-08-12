public class prefixSum{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] prefix=new int[arr.length+1];
        prefix[0]=0;
        for(int i=0;i<arr.length;i++){
            prefix[i+1]=prefix[i]+arr[i];
        }
        for(int num:prefix){
            System.out.print(num+" ");
        }
    }
}
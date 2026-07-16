public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr={2, 3, 1, 2, 4, 3};
        int target=7;
        int left=0;
        int sum=0;
        int minValue=Integer.MAX_VALUE;
        for(int read=0;read<arr.length;read++){
            sum+=arr[read];
        
        while(sum>=target){
            minValue=Math.min(minValue,read-left+1);
            sum-=arr[left];
            left++;
        }
    }
     System.out.println(minValue);
}}

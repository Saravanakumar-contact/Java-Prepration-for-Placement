public class SlidingWindowFIxedVariable {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int MaxWindow=0;
        for(int i=0;i<3;i++){
            MaxWindow+=arr[i];
        }
        int NewWindow=MaxWindow;
        for(int i=k;i<arr.length;i++){
            NewWindow=NewWindow-arr[i-k]+arr[i];
            MaxWindow=Math.max(MaxWindow,NewWindow);
        }
        System.out.println(MaxWindow);
    }
}

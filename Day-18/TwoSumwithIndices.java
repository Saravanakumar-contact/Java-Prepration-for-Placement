public class TwoSumwithIndices {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 8, 11, 15};
        int target = 13;
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(arr[left]+" "+arr[right]);
                break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}

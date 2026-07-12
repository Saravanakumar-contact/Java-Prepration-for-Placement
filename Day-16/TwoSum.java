public class TwoSum{
    public static void main(String[] args) {
        int[] arr={1,3,7,9,13};
        int target=10;
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.print(left+" "+right);
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
public class firstoccurance {
    public static void main(String[] args) {
        int arr[]={1,2,11,1,1,3,4};
        int ocr=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ocr)
                count+=1;
        }
        System.out.println(count);
    }
}

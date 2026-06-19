
    public static void main(String[] args) {
        int[] arr={2,5,8,1,9};
        int largest=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
            largest=arr[i];
            }
        }
        System.out.println(largest);

        int small=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
            small=arr[i];
            }
        }
        System.out.println(small);
    }
    

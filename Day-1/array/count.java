public class count {
    public static void main(String[] args) {
        int[] data={1,2,3,4,5,6};
        int even=0;
        int odd=0;

        for(int i=0 ; i<data.length; i++){
            if(data[i]%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }
            System.out.println(even);
    System.out.println(odd);

    }
}

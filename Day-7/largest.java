public class largest {
    public static void main(String[] args) {
        int[] saro={5,8,2,10,4};
        int max=saro[0];
        for(int i=0;i<saro.length;i++){
            if(saro[i]>max){
                max=saro[i];
            }
        }
        System.out.print(max);
    }
}

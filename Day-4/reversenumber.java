public class reversenumber {
    public static void main(String[] args) {
        int result=0;
        int number=1234;
        while(number!=0){
            int digit=number%10;
            result=result*10+digit;
            number/=10;
        }
        System.out.println(result);
    }
}

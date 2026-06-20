public class armstrong {
    public static void armstrong(int a){
        int temp = a;      // copy for counting
        int original = a;  // copy for Armstrong calculation
        int count = 0;
        int arm = 0;

        while(temp != 0){
            temp /= 10;
            count++;
        }

        while(original != 0){
            int digit = original % 10;
            arm += (int)Math.pow(digit, count);
            original /= 10;
        }

        System.out.println(arm);
    }

    public static void main(String[] args) {
        armstrong(153);
    }
}
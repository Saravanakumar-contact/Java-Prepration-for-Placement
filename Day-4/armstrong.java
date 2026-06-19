import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int original = n;
        int temp = n;
        int count = 0;
        int arm = 0;

        while(temp != 0) {
            temp /= 10;
            count++;
        }

        temp = n;

        while(temp != 0) {
            int digit = temp % 10;
            arm += (int)Math.pow(digit, count);
            temp /= 10;
        }

        if(arm == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}
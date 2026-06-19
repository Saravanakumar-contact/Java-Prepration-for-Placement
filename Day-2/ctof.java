import java.util.Scanner;

public class ctof {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Celsius : ");
        double c =in.nextDouble();
        double result=(c*18)+32;
        System.out.println("Fahrenhiet : " + result);
    }
}
